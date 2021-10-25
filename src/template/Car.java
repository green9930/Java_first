package template;

public abstract class Car {
	
	// 차가 달리고 멈추는 방식은 차의 종류에 따라 다르기 때문에 Car 클래스에서 선언할 수 없음
	// 추상 클래스
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();

	// 추상 클래스가 아니기 때문에 ManualCar, AICar에서 구현하지 않아도 오류가 발생하지 않는다.
	// 필요에 의해 재정의 할 때 사용 (재정의는 필수 아님) 
	public void washCar() {	};
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	// Car의 시나리오는 언제나 동일함 (시나리오는 바뀌면 안되니까 final 선언)
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
