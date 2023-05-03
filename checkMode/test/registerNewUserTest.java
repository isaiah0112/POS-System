import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.Assert.assertEquals;



public class registerNewUserTest {

    registerNewUser register = new registerNewUser();

    @Test
    public void testGetNextID() throws IOException {
        // Create temporary test file
        File tempFile = File.createTempFile("test", ".txt");

        // Write some lines to the file
        FileWriter writer = new FileWriter(tempFile);
        writer.write("1,John,1000.0,10,5," + System.lineSeparator());
        writer.write("2,Jane,1500.0,12,8," + System.lineSeparator());
        writer.write("3,Bob,1200.0,8,4," + System.lineSeparator());
        writer.close();

        // Call the method being tested
        int nextID = register.getNextID(tempFile.getAbsolutePath());

        // Assert that the next ID is correct
        assertEquals(4, nextID);
    }


    // Helper method to read the last line of a file
    private static String readLastLine(String filePath) {
        String lastLine = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                lastLine = currentLine;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lastLine;
    }
}
