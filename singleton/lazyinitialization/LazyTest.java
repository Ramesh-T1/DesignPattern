package singleton.lazyinitialization;

public class LazyTest {

	public static void main(String[] args) {
		LazyInitialization lt1=LazyInitialization.getInstance();
		LazyInitialization lt2=LazyInitialization.getInstance();
		System.out.println(lt1);
		System.out.println(lt2);
	}

}
