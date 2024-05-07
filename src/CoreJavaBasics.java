
public class CoreJavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		String name = "monika";
		char firstletter = 'M';
		double dec = 6.25;
		boolean torf = true;
		
		System.out.println(num+" is the correct number");
		
		//Array
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		
		int[] arr2 = {1,2,3,4,5,11,15,144,44,77};
		//System.out.println(arr2[3]);
		
		//for loop
		//for(int i =0; i<arr.length; i++)
		//{
		//	System.out.println(arr[i]);
		//}
		//for(int i =0; i<arr2.length; i++)
		
		for(int ii: arr2)
		{
			System.out.println(ii);
		}
		
		String[] Mname = new String[3];
		Mname[0]="Monika";
		Mname[1]="is";
		Mname[2]="name";
		
		for(int i=0; i<Mname.length; i++)
		{
			System.out.println(Mname[i]);
		}
	
		String[] Mname1 = {"monika","is","name"};
		for(int i=0; i<Mname1.length; i++)
		{
			System.out.println(Mname1[i]);
		}
		//enhanced for loop
		for(String s: Mname1)
		{
			System.out.println(s);
		}
	}

}
