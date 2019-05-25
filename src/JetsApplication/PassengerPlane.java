package JetsApplication;

public class PassengerPlane extends Jet implements CargoCarrier{


	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

				public void loadPassengers() {  //method to load passangers
				System.out.println("Load cargo front to back.");
				System.out.println("Don't forget to load passangers.");

	}
}
