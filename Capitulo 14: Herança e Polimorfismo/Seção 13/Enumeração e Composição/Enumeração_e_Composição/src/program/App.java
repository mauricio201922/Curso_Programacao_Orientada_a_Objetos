package program;

import java.util.Date;

import entities.Status;
import entities.status.StatusOrder;

public class App {

	public static void main(String[] args) {
		
		Status order = new Status(1000, new Date(), StatusOrder.PENDING_PAYMENT);

		System.out.println(order);
		
		StatusOrder os1 = StatusOrder.DELIVERED;
		
		StatusOrder os2 = StatusOrder.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
