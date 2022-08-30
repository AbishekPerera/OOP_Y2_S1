package abFactory;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String shape) {

		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();

		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();

		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();

		} else {
			return null;
		}

	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
