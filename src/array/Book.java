package array;

public class Book {
	private String bookName;
	private String author;
	
	// Book 디폴트 생성자
	public Book() {};
	// Book constructor
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// Book 정보 안내하는 메서드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
}
