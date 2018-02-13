package com.poc.openhtmltopdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

public class ComplexTemplate {

	public static void main(String[] args) throws Exception {
		File targetFile = new File("src/main/resources/a_complex_template/geo_template.xhtml");
		File arial = new File("src/main/resources/fonts/arial.ttf");
		File openSansBold = new File("src/main/resources/fonts/OpenSans-Bold.ttf");
		File openSansBoldItalic = new File("src/main/resources/fonts/OpenSans-BoldItalic.ttf");
		File openSansExtraBold = new File("src/main/resources/fonts/OpenSans-ExtraBold.ttf");
		File openSansExtraBoldItalic = new File("src/main/resources/fonts/OpenSans-ExtraBoldItalic.ttf");
		File openSansItalic = new File("src/main/resources/fonts/OpenSans-Italic.ttf");
		File openSansLight = new File("src/main/resources/fonts/OpenSans-Light.ttf");
		File openSansLightItalic = new File("src/main/resources/fonts/OpenSans-LightItalic.ttf");
		File openSansRegular = new File("src/main/resources/fonts/OpenSans-Regular.ttf");
		File openSansSemiBold = new File("src/main/resources/fonts/OpenSans-Semibold.ttf");
		File openSansSemiBoldItalic = new File("src/main/resources/fonts/OpenSans-SemiboldItalic.ttf");
		OutputStream os;
		try{
			os = new FileOutputStream("complex.pdf");

			try{
				PdfRendererBuilder builder = new PdfRendererBuilder();
				builder.useFont(arial,"Arial");
				builder.useFont(openSansBold,"Open Sans Bold");
				builder.useFont(openSansBoldItalic,"Open Sans Bold Italic");
				builder.useFont(openSansExtraBold,"Open Sans Extra Bold");
				builder.useFont(openSansExtraBoldItalic,"Open Sans Extra Bold Italic");
				builder.useFont(openSansItalic,"Open Sans Italic");
				builder.useFont(openSansLight,"Open Sans Light");
				builder.useFont(openSansLightItalic,"Open Sans Light Italic");
				builder.useFont(openSansRegular,"Open Sans Regular");
				builder.useFont(openSansSemiBold,"Open Sans Semi Bold");
				builder.useFont(openSansSemiBoldItalic,"Open Sans Semi Bold Italic");
				builder.withFile(targetFile);
				builder.toStream(os);
				builder.run();
			} finally{
				os.close();
			}
		} catch (IOException e1){
			e1.printStackTrace();
		}
	}
}
