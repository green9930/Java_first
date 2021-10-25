package inheritance;

public class GoldCustomer extends Customer{
	
	// BonusRatio 추가
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	// 컴파일러에게 어떤 일을 하느지 알려줌
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	
}
