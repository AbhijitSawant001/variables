package Types_of_Variables;

public class sample10 {
		
	static int v=80;
	public static void main(String[] args) {
		
		System.out.println(v);							//static global variable call from same class
		
		System.out.println(sample11.u);					//static global variable call from different class sample 11
		
		System.out.println(sample12.m);					//static global variable call from different class sample 12
	}

}
