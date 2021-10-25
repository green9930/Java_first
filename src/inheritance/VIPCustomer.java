package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	public VIPCustomer() {};
	
	public VIPCustomer(int customerID, String customerName, int AgentID) {
		
		super(customerID, customerName); // �����Ϸ��� �ڵ����� ���� : ���� �����ڸ� ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = AgentID;
		
		System.out.println(customerName);
		System.out.println("VIPCustomer(int, String) ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // saleRatio  �� duoble�̱� ������ int�� ����
}
	
	public int getAgentID() {
		return agentID;
	}
	
}
