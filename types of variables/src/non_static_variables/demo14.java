package non_static_variables;

public class demo14 {
	
	static int h=200;

	public static void main(String[] args) {
		
		demo15 d15=new demo15();
		System.out.println("ADDITION="+(d15.g+demo15.f+h));

	}
	public void m1()
	{
		demo15 d15=new demo15();
		System.out.println("ADDITION="+(d15.g+demo15.f+h));
	}
}
