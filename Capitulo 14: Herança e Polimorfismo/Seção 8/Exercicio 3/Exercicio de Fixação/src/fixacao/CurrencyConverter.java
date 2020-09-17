package fixacao;

public class CurrencyConverter {
	
	public static final double PERCENT = 0.06;
	
	public static double calculator(double dollar, double value) {
		return (dollar * value) + (dollar * value * PERCENT); 
	}

}
