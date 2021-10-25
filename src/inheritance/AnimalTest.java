package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 달립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
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
	
	// Human, Tiger, Eagle 생성자가 매개변수로 들어와도 Animal 클래스로 업캐스틸
	public void moveAnimal(Animal animal) {
		animal.move();
		
		// (Human) readBook 메서드를 사용하려면 다운캐스팅해야함
		if (animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();			
		}
		// (Tiger) hunting 메서드를 사용하려면 다운캐스팅해야함
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
	}
}
