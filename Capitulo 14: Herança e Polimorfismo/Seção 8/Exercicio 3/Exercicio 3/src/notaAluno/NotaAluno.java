package notaAluno;

import java.util.Scanner;

import calculoNotas.CalculoNotasAluno;

import java.util.Locale;

public class NotaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoNotasAluno calc = new CalculoNotasAluno();
		
		calc.aluno = sc.nextLine();
		do {
			System.out.println();
			calc.n1 = sc.nextDouble();
			calc.n2 = sc.nextDouble();
			calc.n3 = sc.nextDouble();
		}while(calc.n1>30.00 || calc.n2>35.00 || calc.n3>35.00);
		
		System.out.println();
		System.out.println("FINAL GRADE: " + String.format("%.2f", calc.notaTotal()));
		
		if(calc.notaTotal()>=60.00) {
			
			System.out.println("PASS");
			
		}
		
		else {
			
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", calc.notaPrecisava()) + " POINTS");
			
		}

	}

}
