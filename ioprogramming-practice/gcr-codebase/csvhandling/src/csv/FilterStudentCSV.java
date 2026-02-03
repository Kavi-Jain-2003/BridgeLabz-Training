package csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FilterStudentCSV {
	public static void main(String[] args)
	{
		String filePath="student.csv";
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader(filePath)))
		{
			br.readLine();
			System.out.println("Student scoring more than 80:\n");
			while((line=br.readLine())!=null){
				if(line.trim().isEmpty()) {
					continue;
				}
				String[] data=line.split(",");
				int id=Integer.parseInt(data[0]);
				String name=data[1];
				int age=Integer.parseInt(data[2]);
				int marks=Integer.parseInt(data[3]);
				if(marks>80)
				{
					 System.out.println("ID    : " + id);
	                 System.out.println("Name  : " + name);
	                 System.out.println("Age   : " + age);
	                 System.out.println("Marks : " + marks);
	                 System.out.println("---------------------");
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("error reading csv file");
		}
		
	}

}
