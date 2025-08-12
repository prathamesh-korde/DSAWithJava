
import java.io.FileReader;
import java.io.IOException;

public class fileReadder {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\pratham.txt");
            try {
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char)(i));
                }
            }
            finally{
                r.close();
            }
        }
         catch (IOException e) {
            System.out.println(e);
        }
    }
}
