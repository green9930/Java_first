package classpart;

public class PersonMain {
	
	public static void main(String[] args) {
		
//		Person Lee = new Person();
		Person me = new Person("Bae", "Seoul");
		Person you = new Person("Kim", "New York");
		
		System.out.println(me); // classpart.Person@2f4d3709
		me.printName(); // Bae
		me.printAddress(); // Seoul
		you.printName(); // Kim
		you.printAddress(); // New York
	}

}
