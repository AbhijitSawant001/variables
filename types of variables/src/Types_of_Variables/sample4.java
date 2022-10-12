package Types_of_Variables;

public class sample4 
{	static int a=30;
	public static void main(String[] args) {
		
				
		System.out.println(a);     ///static global variable call from same class
		
		System.out.println(sample5.x);      //static global variable call from different class   className.variableName
		
	}
	
	public void m1()
	{
		int c=30;										//local variable
		System.out.println(a+c);
		
	}
	
	public static void m2()
	{
		int d=90;										//local variable
		System.out.println(a+20+d);
	}
}
