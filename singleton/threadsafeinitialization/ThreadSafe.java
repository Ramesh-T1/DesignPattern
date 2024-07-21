package singleton.threadsafeinitialization;

public class ThreadSafe {
	private static ThreadSafe t;
	private ThreadSafe()
	{
		
	}
    public static ThreadSafe getInstance()
    {
    	synchronized(ThreadSafe.class)
    	{
    		if(t==null)
    		{
    			t=new ThreadSafe();
    		}
    	}
    	return t;
    }
}
