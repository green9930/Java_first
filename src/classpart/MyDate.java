package classpart;

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public boolean isValid() {
		isValid ? "유효한 날짜입니다." : "유요하지 않은 날자입니다.";
	};
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
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

public class MyDate {
	
	public static void main(String[] args) {
		MyDate myDay = new MyDate();
		
		
		
	}

}
