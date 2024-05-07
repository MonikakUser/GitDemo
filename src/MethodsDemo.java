
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo demo = new MethodsDemo();
		String sname = demo.getData();
		System.out.println(sname);
		
		//use method from other class
		MethodsDemo2 demo2 = new MethodsDemo2();
		demo2.getUserdata();
		
	
		String sname2 = getData2();
		System.out.println(sname2);
		
	}
	
//if method not returning any thing then use void otherwise use string/int
	public String getData()
	{
		System.out.println("hello world");
		return "Welcome To Java basics";
	}
// access class method without creating object
	public static String getData2()
	{
		System.out.println("hello world2");
		return "Welcome To Java basics2";
	}
}
