
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\pratham.txt");
            BufferedWriter buff = new BufferedWriter(f);
            try {
                buff.write("java");
                buff.write(66);
            }
            finally{
                buff.close();
            }
             System.out.println("file woroten succesfully");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}
