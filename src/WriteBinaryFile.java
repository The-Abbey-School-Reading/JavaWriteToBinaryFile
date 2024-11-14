import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {
    public static void main(String[] args) {
        String filePath = "example.bin";
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Data to write to the file
            byte[] data = {1, 2, 3, 4, 5};

            // Write data to the file
            fos.write(data);

            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
