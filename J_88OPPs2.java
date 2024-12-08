
/*The four pillars of OOPS (object-oriented programming) are-
1.Polymorphism (many-forms)-i)compile time(overloading)
                            ii)run time (overriding)
2.Inheritance
3.Encapsulation  
4.Data Abstraction
*/
//i)compile time(overloading)
/* 1.Changing The Number Of Parameters
 * 2.Changing Data Types Of The Arguments.
  3.Changing The Order Of The Parameters Of Methods
*/
class student{
    String name;
    int age;

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
}

public class J_88OPPs2 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="pratham";
        s1.age=20;
        s1.printInfo(s1.name);

    }
}

