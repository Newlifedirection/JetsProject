package JetsApplication;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println("Watch your 6.");
		System.out.println("Remember to use your turn signal.");
	}

}
