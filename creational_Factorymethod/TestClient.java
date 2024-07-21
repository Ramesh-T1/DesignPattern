package creational_Factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClient {
	@Test
	public static void main(String[] args) {
		ShapeFactory sd=new ShapeFactory();
		Shape rf=sd.getFood("Round");
		System.out.println(rf.getShape());
		Shape cf=sd.getFood("Cylinder");
		System.out.println(cf.getShape());
		assertEquals("Round",rf.getShape());
		assertEquals("Cylinder",cf.getShape());
	}
}
