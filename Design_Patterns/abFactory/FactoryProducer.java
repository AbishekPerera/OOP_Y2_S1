package abFactory;

public class FactoryProducer {

	public AbstractFactory getFactory(String factory) {

		if (factory.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}

		else if (factory.equalsIgnoreCase("Shape")) {
			return new ShapeFactory();
		} else {
			return null;
		}
	}
}
