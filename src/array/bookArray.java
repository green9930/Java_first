package array;

// 책 정보 관리하는 배열 생성
public class bookArray {
	public static void main(String[] args) {
		
		// Book 5개가 만들어지는 것이 아니라 
		// Book 5개가 담길 공간의 주소를 만들어놓는 것
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		// 객체 배열은 각각의 인스턴스를 생성해서 배열에 넣어야 한다.
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
