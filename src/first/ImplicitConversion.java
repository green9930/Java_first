package first;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = bNum + lNum;
		System.out.println(dNum);
		
		// ����� �� ��ȯ
		// ����Ʈ ũ�Ⱑ ū �ڷ������� ���� �ڷ������� �Ҵ��ϴ� ��� �ڷ� �ս��� �߻��� �� �ֱ� ������ ��ȯ�� �ڷ����� ��������� ǥ���ؾ� �Ѵ�.
		int iNum = 10;
		byte byteNum = (byte)iNum;
		
		System.out.println(byteNum); // 10
		
		double dNum2 = 3.14;
		int iNum2 = (int)dNum2;
		
		System.out.println(iNum2); // 3 : ���������� �ٲ�鼭 �Ҽ��� ����
		
		// ���� : ���� �� ���� �����ؼ� 10�� 2.0�� �����ϰ� �� ������ ��Ģ ���� ����� ������ ����Ͻÿ�.
		int a = 10;
		double b = 2.0;
		
		System.out.println(a+(int)b); // 12
		
		// ���� : '��'�̶�� �ѱ� ������ �����ڵ� ���� ã�Ƽ� char������ ������ ������ ������ �� �� ������ ����Ͻÿ�
		int c = (int)'��';
		char d = (char)c;
		
		System.out.println(c); // 44544
		System.out.println(d); // ��
	}

}
