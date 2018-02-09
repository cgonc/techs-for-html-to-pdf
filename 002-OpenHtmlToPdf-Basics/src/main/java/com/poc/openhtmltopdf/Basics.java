package com.poc.openhtmltopdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

public class Basics {

	public static void main(String[] args) throws Exception {
		File targetFile = new File("src/main/resources/basics_with_image/Basics.xhtml");
		File arilFont = new File("src/main/resources/arial.ttf");
		OutputStream os;
		try{
			os = new FileOutputStream("basics.pdf");

			try{
				PdfRendererBuilder builder = new PdfRendererBuilder();
				builder.withFile(targetFile);
				builder.useFont(arilFont,"Arial");
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
