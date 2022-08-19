package practice;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {
	public static void main(String[] args) {
		try {
		String name = "C:\\Users\\Enoch\\Downloads\\itspdf.pdf";
		Document document = new Document();
		
			PdfWriter.getInstance(document,new FileOutputStream(name));
			document.open();
			document.add(new Paragraph("Generate dynamic documents from XML files or databases.\r\n"
					+ "Add bookmarks, page numbers, watermarks, etc.\r\n"
					+ "Split, concatenate and manipulate PDF pages.\r\n"
					+ "Automate filling out PDF forms.\r\n"
					+ "Add digital signatures to a PDF file.\r\n"
					+ "The library contains the number of classes that can be used for different purposes. The most important class of the library is the Document class that belongs to com.itextpdf.text package. It represents the PDF document instance. There is another important class named PdfWriter that writes text into the PDF. It also belongs to the same package.\r\n"
					+ "\r\n"
					+ "Before running the program, download itextpdf-5.5.13.2.jar\r\n"
					+ "file and add it the path (follow step 4) of your project. If you have created a maven project for the same, add the following dependency in the pom.xml file."));
			document.close();
			System.out.println("Your pdf is Created");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
