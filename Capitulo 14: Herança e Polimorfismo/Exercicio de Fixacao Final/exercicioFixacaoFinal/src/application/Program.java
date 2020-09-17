package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class Program {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<TaxPayer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){

            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employee: ");
                int numberOfEmployee = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployee));
            }


        }

        double total = 0;

        System.out.println();
        System.out.println("TAXES PAID:");
        for(TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + tp.tax());
            total += tp.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + total);

        sc.close();

    }

}
