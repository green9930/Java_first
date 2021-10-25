package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerID(101);
		Lee.setCustomerName("Lee");
		
		// Customer Kim = new VIPCustomer(102, "Kim"); ���� ����ȯ ����
		// �� ��� VIPCustomer�� �޼����� getAgentID()�� ����� �� ����. (Customer�� ���� Ŭ������ �ֱ� ������)
		VIPCustomer Kim = new VIPCustomer(102, "Kim", 10102);
		Kim.bonusPoint = 1000;
		Kim.getAgentID();
		
		System.out.println(Lee.showCustomerInfo()); // Lee ���� ����� SILVER�̸�, ���ʽ� ����Ʈ�� 0�Դϴ�.
		System.out.println(Kim.showCustomerInfo()); // Kim ���� ����� VIP�̸�, ���ʽ� ����Ʈ�� 0�Դϴ�.
		
	}

}
