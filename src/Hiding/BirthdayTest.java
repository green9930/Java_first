package Hiding;

// �ڹٿ� Ŭ������ �������� �� �ִ�.
// ��, public class�� �ϳ��̸� java ���ϰ� �̸��� �����ؾ� �Ѵ�.
class Birthday {
	// private���� �����ϸ� ���� ���� ���ο����� �� �� ����. 
	// ���� Ŭ���� ���ο����� ��� ����
	private int day;
	private int month;
	private int year;
	
	// ��� ������ �Ұ����ϳ� �ٸ� Ŭ���������� �޼��带 �̿��� ���� ����
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("Incorrect Date");
			}
		}
		else this.day = day;
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}

public class BirthdayTest {

	public static void main(String[] args) {
		
		Birthday day = new Birthday();
		
		// Birthday Ŭ�������� ��� ������ private���� ����Ǹ� ���� ǥ��
//		day.day = 30; 
//		day.month = 2;
//		day.year = 2019;
		
		day.setMonth(2);
		day.setDay(30); // Incorrect Date 
		day.setYear(2019);
		
	}
	
}
