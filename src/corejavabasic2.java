import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corejavabasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,11,15,144,44,77};
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i]%2==0)
			{
				System.out.println(arr2[i]);
				break;
			}
	
		else
		{
			System.out.println(arr2[i]+ " is not multiple of 2");
		}
	}	
		
		ArrayList<String> A = new ArrayList<String>();
		A.add("monika");
		A.add("khandelwal");
		A.add("is");
		A.remove(2);
		A.add("full");
		A.add("name");
		
		System.out.println(A.get(0));
		System.out.println("@@@@@@@@@@@@@@");
		
		//for loop ArrayList
		
		for(int i =0; i<A.size();i++)
		{
			System.out.println(A.get(i));
		}
		System.out.println("@@@@@@@@@@@@@@");
		
		//enhanced for loop
		
		for(String S: A)
		{
			System.out.println(S);
		}
		
		System.out.println("@@@@@@@@@@@@@@");
		//check item is present in the ArrayList
		System.out.println(A.contains("full"));
		
		//Convert traditional array into ArrayList to check the item is present in the Array
		//ArrayListMname1 is object
		//Arrays is class
		//List is super class
		System.out.println("@@@@@@@@@@@@@@");
		
		String[] Mname1 = {"monika","is","name"};
		List<String> ArrayListMname1 = Arrays.asList(Mname1);
		//check the item is present in the Array after converting into ArrayList
		System.out.println(ArrayListMname1.contains("is"));
		
		
	}

}
