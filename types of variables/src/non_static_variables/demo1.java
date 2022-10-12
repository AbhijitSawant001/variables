package non_static_variables;

public class demo1 

{
	int a=30;													//non Static global Variable
	public static void main(String[] args) {
		demo1 d1=new demo1();									//objectCreation to call non static variable
		
		//demo1 d2=new demo1();									//objectCreation to call non static method m1							
		
		System.out.println(d1.a);								//objectName.nonStaticVariableName
		
		m1();
	
	}
	
	public static void m1() 											//non static method
	{
		
		int b=200;												//local variable
		System.out.println(b);
		
	}
}
