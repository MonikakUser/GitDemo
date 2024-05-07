package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream2 {
	@Test
	public void streamnew()
	
	{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("kit");
		names.add("dhik");
		names.add("mit");
		names.add("hik");
		names.add("vik");
		//print the name ends with a in the Uppercase
		Stream.of("Ankita", "Adhik","Amit","rihik","Avik").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		//Print the name which have first name as a with upper case and sorted
		List<String> al = Arrays.asList("Ankita", "Adhik","Amit","rihik","Avik");
		al.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//merging two list
		Stream<String> strm = Stream.concat(al.stream(), names.stream());
		//strm.sorted().forEach(s->System.out.println(s));
		boolean tr = strm.anyMatch(s->s.equalsIgnoreCase("Avik"));
		System.out.println(tr);
	
		Assert.assertTrue(tr);	
		}

}
