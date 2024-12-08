/*The static keyword in Java-
*)The static keyword belongs to the class rather than an instance of the class. 
*)The static keyword is used for a constant variable or a method that is the same for every instance of a class.

The static can be:

i)Variable (also known as a class variable)
--The static variable gets memory only once in the class area at the time of class loading.
ii)Method (also known as a class method)
--A static method can be invoked without the need for creating an instance of a class.
--A static method can access static data member and can change the value of it.

Restrictions for the static method--1.The static method can not use non static data member or call non-static method directly.
                                    2.this and super cannot be used in static context.

iii)Block--
*Is used to initialize the static data member.
*It is executed before the main method at the time of classloading.
iv)Nested class
-- The top level class cannot be static in java, to create a static class we must create a nested class and then make it static.
*)An instance of the static nested class can be created without creating an instance of its outer class.
*)The static and non-static members of an outer class can be accessed by an inner class.
*)The static members of the outer class can be accessed only by the static class.

 */
class Student_info{
    static String school;
    String name;   
 }
 
 
 public class J_93Static {
    public static void main(String args[]) {
        Student_info.school = "JNV";
        Student_info s1 = new Student_info();
        Student_info s2 = new Student_info();
 
 
        s1.name = "Meena";
        s2.name = "Beena";
 
 
        System.out.println(s1.school);
        System.out.println(s2.school);
    }
}
 