package JetsApplication;

public class CargoPassenger extends Jet implements CargoCarrier{

	public CargoPassenger(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

}