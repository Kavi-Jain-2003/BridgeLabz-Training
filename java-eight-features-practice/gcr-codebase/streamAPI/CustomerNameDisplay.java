import java.util.*;
import java.util.stream.*;
public class CustomerNameDisplay {
	public static void main(String[] args)
	{
		 List<String> customers = Arrays.asList(
		            "Ravi", "anita", "Mohit", "kiran", "Sneha"
		        );
		 List<String> result=customers.stream()
				 .map(String::toUpperCase)
				 .sorted()
				 .collect(Collectors.toList());
		 result.forEach(System.out::println);
	}

}
