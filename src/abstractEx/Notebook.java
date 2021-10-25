package abstractEx;

// display만 구현, typing은 구현하지 않는다면 Notebook 클래스에 abstract 선언을 해야한다.
public abstract class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("Notebook display()");
	}
	
	public void aaa() {};
	
}
