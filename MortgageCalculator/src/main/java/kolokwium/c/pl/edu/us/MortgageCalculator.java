package kolokwium.c.pl.edu.us;

import java.util.ArrayList;
import java.util.List;

public class MortgageCalculator
{
	private double _sum;
	private double _interest;
	private int _periods;
	private Currency _currency = null;
	
	/**
	 * Ustawienie waluty powoduje przeliczenie rat na PLN zgodnie z podanym kursem
	 * @param currency Waluta
	 */
	public void setCurrency(Currency currency)
	{
		_currency = currency;
	}
	
	/**
	 * @param sum			Pożyczona suma
	 * @param interest		Oprocentowanie w skali roku
	 * @param periods		Liczba miesiący na który został udzielony kredyt (liczba rat)
	 */
	public MortgageCalculator(double sum, double interest, int periods)
	{
		_sum = sum;
		_interest = interest;
		_periods = periods;
	}
	
	public List<Double> getDecreasingInstallments()
	{
		List<Double> installments = new ArrayList<Double>();
		double fixed = Tools.round(_sum / _periods);
		for (int i = 0; i < _periods; ++i) {
			double dynamic = Tools.round((_sum - i * fixed) * (_interest / 12));
			double installment = Tools.round(fixed + dynamic);
			if (_currency != null) {
				installment = _currency.convertToPLN(installment);
			}
			installments.add(installment);
		}
		return installments;
	}
}