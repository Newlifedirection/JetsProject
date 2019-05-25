package JetsApplication;

public abstract class Jet {

	//	fields
	private String model;
	private double speed;
	private int range;
	private long price;
	
//	methods
	
public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}


	public double calculateMachToMPH() {
			double calcSpeed = 0;
			return calcSpeed;
		}

	public int calcRange() {
			int calcRange = 0;
			return calcRange;
		}

	public double getSpeedInMach(double speed) {
		return 0.0;
	}
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
			System.out.println("Airplane Specs ");
			System.out.println();
			System.out.println("The Model is " + model);
			System.out.println("The speed is " + speed + "MPH" + "Mach" + speed);
			System.out.println("The range is " + range + "Miles");
			System.out.println("The price is $" + price);
		}

	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}

}
