
import java.io.File;
import java.io.IOException;

public class craeateFile {
    public static void main(String[] args){
        File f= new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\pratham.txt");
        try {
            if(f.createNewFile()){
                System.out.println("file succesfully created");
            }
            else{
                System.out.println("file alradey exist");
            }
            
        } catch (IOException e) {
            System.out.println("exeption handeled succesfully");
        }
       
    }
}
