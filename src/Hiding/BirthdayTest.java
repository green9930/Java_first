package Hiding;

// 자바에 클래스는 여러개일 수 있다.
// 단, public class는 하나이며 java 파일과 이름이 동일해야 한다.
class Birthday {
	// private으로 선언하면 같은 파일 내부에서도 볼 수 없다. 
	// 같은 클래스 내부에서만 사용 가능
	private int day;
	private int month;
	private int year;
	
	// 멤버 변수는 불가능하나 다른 클래스에서도 메서드를 이용해 접근 가능
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
		
		// Birthday 클래스에서 멤버 변수를 private으로 선언되면 오류 표시
//		day.day = 30; 
//		day.month = 2;
//		day.year = 2019;
		
		day.setMonth(2);
		day.setDay(30); // Incorrect Date 
		day.setYear(2019);
		
	}
	
}
