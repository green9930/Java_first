package interfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		
		// Customer �ν��Ͻ� customer
		Customer customer = new Customer();
		
		// buy, sell ��� ȣ���� �� �־��� Customer Ŭ�������� Buy �������̽������� �� ��ȯ�� �Ͼ
		// Buy �������̽��� ������ �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		
		// buy, sell ��� ȣ���� �� �־��� Customer Ŭ�������� Sell �������̽������� �� ��ȯ�� �Ͼ
		// Sell �������̽��� ������ �޼��常 ȣ�� ����
		Sell seller = customer;
		seller.sell();
		
		// �ڹٴ� ���� �޼��� ����̱� ������ 
		// buyer, seller ��� ���� ���ε� �� �ν��Ͻ��� customer
		customer.order(); // �� �Ǹ� �ֹ�
		seller.order(); // �� �Ǹ� �ֹ�
		buyer.order(); // �� �Ǹ� �ֹ�
	}
}
