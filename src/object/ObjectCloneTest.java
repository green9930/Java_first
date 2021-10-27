package object;

class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

// implements Cloneable 추가하지 않으면 파일 에러 발생
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + point + ", 반지름은 " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectCloneTest {
	// circle1.clone()의 예외처리를 위해 throws CloneNotSupportedException 추가 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle1 = new Circle(10, 20, 5);
		
		// clone()이 Object형이므로 다운캐스팅 필요
		Circle cloneCircle = (Circle)circle1.clone();
		
		System.out.println(System.identityHashCode(circle1)); // 1313922862
		System.out.println(System.identityHashCode(cloneCircle)); // 495053715
		
		System.out.println(circle1); // 원점은 x = 10, y = 20, 반지름은 5
		System.out.println(cloneCircle); // 원점은 x = 10, y = 20, 반지름은 5
		
	}
}






