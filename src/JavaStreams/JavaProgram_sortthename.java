package JavaStreams;
import java.util.stream.Stream;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaProgram_sortthename {
	//@Test

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void regular()
		{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ankit");
		names.add("Adhik");
		names.add("Amit");
		names.add("rihik");
		names.add("Avik");
		
		int count =0;
		
		for(int i =0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		}

	@Test
	public void Stream()
	{
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ankit");
	names.add("Adhik");
	names.add("Amit");
	names.add("rihik");
	names.add("Avik");
	
	long c = names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
		 long d = Stream.of("Ankit", "Adhik","Amit","rihik","Avik").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();
		 System.out.println(d);
		 
	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	
	
	}
}
