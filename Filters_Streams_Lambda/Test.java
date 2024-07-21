package Filters_Streams_Lambda;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(21,12,14,15,18,32,34,45,64,98);
		printEvenNumbers(numbers);
		printOddNumbers(numbers);
		List<String> topic=List.of("Spring Boot","Spring MVC","Spring Data JPA","API","Microservices","Node JS","JS","React JS");
		printAlltopics(topic);
	}
	private static void printEvenNumbers(List<Integer> n)
	{
		System.out.println("Even Numbers :");
		n.stream().filter(numbers->numbers%2==0).forEach(System.out::println);
	}
	private static void printOddNumbers(List<Integer> m) {
		System.out.println("Odd Numbers :");
		m.stream().filter(numbers->numbers%2!=0).forEach(System.out::println);	
	}
	private static void printAlltopics(List<String> t)
	{
		System.out.println("All topics :");
		t.stream().forEach(System.out::println);
		System.out.println("Print topics with length more than 4");
		t.stream().filter(topic->topic.length()>4).forEach(System.out::println);
	}

}
