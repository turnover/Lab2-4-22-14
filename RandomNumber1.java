
public class RandomNumber1 
{
	public int computerNum1;
	public int low1;
	public int high1;
	public int GetANumber(int high)
	{
		computerNum1 = 1 + (int) (Math.random()*high);
		return computerNum1;
	}
	public int GetANumber(int low, int high)
	{
		computerNum1 = low + (int) (Math.random()*high);
		return computerNum1;
	}
	public int SetLowNumber(int low)
	{
		low1 = low + (int) (Math.random()*10);
		return low1;
	}
	public int SetHighNumber(int high)
	{
		high1 = 1 + (int) (Math.random()*high);
		return high1;
	}
	public int GetANumber()
	{
		computerNum1 = low1 + (int) (Math.random()*high1);
		return computerNum1;
	}
}


