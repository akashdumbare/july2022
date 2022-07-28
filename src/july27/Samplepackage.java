package july27;

public class Samplepackage 
{
	int a;
	int b=20;
	static int c;
	static int d=40;
	public void nonstaticmethod()
	{
		int p=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void staticmethod()
	{
		int r=10;
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		TypesOfVariables2 object= new
				TypesOfVariables2();
		object.nonstaticmethod();
		staticmethod();
		
		System.out.println(object.a);
		System.out.println(object.b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
				

