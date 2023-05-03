import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.io.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

public class managerModeTest {
    managerMode manager = new managerMode();
    checkMode check = new checkMode();
    

    @Test
    public void testDeleteExistingEmployee() throws IOException {
        // Create a temporary file
        File inputFile = File.createTempFile("testInput", ".txt");
        inputFile.deleteOnExit();

        // Write some test data to the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
        writer.write("Alice,123 Main St,555-1234\n");
        writer.write("Bob,456 Oak Ave,555-5678\n");
        writer.close();

        // Delete an existing employee from the file
        manager.deleteEmployee(inputFile.getAbsolutePath(), "Alice");

        // Check that the employee was deleted
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (line.contains("Alice")) {
                found = true;
                break;
            }
        }
        assertFalse(found);
        reader.close();
    }

    // Test deleting a non-existing employee from a file
    @Test
    public void testDeleteNonExistingEmployee() throws IOException {
        // Create a temporary file
        File inputFile = File.createTempFile("testInput", ".txt");
        inputFile.deleteOnExit();

        // Write some test data to the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
        writer.write("Alice,123 Main St,555-1234\n");
        writer.write("Bob,456 Oak Ave,555-5678\n");
        writer.close();

        // Delete a non-existing employee from the file
        manager.deleteEmployee(inputFile.getAbsolutePath(), "Charlie");

        // Check that the file was not modified
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        boolean found = false;
        while ((line = reader.readLine()) != null) {
            if (line.contains("Charlie")) {
                found = true;
                break;
            }
        }
        assertFalse(found);
        reader.close();
    }
   
}