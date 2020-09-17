package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuesPerHours = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuesPerHours, additionalCharge));
            }
            else{
                list.add(new Employee(name, hours, valuesPerHours));
            }
        }

        System.out.println();
        System.out.print("PAYMENTS:");

        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

    }

}
