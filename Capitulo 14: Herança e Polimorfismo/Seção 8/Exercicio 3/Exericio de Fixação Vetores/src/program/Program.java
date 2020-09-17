package program;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import quartos.Quartos;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];
		
		System.out.print("How many rooms will be ranted? ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			System.out.printf("%nRent #%d:%n",i,":%n");
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.next();
			System.out.printf("Room: ");
			int num = sc.nextInt();
			vect[num] = new Quartos(name, email);
			
		}
		
		System.out.printf("%nBusy room:%n");
		for(int i=0;i<vect.length;i++) {
			
			if(vect[i]!=null) {
				System.out.printf("%d: %s%n",i,vect[i]);
			}
			
		}

	}

}
