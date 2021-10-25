package array;
 
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(String letter : list) {
			System.out.println(letter);
			
		}
	}
}
