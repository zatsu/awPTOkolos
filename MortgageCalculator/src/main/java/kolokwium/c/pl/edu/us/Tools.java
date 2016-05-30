package kolokwium.c.pl.edu.us;

public abstract class Tools
{
	public static double round(double number)
	{
		return (double) Math.round((number) * 100d) / 100d;
	}
}