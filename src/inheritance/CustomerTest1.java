package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerID(101);
		Lee.setCustomerName("Lee");
		
		// Customer Kim = new VIPCustomer(102, "Kim"); 으로 형변환 가능
		// 이 경우 VIPCustomer의 메서드인 getAgentID()는 사용할 수 없다. (Customer의 하위 클래스에 있기 때문에)
		VIPCustomer Kim = new VIPCustomer(102, "Kim", 10102);
		Kim.bonusPoint = 1000;
		Kim.getAgentID();
		
		System.out.println(Lee.showCustomerInfo()); // Lee 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
		System.out.println(Kim.showCustomerInfo()); // Kim 님의 등급은 VIP이며, 보너스 포인트는 0입니다.
		
	}

}
