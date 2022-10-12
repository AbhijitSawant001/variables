package non_static_variables;

public class demo13 {
	
	static int a=500;
	
	int b=40;

	public static void main(String[] args) 
	{
		demo13 d13=new demo13();
		System.out.println("ADDITION=" +(a+d13.b));
			

	}

}
