import java.text.NumberFormat;
import java.util.Locale;

public class PennyDoubled {

	public static void main(String[] args) {
		double money = 0.01;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		for (int i= 0; i <=30; i++) {
			money *=2;
		System.out.println("On day " +  (i  + 1) + " we have: " + currency.format(money));
		}
	}

}
