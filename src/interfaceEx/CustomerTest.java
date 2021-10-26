package interfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		
		// Customer 인스턴스 customer
		Customer customer = new Customer();
		
		// buy, sell 모두 호출할 수 있었던 Customer 클래스에서 Buy 인터페이스형으로 형 변환이 일어나
		// Buy 인터페이스에 선언한 메서드만 호출 가능
		Buy buyer = customer;
		buyer.buy();
		
		// buy, sell 모두 호출할 수 있었던 Customer 클래스에서 Sell 인터페이스형으로 형 변환이 일어나
		// Sell 인터페이스에 선언한 메서드만 호출 가능
		Sell seller = customer;
		seller.sell();
		
		// 자바는 가상 메서드 방식이기 때문에 
		// buyer, seller 모두 현재 바인딩 된 인스턴스는 customer
		customer.order(); // 고객 판매 주문
		seller.order(); // 고객 판매 주문
		buyer.order(); // 고객 판매 주문
	}
}
