package non_static_variables;

public class demo11 

{
	public static void main(String[] args) {
		
		System.out.println(demo12.n);
		demo12 d12=new demo12();
		System.out.println(d12.m);
	}
	
}
