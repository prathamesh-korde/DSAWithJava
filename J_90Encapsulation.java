//A Java package-
// is a set of classes, interfaces, and sub-packages that are similar. In Java, it divides packages into two types: built-in packages and user-defined packages.

/*access specifiers -
(also known as access modifiers) control the visibility and accessibility of classes, methods, and variables.
Here's a breakdown of the four access specifiers in Java:-

i)Public: Accessible from any class in the same or different package.

ii)Protected: Accessible from within the same class, subclasses, and classes in the same package.

iii)Default (package-private): Accessible from within the same package only (no explicit keyword used).

iv)Private: Accessible only from within the same class.
 */

/*ENCAPULATION-

Encapsulation in Java is a fundamental principle of object-oriented programming that involves bundling data (variables) and the methods that operate on that data within a single unit, known as a class. This concept helps in:
i)Data Hiding:
Restricting direct access to the internal state of an object. This is achieved by declaring the class variables as private.

ii)Controlled Access:
Providing controlled access to the data through public methods (getters and setters). 

Benefits of Encapsulation:

1.Improved Security: Prevents unauthorized access and modification of data.

2.Code Maintainability: Makes code easier to modify and maintain, as changes to the internal implementation don't affect the code that uses the class.

3.Modularity: Promotes modularity in the code, making it easier to understand and reuse. */

class account{
   public  String name;
   protected  String email;
   private String password;
   //can't access private things so we use the concept of getters and setters are also known as accessors and mutators,respectivelly
   public String getPassword(){
    return this.password;
   }
   public void setPassword(String newPassword){
    this.password=newPassword;
   }

}

public class J_90Encapsulation {
    public static void main(String[] args) {
        account a1 = new account();
        a1.name="partahmesh";
        a1.email="kordeprathamesh01@gmail.com";
        a1.setPassword("Prathamesh0123");
        System.out.println(a1.getPassword());

    }
    
}
