package reference;

public class Circle {
	 
	// 클래스 내부에서 다른 클래스를 참조 변수형으로 가져와 쓸 수 있다.
	Point point; // Point 클래스를 따로 만들고 참조 변수형으로 가져와 쓴다.
	int radius;
	
	public Circle() {
		point = new Point();
	}
}
