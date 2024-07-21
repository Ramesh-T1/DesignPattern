package basic;

public class Student {
	
	int rollno;
	String name;
	static String school="Holly Family";
	
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		school="Xavier's";
		say();
	}
	
	public void display()
	{
		System.out.println("Rollno ="+rollno+" Name ="+name+" School="+school);
	}
	static void say()
	{
		System.out.println("Hello");
	}

}
