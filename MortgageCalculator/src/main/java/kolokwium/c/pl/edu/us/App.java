package kolokwium.c.pl.edu.us;

public class App 
{
    public static void main( String[] args )
    {
    	MortgageCalculator calc = new MortgageCalculator(100000, 0.035, 144);
    	int i = 1;
    	for (Double installment: calc.getDecreasingInstallments()) {
    		System.out.println("Rata nr " + i++ + " = " + installment);
    	}
    	i = 1;
    	calc.setCurrency(new Currency("CHF", 3.9795));
    	for (Double installment: calc.getDecreasingInstallments()) {
    		System.out.println("Rata w CHF nr " + i++ + " = " + installment);
    	}
    }
}
