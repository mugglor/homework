package to_dos.prototype;

/* Create the ShapeDraw class which uses ShapeCache class 
to get clones of shapes stored in a Hashtable. */
public class ShapeDraw {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// run loadCache() method
		ShapeCache.loadCache();
		
		/*
		 * create 3 cloned shapes with 3 different types Hint: use getShape() &
		 * getType() methods
		 */
		Shape cloneShape = ShapeCache.getShape("1");
		Shape cloneShape2 = ShapeCache.getShape("2");
		Shape cloneShape3 = ShapeCache.getShape("3");
		
		System.out.println("cloned shapes are: \n" + cloneShape.getType());
		cloneShape.draw();
		System.out.println(cloneShape2.getType());
		cloneShape2.draw();
		System.out.println(cloneShape3.getType());
		cloneShape3.draw();
		
	}
}