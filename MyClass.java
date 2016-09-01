package newpackage;

public class MyClass {

	private String name;
	

	public MyClass() {
	}


	public MyClass(String name) {
		this.name = name;
	}


	public int GCD(int a,int b)
	{
		if (b==0) return a;
		else
			return GCD(b,a%b);	
	}
	
	

}
