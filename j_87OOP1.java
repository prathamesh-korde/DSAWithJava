//class and object in java

class pen {
    String pen_color;
    String type;
    
public void write(){
    System.out.println("write somthing.....!");
}

public void info(){
    System.out.println(this.pen_color);
    System.out.println(this.type);
}
pen(){    //non-parametrised constructor
    System.out.println("constructor is called");
}

pen(String color , String type){  //parametrised constructor
    this.pen_color=color;
    this.type=type;
}
pen(pen p3){ //copy constructor
    this.pen_color=p3.pen_color;
    this.type=p3.type;
}
}

public class j_87OOP1 {
    public static void main(String[] args) {
        pen p1 = new pen("blue","gel");
        //new allocate a memory for object
        //pen() is an special type of function calld constructor-
        /*  1.same name as of class name 
            2.use to construct an object
            3.it don't retun anything and don't have return type not even void
            4.constructors are only called once when object of class is created
            5.automatically invoked when object of class is created*/
            System.out.println("p1 informatation--");
            p1.info();

        pen p2 = new pen();
        p2.pen_color="black";
        p2.type="ballPoint";
        System.out.println("p2 informatation--");
       p2.info();

       pen p3 = new pen(p2);
       System.out.println("p3 informatation--");
       p3.info();
    }

}
