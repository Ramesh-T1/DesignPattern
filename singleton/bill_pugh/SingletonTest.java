package singleton.bill_pugh;

public class SingletonTest {

	public static void main(String[] args) {
		BillPugh b1=BillPugh.getInstance();
		BillPugh b2=BillPugh.getInstance();
		System.out.println(b1);
		System.out.println(b2);
	}
}
