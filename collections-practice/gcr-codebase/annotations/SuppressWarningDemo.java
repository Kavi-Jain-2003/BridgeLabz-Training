import java.util.ArrayList;

public class SuppressWarningDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("java");
		list.add(45.6);
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
	}
}

