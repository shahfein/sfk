package inaya;

public class HelloWorld {
	
	public void nonstatic()
	{
		System.out.println("non static method");
	}
	public static void staticmethod()
	{
		System.out.println("static method");
	}
	public static void main(String[] args)
	{
       System.out.println("Hello world");		
	    HelloWorld helloworldobject = new HelloWorld();
	   helloworldobject.nonstatic();
	   staticmethod();
	    		
	}

	
}
