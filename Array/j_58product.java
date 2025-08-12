class Product{
	public int Prod(int a, int b, int c) 
	{ 
		return a * b * c;
	} 
	public double Prod(double a, double b, double c) 
	{  
		return a * b * c; 
	} 
	public int prob(int x,int y){
		return x*y;
	}
	public double prob(int x,double y){
		return x*y;
	}
	public double prob(double  x,int y){
		return x*y;
	}
} 
class GFG { 
	public static void main(String[] args) 
	{ 
		Product obj = new Product(); 
		//Changing the Number of Parameters
		System.out.println( "Product of the three integer value :" +  obj.Prod(1, 2, 3)); 
		System.out.println("product  of two numbers"+obj.prob(1,2));
		//Changing Data Types of the Arguments.
		System.out.println( "Product of the three double value :" + obj.Prod(1.0, 2.0, 3.0)); 
		//Changing the Order of the Parameters of Methods
		System.out.println("product  of two numbers"+obj.prob(2,3.0));
		System.out.println("product  of two numbers"+obj.prob(3.0,3));	
	} 
}
