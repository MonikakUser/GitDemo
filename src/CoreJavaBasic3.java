
public class CoreJavaBasic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object
		
		//two ways to represent the string
		//1. String literal
		String s = "Monika Khandelwal";
		
		//2. with new keyword = new memory allocate operator
		String s1 = new String("welcome");
		 
		//split = split the string into words
		String s3 = "Monika Khandelwal Automation";
		String[] splitstring = s3.split("Khandelwal");
		System.out.println(splitstring[0]);
		System.out.println(splitstring[1]);
		
		//trim
		// Remove Whitespace 
		System.out.println(splitstring[1].trim());

		//break the string into characters using CharAt method
		
		//for(int i=0; i<s3.length(); i++)
		//{
		//	System.out.println(s3.charAt(i));
		//}
		
		//Write string into reverse order
		
		for(int i=s3.length()-1; i>=0;i--)
		
		{
			System.out.println(s3.charAt(i));
		}
		
		

	}

}
