import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RunDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println(123456789f);


        try (
                FileInputStream fileInputStream = new FileInputStream("temp.out");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            TestSerial testSerial = (TestSerial) objectInputStream.readObject();
            System.out.println("version = " + testSerial.version);
        }
    }
}
