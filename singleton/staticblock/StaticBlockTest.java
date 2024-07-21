package singleton.staticblock;

public class StaticBlockTest {

	public static void main(String[] args) {
		StaticBlockInitialization sb1=StaticBlockInitialization.getInstance();
		StaticBlockInitialization sb2=StaticBlockInitialization.getInstance();
		System.out.println(sb1);
		System.out.println(sb2);
	}
}
