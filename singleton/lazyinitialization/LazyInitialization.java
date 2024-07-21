package singleton.lazyinitialization;

public class LazyInitialization {
	private static LazyInitialization l;
	private LazyInitialization()
	{
		
	}
    public static LazyInitialization getInstance()
    {
    	if(l==null)
    	{
    		l=new LazyInitialization();
    	}
    	return l;
    }
}
