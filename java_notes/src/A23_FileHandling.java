// File Handling
import java.io.*;

public class A23_FileHandling {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is Vibranium's Assistant writing to a file!");
            writer.close();
            System.out.println("Successfully wrote to file.");

            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
