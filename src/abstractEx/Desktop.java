package abstractEx;

// Computer 상속
// 1. 추상 메서드를 구현하거나
// 2. 아니면 Desktop도 abstract로 선언해야 한다.
public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing()");
	}
	
	// 이미 상위 클래스에서 정의된 메서드도 필요에 따라 하위 클래스에서 재정의하여 사용할 수 있다.
	public void turnOn() {
		System.out.println("Desktop turnOn");
	}
	
}
