import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Prathmesh\\OneDrive\\Desktop\\java1\\pratham.txt");
        if(f.exists()){
            System.out.println("File name-"+f.getName());
            System.out.println("File location-"+f.getAbsolutePath());
            System.out.println("File weitable-"+f.canWrite());
            System.out.println("file readable"+f.canRead());
            System.out.println("file size "+f.length());
            System.out.println("file remove "+f.delete());
        }
        else{
            System.out.println("file alradey exist");
        }
    }
}
