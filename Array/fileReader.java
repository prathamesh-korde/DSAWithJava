import java.io.File;

public class fileReader {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\pratham.txt");
        File R= new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\prathamesh.txt");
        if(f.exists()){
            System.out.println(f.renameTo(R));
        }
        else{
            System.out.println("file not exit");
        }
    }
}
