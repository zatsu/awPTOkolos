package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;
import junit.framework.Assert;
//import kolokwium.c.pl.edu.us.Currency;
import org.junit.Test;

public class CurrencyTest
{

	String waluta= "PLN";
	double exchange= 2.0;

	String waluta2= "USD";
	

	@Test
	public void convertFromPlnTest() {

		Currency pln = new Currency(waluta, exchange);
		Assert.assertEquals(5.0, pln.convertFromPLN(10.0));	
}
	
	@Test
	public void convertToPlnTest() {
		Currency usd = new Currency(waluta2, exchange);
		Assert.assertEquals(10.0, usd.convertToPLN(5.0));
		
	}
}