package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MortgageCalculatorTest
{
	double sum;
	double interest;
	int periods;
	
	MortgageCalculatorTest(double sum, double interest, int periods){
		
		this.sum=sum;
		this.interest=interest;
		this.periods=periods;
		
		
	}
	
	
	@Parameters
    public static Collection<Object> data() {
        
		
		Object[] data = new Object[] { 100.2, 500.3, 85.0 };
        return Arrays.asList(data);
    }
	
	
	@Test
	public void numberOfInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfFirstInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfLastInstallmentsTest() {
		fail("Not yet implemented");
	}
}