package in.arc.beans;

public class Car {

	private IEngine engine;
	public Car() {		
		System.out.println("Car.Car() 0 param constructor");
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	public Car(IEngine engine) {
		this.engine=engine;
		System.out.println("Car.Car() 2param constructor");
	}

	public void setEngine(IEngine engine) {
		this.engine=engine;
		System.out.println("Car.setEngineType() setted through setter..");
	}
	
	public void drive(int passCode) {
		boolean status = engine.start(passCode);
		if(status) {
			System.out.println("Car.drive() starting journey..");
		}else {
			System.out.println("Car.drive() passcode not matched.. try with correct passCode..");
		}
		
	}
	
}
