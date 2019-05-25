package JetsApplication;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
		
	public void loadCargo() {

		System.out.println("Do Not exceed load capacity.");
		System.out.println("Load items one by one.");
	}
}

