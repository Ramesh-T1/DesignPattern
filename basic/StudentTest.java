package basic;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(1,"Finn");
		s1.display();
		Student.change();
		Student s2=new Student(2,"Sammy");
		s2.display();
		Student s3=new Student(3,"Bramti");
		s3.display();
		s1.display();
	}
}
