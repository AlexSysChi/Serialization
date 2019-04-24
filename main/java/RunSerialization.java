import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RunSerialization {
    public static void main(String[] args) throws IOException {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream("temp.out");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)

        ) {
            TestSerial testSerial = new TestSerial();
            objectOutputStream.writeObject(testSerial);
            objectOutputStream.flush();
        }
    }
}
