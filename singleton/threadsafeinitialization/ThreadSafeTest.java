package singleton.threadsafeinitialization;

public class ThreadSafeTest {

	public static void main(String[] args) {
		ThreadSafe t1=ThreadSafe.getInstance();
		ThreadSafe t2=ThreadSafe.getInstance();
		System.out.println(t1);
		System.out.println(t2);
	}
}
