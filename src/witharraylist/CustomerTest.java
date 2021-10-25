package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		// ��ü ������ ���� ArrayList��
		// customerList�� CustomerŸ�Կ��� ��ӹ��� ��� ��ü �翵 ����
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
			
			System.out.println(customer.getCustomerName() + "���� " + cost + "���� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
		
	}
}
