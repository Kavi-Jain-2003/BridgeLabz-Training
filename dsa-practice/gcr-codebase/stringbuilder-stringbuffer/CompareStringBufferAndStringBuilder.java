
public class CompareStringBufferAndStringBuilder {
	public static void main(String[] args)
	{
		long startTime,endTime;
		//testing stringbuilder performance
		startTime=System.nanoTime();
		StringBuilder sb1=new StringBuilder("hello");
		for(int i=0; i<10000; i++)
		{
			sb1.append(" java");
		}
		endTime=System.nanoTime();
		long diff1=(endTime-startTime);
		System.out.println("StringBuilder time:"+diff1+" ns");
		//testing stringbuffer performance
		startTime=System.nanoTime();
		StringBuffer sb2=new StringBuffer("hello");
		for(int i=0; i<1000000; i++)
		{
			sb2.append(" java");
		}
		endTime=System.nanoTime();
		long diff2=(endTime-startTime);
		System.out.println("StringBuffer time:"+diff2+" ns");
		if(diff1<diff2)
		{
			System.out.println("String builder concatenates string in less time");
		}
		else
		{
			System.out.println("String buffer concatenates string in less time");
		}
		
	}

}
