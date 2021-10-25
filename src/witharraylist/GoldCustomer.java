package witharraylist;

public class GoldCustomer extends Customer{
	
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
//		this.customerID = customerID;
//		this.customerName = customerName;
		super(customerID, customerName); // 멤버 변수 상속
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
