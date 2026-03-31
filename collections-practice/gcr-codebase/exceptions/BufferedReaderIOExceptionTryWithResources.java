import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderIOExceptionTryWithResources
{
	public static void main(String[] args)
	{
		try(BufferedReader reader=new BufferedReader(new FileReader("info.txt"))){
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
				break;
			}
		}
		catch(IOException e)
		{
			System.out.println("error reading file:"+e.getMessage());			
		}
		
	}
}