package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
//		Customer Lee = new Customer(103, "Lee");
//		int price = Lee.calcPrice(10000);
//		System.out.println(Lee.showCustomerInfo()); // Lee 님의 등급은 SILVER이며, 보너스 포인트는 100입니다.
//		System.out.println("지불 금액: " + price);
//		
//		VIPCustomer Park = new VIPCustomer(104, "Park", 10103);
//		Park.calcPrice(5000);
//		System.out.println(Park.customerName);
//		System.out.println(Park.showCustomerInfo());

		Customer customerWho = new VIPCustomer(10106, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		System.out.println(customerGold);
	}
}
