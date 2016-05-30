package kolokwium.c.pl.edu.us;

public class Currency
{
	private String _name;
	private double _exchange;
	
	public String getName()
	{
		return _name;
	}
	
	public double getExchange()
	{
		return _exchange;
	}
	
	/**
	 * @param name		Nazwa waluty
	 * @param exchange	Kurs waluty
	 */
	public Currency(String name, double exchange)
	{
		_name = name;
		_exchange = exchange;
	}
	
	public double convertFromPLN(double money)
	{
		return Tools.round(money / _exchange);
	}
	
	public double convertToPLN(double money)
	{
		return Tools.round(money * _exchange);
	}
}