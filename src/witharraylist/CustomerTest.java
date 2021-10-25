package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		// 객체 관리를 위해 ArrayList로
		// customerList에 Customer타입에서 상속받은 모든 객체 사영 가능
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(1010, "Lee");
		Customer kim = new Customer(1011, "Kim");
		GoldCustomer shin = new GoldCustomer(1012, "Shin");
		GoldCustomer yoo = new GoldCustomer(1013, "Yoo");
		VIPCustomer bae = new VIPCustomer(1014, "Bae", 200);
		
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(shin);
		customerList.add(yoo);
		customerList.add(bae);
		
		for(Customer customer : customerList)	{
			System.out.println(customer.showCustomerInfo());
			
		}
	
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
		
	}
}
