package interfaceEx;

public class MyXYClass implements MyInterface	{

	@Override
	public void x() {
		System.out.println("X()");
	}

	@Override
	public void y() {
		System.out.println("Y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		MyXYClass myClass = new MyXYClass();
		  
		X xClass = myClass;
		xClass.x();
	}
}
