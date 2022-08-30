package abFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryProducer fcp = new FactoryProducer();

		AbstractFactory cf = fcp.getFactory("Color");
		Color col = cf.getColor("Red");
		col.fill();

		AbstractFactory sf = fcp.getFactory("Shape");
		Shape shp = sf.getShape("Circle");
		shp.draw();

	}

}
