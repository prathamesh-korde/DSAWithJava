

/*interfaces(pure abstraction)-
 i)all the filds in interface are public static and final by defalt.
 ii)all the methods are public and abstract by default
 iii)a class the implements an interface must implements all the methods decleared in the interface
 iv)it support the functionlity of multiple inheritance.
 */
interface animal{
    void walk();
}
interface Herbivore {
    void eat();

}

class horse implements animal,Herbivore{ //multiple inheritence
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    public void eat(){
        System.out.println("eat only plants");
    }
}
public class J_92Abstraction_interface{
    public static void main(String[] args) {
        horse h2 = new horse();
        h2.walk();
        h2.eat();
    }
}

 
