package AlMedin.utils;

import modelsEntities.Recipe;
import modelsEntities.Shift;
import org.junit.jupiter.api.Test;
import utils.PdfGenerator;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PdfGeneratorTest {

    @Test
    public void testGeneratePdf() {
        // Mock a Recipe object
        Recipe recipe = mock(Recipe.class);
        when(recipe.getShift()).thenReturn(new Shift()); // You need to provide a Shift object here for testing
        when(recipe.getShipmentDate()).thenReturn(LocalDate.parse("2024-06-09T00:00:00"));
        when(recipe.getDescription()).thenReturn("Test description");

        // Call the generatePdf method
        byte[] pdfBytes = PdfGenerator.generatePdf(recipe);

        // Assert that the PDF byte array is not null
        assertNotNull(pdfBytes);
    }
}
