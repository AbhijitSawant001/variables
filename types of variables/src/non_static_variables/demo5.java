package non_static_variables;

public class demo5

{
		
	public static void main(String[] args) {
		
	
	demo6 d6=new demo6();
	System.out.println(d6.c);								//non static global variable from same class
	
	System.out.println(demo7.h); 							//static global variable from different class

	}
}
