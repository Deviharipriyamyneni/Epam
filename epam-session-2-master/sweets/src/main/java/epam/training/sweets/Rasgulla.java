package epam.training.sweets;

public class Rasgulla implements Sweet
{
	String name;
	int cost;
	public Rasgulla()
	{
		setCost(30);
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
