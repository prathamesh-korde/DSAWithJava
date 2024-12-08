/*ABSTRACTION-
 in Java refers to hiding the implementation details of a code and exposing only the necessary information to the user.
 It provides the ability to simplify complex systems by ignoring irrelevant details and reducing complexity */

 /* in java abstraction is achived in two ways-1)abstract class
                                              2)interfaces(pure abstraction)
ABSTRACT CLASS-
i)an abstract class must be decleared with abstract keyword.
ii)it can have abstract and non-abstract methods.
iii)it can't be instantiated("can't make object of it")
iv)it can have constructors and static methods.
vi)it can have final methods which will force the subclass not to change the body of the method

  */
abstract  class Animal{
    abstract void walk();
    Animal(){
        System.out.println("creating amimal");
    }
    public void eat(){
        System.out.println("Anamils eat");
    }
}
class horse extends Animal{
    horse(){
        System.out.println("creating horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal{
        public void walk(){
            System.out.println("walk on 2 legs");
        }


}
public class j_91Abstraction_class {
    public static void main(String[] args) {
        horse h1=new horse();
        //calling a parent class constructor after it we call child class constructor after creating a object of child class
        // called constructor chaining
        h1.walk();
        h1.eat();
    }
}
