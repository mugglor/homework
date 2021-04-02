package to_dos.abstract_factory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	//TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
		AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
		// get an object of Shape Rectangle
		Shape roundedRect = roundedFactory.getShape("Rectangle");
		// call draw method of Shape Rectangle
		roundedRect.draw();
		// get an object of Shape Square
		Shape roundedSquare = roundedFactory.getShape("Square");
		// call draw method of Shape Square
		roundedSquare.draw();
		// get shape factory
		AbstractFactory factory = FactoryProducer.getFactory(false);
		// get an object of Shape Rectangle
		Shape rect = factory.getShape("rectangle");
		// call draw method of Shape Rectangle
		rect.draw();
		// get an object of Shape Square
		Shape square = factory.getShape("square");
		// call draw method of Shape Square
		square.draw();
	}
}