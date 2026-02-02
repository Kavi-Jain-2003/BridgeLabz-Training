
class LegacyAPI {
	@Deprecated
	public void oldFeature()
	{
		System.out.println("old method");
	}
	public void newFeature()
	{
		System.out.println("new method");
	}
}
public class DeprecatedDemo{
	public static void main(String[] args)
	{
		LegacyAPI l=new LegacyAPI();
		l.oldFeature();
		l.newFeature();
	}
}
