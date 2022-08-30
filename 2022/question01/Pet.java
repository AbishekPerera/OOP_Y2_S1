package question01;

public abstract class Pet implements PointAllocator{
	
	private double Points=0;
	

	@Override
	public double getter() {
		// TODO Auto-generated method stub
		return Points;
	}

	@Override
	public void setter(double points) {
		// TODO Auto-generated method stub
		this.Points=points;
		
	}
	
	public abstract void feed();
	public abstract void clean();
	public abstract void cuddle();
	public abstract void GetTotalPoints();

	
	
}
