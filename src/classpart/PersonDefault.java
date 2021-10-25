package classpart;

public class PersonDefault {

	public static void main(String[] args) {

		PersonMainDefault personLee = new PersonMainDefault();
		personLee.name = "Lee";
		
		System.out.println(personLee); // classpart.PersonMainDefault@2f4d3709
		System.out.println(personLee.name); // Lee
		
	}

}
