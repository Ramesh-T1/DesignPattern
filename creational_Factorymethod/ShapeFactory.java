package creational_Factorymethod;

public class ShapeFactory {
   public Shape getFood(String s)
   {
	   if(s==null)
	   {
	     return null;
	   }
	   switch(s)
	   {
	     case "Round": return new Pizza();
	     case "Cylinder":return new Burito();
	     default: throw new IllegalArgumentException("Unknown shape of food");
	   }
	   
   }
}
