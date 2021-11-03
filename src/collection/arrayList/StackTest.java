package collection.arrayList;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		// 언더플로우 방지
		if (arrayStack.size() == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.remove(arrayStack.size() - 1);
	}	
}

public class StackTest {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		
		myStack.push("a");
		myStack.push("b");
		myStack.push("c");
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		
		System.out.println(myStack.pop());
		
	}
}