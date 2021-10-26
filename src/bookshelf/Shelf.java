package bookshelf;

import java.util.ArrayList;

public class Shelf {
	// 상속받은 클래스에서 사용 가능
	protected ArrayList<String> shelf;
	
	// default constructor
	public Shelf() {
		shelf = new ArrayList<String>();
		
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
