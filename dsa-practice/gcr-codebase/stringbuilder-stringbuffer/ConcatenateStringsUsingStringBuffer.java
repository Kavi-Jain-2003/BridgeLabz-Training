
public class ConcatenateStringsUsingStringBuffer {
	public static void main(String[] args) {
	//string buffer object
	StringBuffer sb=new StringBuffer();
	String[] arr= {"Hello","Java","String","Buffer"};
	int n=arr.length;
	for(int i=0; i<n; i++)
	{
		sb.append(arr[i]);
	}
	System.out.println("concatenated string:"+sb.toString());
	}
}
