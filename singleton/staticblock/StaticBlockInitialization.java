package singleton.staticblock;

public class StaticBlockInitialization {
	private static StaticBlockInitialization sb;
	static
	{
		sb=new StaticBlockInitialization();
	}
	private StaticBlockInitialization()
	{
		
	}
	public static StaticBlockInitialization getInstance()
	{
		return sb;
	}
}
