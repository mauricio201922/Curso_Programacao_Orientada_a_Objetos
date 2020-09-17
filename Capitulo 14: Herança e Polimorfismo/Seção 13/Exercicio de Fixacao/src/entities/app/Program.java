package entities.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: "); String name = sc.nextLine();
		System.out.print("Email: "); String email = sc.nextLine();
		System.out.print("Birth date (dd/mm/yyyy): "); Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: "); OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? "); int n = sc.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: "); sc.nextLine(); String nameProduct = sc.nextLine();
			System.out.print("Product price: "); double productPrice = sc.nextDouble();
			
			Product pd = new Product(nameProduct, productPrice);
			
			System.out.print("Quantity: "); int qtdade = sc.nextInt();
			
			OrderItem oi = new OrderItem(qtdade, productPrice, pd);
			
			order.addItem(oi);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.print(order);
		
		
		sc.close();

	}

}
