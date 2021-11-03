package generics;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<Powder>();
		printer1.setMaterial(new Powder());
		// getMaterial() 매개변수가 Object형이므로 Powder로 다운캐스팅
//		Powder powder = (Powder)printer.getMaterial();
		// 그러나 ThreeDPrinter.java에서 제네릭 클래스로 정의하면 컴파일러가 자동으로 타입 캐스팅함
		Powder powder = printer1.getMaterial();
		
		System.out.println(printer1); // 재료는 파우더입니다.
		printer1.printing(); // 파우더 재료로 출력합니다.
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2); // 재료는 플라스틱입니다.

		// Material을 상속받지 않은 Water 클래스는 생성될 수 없음
//		ThreeDPrinter<Water> printer3 = new ThreeDPrinter<Water>();
//		printer3.setMaterial(new Water());
//		Water water = printer3.getMaterial();
//		
//		System.out.println(printer3); // 재료는 물입니다.
		
		
	}
}
