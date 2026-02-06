package review;
class DataException extends Exception
{
	public DataException(String message)
	{
		super(message);
	}
}
public class DBCustomException  {
	public static void main(String[] args) throws DataException
	{
		String news="hi";
		try
		{
			if(news.length()<4)
			{
				throw new DataException("No news today");
			}
		}
		catch(DataException e)
		{
			System.out.println("no news is present");
		}
		
				
	}

}
