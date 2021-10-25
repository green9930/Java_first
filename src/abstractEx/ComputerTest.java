package abstractEx;

public class ComputerTest {
	public static void main(String[] args) {
		// Computer 클래스는 추상 클래스이기 때문에 오류 발생
		// 추상 클래스는 인스턴스화 할 수 없음
		Computer c1 = new Computer();
		// 업캐스팅으로 사용 가능
		Computer c2 = new Desktop();
		// Notebook 클래스도 추상 클래스이므로 오류 발생
		Computer c3 = new Notebook();
		
		// 상위 클래스가 Comuter이기 때문에 Computer이나 Notebook 타입으로 선언 가능
		// 단, 이 경우 Notebook 클래스에 선언된 aaa 메서드는 볼 수 없음
		Computer c4 = new MyNotebook();
		
		// Computer에는 없지만 Desktop/Notebook  클래스에 display() 메서드가 구현되어 있다.
		c2.display();
		c4.display();
	}
}
