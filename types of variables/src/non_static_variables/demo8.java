package non_static_variables;

public class demo8
{
		int g=500;
		
		public static void main(String[] args)
		{
			demo8 d8=new demo8();
			System.out.println(d8.g);
		}
}
