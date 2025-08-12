/*2.Inheritance ("in the form of classes")-
                i)single level Inheritance
                ii)multi-Level Inheritance
                iii)hierarchial Inheritance
                iv)hybrid Inheritance("it's not possible to implement "pure" hybrid inheritance using only classes.")
                
*/

// Base class A
class A {
    void displayA() {
        System.out.println("Class A method");
    }
}

// Class B inherits from class A
class B extends A {
    void displayB() {
        System.out.println("Class B method");
    }
}

// Class C inherits from class A
class C extends A {
    void displayC() {
        System.out.println("Class C method");
    }
}

// Class D inherits from both B and C functionality through A, but only through a single class hierarchy
class D extends B {
    void displayD() {
        System.out.println("Class D method");
    }
}

public class J_89Inheritance{
    public static void main(String[] args) {
        D obj = new D();
        obj.displayA(); // Class A method
        obj.displayB(); // Class B method
        obj.displayD(); // Class D method
        
        // Notice we don't have direct access to C's methods in class D
        // because multiple inheritance through classes is not supported
    }
}
