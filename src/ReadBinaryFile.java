import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        String filePath = "example.bin";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Buffer to hold the data read from the file
            byte[] buffer = new byte[5];
            
            // Read data from the file
            int bytesRead = fis.read(buffer);
            
            System.out.println("Data read from " + filePath + ":");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(buffer[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}