package bookshelf;

import java.util.ArrayList;

public class Shelf {
	// ��ӹ��� Ŭ�������� ��� ����
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
