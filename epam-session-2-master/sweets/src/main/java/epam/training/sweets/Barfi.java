package epam.training.sweets;

public class Barfi implements Sweet
{
	String name;
	int cost;
	public Barfi()
	{
		setCost(13);
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
}
