package object;

class Book {
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + ", " + author;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book = new Book("Harry Potter", "J.K.Rowling");
		System.out.println(book); // Object.Book@2f4d3709

		String str = new String("test");
		System.out.println(str); // test : String 클래스에 toString() 메서드가 이미 재정의되어이 있기 때문
		
		Book bookString = new Book("11/22/63", "Stephen King");
		System.out.println(bookString.toString()); // 11/22/63, Stephen King

	}
}
