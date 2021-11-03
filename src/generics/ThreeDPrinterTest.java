package generics;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<Powder>();
		printer1.setMaterial(new Powder());
		// getMaterial() �Ű������� Object���̹Ƿ� Powder�� �ٿ�ĳ����
//		Powder powder = (Powder)printer.getMaterial();
		// �׷��� ThreeDPrinter.java���� ���׸� Ŭ������ �����ϸ� �����Ϸ��� �ڵ����� Ÿ�� ĳ������
		Powder powder = printer1.getMaterial();
		
		System.out.println(printer1); // ���� �Ŀ���Դϴ�.
		printer1.printing(); // �Ŀ�� ���� ����մϴ�.
		
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		
		System.out.println(printer2); // ���� �ö�ƽ�Դϴ�.

		// Material�� ��ӹ��� ���� Water Ŭ������ ������ �� ����
//		ThreeDPrinter<Water> printer3 = new ThreeDPrinter<Water>();
//		printer3.setMaterial(new Water());
//		Water water = printer3.getMaterial();
//		
//		System.out.println(printer3); // ���� ���Դϴ�.
		
		
	}
}
