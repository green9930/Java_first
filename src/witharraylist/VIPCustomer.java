package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;		
		System.out.println("VIPCustomer() 생성자 호출");
	};
	
	public VIPCustomer(int customerID, String customerName, int AgentID) {
		
		super(customerID, customerName); // 컴파일러가 자동으로 생성 : 상위 생성자를 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = AgentID;
		
		System.out.println("VIPCustomer(int, String) 호출");
	}
	
	// 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // saleRatio가 duoble이기 때문에 int로 변경
}
	
	public int getAgentID() {
		return agentID;
	}

	// super가 없으면 재귀호출
	// super가 있어야 상위 클래스의 정보를 불러올 수 있음
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
	
}
