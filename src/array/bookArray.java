package array;

// å ���� �����ϴ� �迭 ����
public class bookArray {
	public static void main(String[] args) {
		
		// Book 5���� ��������� ���� �ƴ϶� 
		// Book 5���� ��� ������ �ּҸ� �������� ��
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// ��ü �迭�� ������ �ν��Ͻ��� �����ؼ� �迭�� �־�� �Ѵ�.
		library[0] = new Book("Harry Potter1", "J.K.Rolling");
		library[1] = new Book("Harry Potter2", "J.K.Rolling");
		library[2] = new Book("Harry Potter3", "J.K.Rolling");
		library[3] = new Book("Harry Potter4", "J.K.Rolling");
		library[4] = new Book("Harry Potter5", "J.K.Rolling");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
