package Testing;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreatePdfTable {
    public static void main(String[] args) {
//        try {
//            // Create a new PDF document
//            PDDocument document = new PDDocument();
//
//            // Create a new page
//            PDPage page = new PDPage(PDRectangle.A4);
//            document.addPage(page);
//
//            // Create a content stream for the page
//            PDPageContentStream contentStream = new PDPageContentStream(document, page);
//
//            // Define the table parameters
//            float margin = 50;
//            float yStart = page.getMediaBox().getHeight() - margin;
//            float tableWidth = page.getMediaBox().getWidth() - 2 * margin;
//            float yPosition = yStart;
//            int rows = 5;
//            int cols = 3;
//            float rowHeight = 20f;
//            float tableHeight = rowHeight * rows;
//            float tableYBottom = yStart - tableHeight;
//
//            // Create a table content stream
//            contentStream.setLineWidth(1f); // Set line width
//            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
//            float yPositionNew = yPosition;
//            for (int row = 0; row < rows; row++) {
//                yPositionNew = yPosition - row * rowHeight;
//                contentStream.moveTo(margin, yPositionNew);
//                contentStream.lineTo(margin + tableWidth, yPositionNew);
//                contentStream.stroke();
//            }
//
//            for (int col = 0; col <= cols; col++) {
//                float xPosition = margin + col * tableWidth / cols;
//                contentStream.moveTo(xPosition, yPosition);
//                contentStream.lineTo(xPosition, tableYBottom);
//                contentStream.stroke();
//            }
//
//            // Add table headers
//            float tableXStart = margin;
//            float tableYStart = yPosition;
//            String[] headers = { "Header 1", "Header 2", "Header 3" };
//            for (int col = 0; col < cols; col++) {
//                String header = headers[col];
//                float colWidth = tableWidth / (float) cols;
//                float xPosition = tableXStart + col * colWidth + colWidth / 2;
//                float yPositionHeader = tableYStart - 15;
//                contentStream.beginText();
//                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
//                contentStream.newLineAtOffset(xPosition, yPositionHeader);
//                contentStream.showText(header);
//                contentStream.endText();
//            }
//
//            // Add table content
//            String[][] content = { { "Row 1, Col 1", "Row 1, Col 2", "Row 1, Col 3" },
//                    { "Row 2, Col 1", "Row 2, Col 2", "Row 2, Col 3" },
//                    { "Row 3, Col 1", "Row 3, Col 2", "Row 3, Col 3" },
//                    { "Row 4, Col 1", "Row 4, Col 2", "Row 4, Col 3" },
//                    { "Row 5, Col 1", "Row 5, Col 2", "Row 5, Col 3" } };
//            float tableYPosition = yPosition;
//            for (int row = 0; row < rows; row++) {
//                tableYPosition -= rowHeight;
//                float nextyPosition = tableYPosition;
//                for (int col = 0; col < cols; col++) {
//                    String cell = content[row][col];
//                    float colWidth = tableWidth / (float) cols;
//                    float xPosition = tableXStart + col * colWidth + 2;
//                    contentStream.beginText();
//                    contentStream.setFont(PDType1Font.HELVETICA, 12);
//                    contentStream.newLineAtOffset(xPosition, nextyPosition);
//                    contentStream.showText(cell);
//                    contentStream.endText();
//                }
//            }
//
//            // Close the content stream
//            contentStream.close();
//
//            // Save the document to a file
//            document.save("table_example.pdf");
//
//            // Close the document
//            document.close();
//
//            System.out.println("Table created successfully!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
