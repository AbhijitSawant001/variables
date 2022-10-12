package Types_of_Variables;

public class static_local_and_global_variable
{
	
	static int a=10;						//static global variable

	public static void main(String[] args) {
		
		System.out.println(a);
		s1();								//call from same class 
		sample2 s2=new sample2();
		s2.s2();							//call from different class
		System.out.println(sample2.b);

	}
	public static void  s1()
	{
	
		System.out.println(a+10);
		
	}

}
