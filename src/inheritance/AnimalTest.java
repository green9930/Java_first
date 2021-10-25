package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �޸��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
		
	}
	
	// Human, Tiger, Eagle �����ڰ� �Ű������� ���͵� Animal Ŭ������ ��ĳ��ƿ
	public void moveAnimal(Animal animal) {
		animal.move();
		
		// (Human) readBook �޼��带 ����Ϸ��� �ٿ�ĳ�����ؾ���
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();			
		}
		// (Tiger) hunting �޼��带 ����Ϸ��� �ٿ�ĳ�����ؾ���
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
	}
}
