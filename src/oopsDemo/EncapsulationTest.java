package oopsDemo;

public class EncapsulationTest {
public static void main(String[] args) {
	//Test class for encapsulation
	Animal cat = new Animal();
	cat.setId(100);
	cat.setName("Trigger");
	cat.setColor("White");
	cat.setWeight(5);
	cat.setHeight(1.5);

	
	
	System.out.println("Id - "+ cat.getId() + " \nName - " + cat.getName()+ " \nColor - "+ cat.getColor() + " \nWeight - " + cat.getWeight() + " \nHeight - " +
	cat.getHeight());
	

}
}
