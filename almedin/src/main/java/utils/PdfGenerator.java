package utils;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import modelsEntities.Recipe;

import java.io.ByteArrayOutputStream;

public class PdfGenerator {

    public static byte[] generatePdf(Recipe recipe) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            com.itextpdf.kernel.pdf.PdfWriter writer = new PdfWriter(baos);
            com.itextpdf.layout.Document document = new Document(new com.itextpdf.kernel.pdf.PdfDocument(writer));

            document.add(new Paragraph("Medical Recipe"));
            document.add(new Paragraph("Shift ID: " + recipe.getShift().getId()));
            document.add(new Paragraph("Shipment Date: " + recipe.getShipmentDate()));
            document.add(new Paragraph("Description:"));
            document.add(new Paragraph(recipe.getDescription()));

            document.close();
            return baos.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Error generating PDF", e);
        }
    }
}
