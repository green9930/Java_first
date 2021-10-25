package inheritance;

public class GoldCustomer extends Customer{
	
	// BonusRatio �߰�
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	// �����Ϸ����� � ���� �ϴ��� �˷���
	@Override
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	
}
