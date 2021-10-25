package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	public VIPCustomer() {};
	
	public VIPCustomer(int customerID, String customerName, int AgentID) {
		
		super(customerID, customerName); // 컴파일러가 자동으로 생성 : 상위 생성자를 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = AgentID;
		
		System.out.println(customerName);
		System.out.println("VIPCustomer(int, String) 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // saleRatio  가 duoble이기 때문에 int로 변경
}
	
	public int getAgentID() {
		return agentID;
	}
	
}
