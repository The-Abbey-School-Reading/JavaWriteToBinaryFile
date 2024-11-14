import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeExample {
    public static void main(String[] args) {
        String filePath = "object.bin";
        Person person = new Person("John", 30);

        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            System.out.println("Object has been serialized to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
