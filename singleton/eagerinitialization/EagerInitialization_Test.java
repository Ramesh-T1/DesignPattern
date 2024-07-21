package singleton.eagerinitialization;

public class EagerInitialization_Test {

	public static void main(String[] args) {
		//4.Create a test class and create a object of eagerinitialization class by calling static getInstance class
		EagerInitialization e1=EagerInitialization.getInstance();
		EagerInitialization e2=EagerInitialization.getInstance();
		System.out.println(e1);
		System.out.println(e2);
	}
}
