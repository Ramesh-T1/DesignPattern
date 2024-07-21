package singleton.bill_pugh;

public class BillPugh {
	BillPugh()
	{
		
	}
	private static class InnerClass
	{
		private static final BillPugh b=new BillPugh();
	}
	public static BillPugh getInstance()
	{
		return InnerClass.b;
	}

}
