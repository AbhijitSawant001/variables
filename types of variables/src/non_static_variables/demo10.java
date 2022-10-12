package non_static_variables;

public class demo10

{
	static int a=45;
	int b=78;
	public static void main(String[] args) {
		
		
		System.out.println(a);
		
		demo10 d10=new demo10();
		System.out.println(d10.b);
		
	}
}
