package program;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitidies.Project;

public class Funcionarios {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		Integer n = sc.nextInt();
		
		List<Project> emp = new ArrayList<>();
		
		// Informando dados dos clientes e guardando na lista.
		
		for(int i=1; i<=n; i++) {
			
			System.out.printf("%nEmplyoee #%d%n",i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			emp.add(new Project(id, name, salary));
			
		}
		
		// Alterando salario do funcionário cujo o ID informado. Cajo não exita, informar q não tem
		
		System.out.printf("%nEnter the employee id that have salary increase: ");
		int foundId = sc.nextInt();
		
		Project result = emp.stream().filter(x -> x.getId() == foundId).findFirst().orElse(null);
		if (result == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			result.PercentualAlmento(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for(Project obj : emp) {
			System.out.println(obj.toString());
		}
		sc.close();
	}

}
