package singleton.eagerinitialization;

public class EagerInitialization {
	//1.Create a static reference of EagerInitialization class and instantiate it or create object
	private static EagerInitialization e=new EagerInitialization();
	//2.Add a private empty constructor,So that it is not available outside the class
	private EagerInitialization()
	{
		
	}
	//3.Return object from this static method
	public static EagerInitialization getInstance()
	{
		return e;
	}	
}
