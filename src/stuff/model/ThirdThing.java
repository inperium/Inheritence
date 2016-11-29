package stuff.model;

public class ThirdThing extends SubThing implements DoesStuff, OtherInterface
{
	@Override
	public int [] stackOfNumbers()
	{
		//int [] stuffInside = {1,3,4,5,6,7};
		//return stuffInside;
		return null;
	}

	@Override
	public void uselessMethod()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void otherUselessMethod(double whyMe)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void doesOtherNada()
	{
		
	}
	
	@Override
	public int countsNada(int someValue)
	{
		return someValue;
	}
	
	public void doesNada()
	{
		System.out.println("The subclass version");
		super.doesNada();
	}
}
