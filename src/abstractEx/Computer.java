package abstractEx;

// 추상 메서드가 있으면 클래스도 abstract 선언
public abstract class Computer {
	// display 메서드를 구현하지 않고 선언만
	// 구현코드{}가 없으면 추상 메서드
//	public void display();
	public abstract void display();
	// 내용이 없어도 구현코드가 있으면 추상코드가 아니다.
//	public void typing() {};
	public abstract void typing();
	 
	public int add(int x, int y) {
		return x + y;
	}
	
	public void turnOn() {
		System.out.println("천원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
