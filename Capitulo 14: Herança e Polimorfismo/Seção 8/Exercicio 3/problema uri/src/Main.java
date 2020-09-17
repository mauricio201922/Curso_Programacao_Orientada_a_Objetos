import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		double fl = sc.nextDouble();
		String c = sc.next();
		String text = sc.nextLine();
		
		System.out.printf("%d%.6f%s%s",v,fl,c,text);
		System.out.printf("%d\t%.6f\t%s\t%s\t",v,fl,c,text);
		System.out.printf("\t  %d\t  %.6f\t  %s\t  $s\t  ",v,fl,c,text);

	}

}
