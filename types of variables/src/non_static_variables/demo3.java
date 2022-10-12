package non_static_variables;

public class demo3 

{
		
	public static void main(String[] args)
	{
	
		demo2 d4=new demo2();							//object creation to call global variable from different class
		System.out.println(d4.i);    					//calling non static global variable from different class
	}
	
}
