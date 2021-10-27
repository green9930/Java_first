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

// implements Cloneable �߰����� ������ ���� ���� �߻�
class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "������ " + point + ", �������� " + radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjectCloneTest {
	// circle1.clone()�� ����ó���� ���� throws CloneNotSupportedException �߰� 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle1 = new Circle(10, 20, 5);
		
		// clone()�� Object���̹Ƿ� �ٿ�ĳ���� �ʿ�
		Circle cloneCircle = (Circle)circle1.clone();
		
		System.out.println(System.identityHashCode(circle1)); // 1313922862
		System.out.println(System.identityHashCode(cloneCircle)); // 495053715
		
		System.out.println(circle1); // ������ x = 10, y = 20, �������� 5
		System.out.println(cloneCircle); // ������ x = 10, y = 20, �������� 5
		
	}
}






