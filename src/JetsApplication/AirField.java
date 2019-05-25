package JetsApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	private List<Jet> allJets;

	public AirField() {
		super();
		allJets = new ArrayList<Jet>();
		readInfoFromJetsFile();
	}

	private void readInfoFromJetsFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {

				String[] jetParts = line.split(", ");
				String type = jetParts[0];
				String model = jetParts[1];
				int range = Integer.parseInt(jetParts[2]);
				double speed = Double.parseDouble(jetParts[3]);
				long price = Long.parseLong(jetParts[4]);

				if (type.equals("Fighter")) {
					FighterJet fighterJet = new FighterJet(model, speed, range, price);
					allJets.add(fighterJet);
				}
				if (type.equals("Cargo")) {
					CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
					allJets.add(cargoPlane);
				}
				if (type.equals("Passenger")) {
					PassengerPlane passengerPlane = new PassengerPlane(model, speed, range, price);
					allJets.add(passengerPlane);
				} else {
					CargoPassenger cargoPassenger = new CargoPassenger(model, speed, range, price);
					allJets.add(cargoPassenger);
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printAllJets() {
		for (Jet jet : allJets) {
			System.out.println(jet);
		}
	}

	public void flyAllJets() {
		for (Jet flyjet : allJets) {
			flyjet.fly();
		}
	}

	public void viewFastestJets() {
		double highestSpeed = 0;
		Jet tempJet = null;
		for (Jet fastjet : allJets) {
			if(fastjet.getSpeed()> highestSpeed) {
				highestSpeed = fastjet.getSpeed();
				tempJet = fastjet;
			}
		}
		System.out.println("The fastest jet is: " + tempJet);
	}

	public void viewLongestRange() {
		int longRange = 0;
		Jet tempRange = null;
		for (Jet longestrange : allJets) {
			if(longestrange.getRange()> longRange) {
				longRange = longestrange.getRange();
				tempRange = longestrange;
			}
		}
		System.out.println("The longest range jet is: " + tempRange);
	}

	public void loadAllCargoJets() {
		for (Jet jet : allJets) {
			if(jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
				System.out.println();
			}
		}
	}

	public void dogFight() {
		for (Jet f : allJets) {
			if(f instanceof CombatReady) {
				((CombatReady) f).fight();
				System.out.println();
			}
		}
	}

	public void addAJet(Scanner kb) {
		kb.nextLine();
		System.out.println("Enter model");
		String model = kb.nextLine();
		System.out.println("Enter speed");
		double speed = kb.nextDouble();
		System.out.println("Enter range");
		int range = kb.nextInt();
		System.out.println("Enter price");
		long price = kb.nextLong();
		System.out.println("Type of aircraft: (fighter/cargo/passenger)");
		String type = kb.next();
		
		if (type.equalsIgnoreCase("Fighter")) {
			FighterJet fighterJet = new FighterJet(model, speed, range, price);
			allJets.add(fighterJet);
		}
		if (type.equalsIgnoreCase("Cargo")) {
			CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
			allJets.add(cargoPlane);
		}
		if (type.equalsIgnoreCase("Passenger")) {
			PassengerPlane passengerPlane = new PassengerPlane(model, speed, range, price);
			allJets.add(passengerPlane);
		}
	}
	public void removeAJet(Scanner kb) {
		System.out.println("Select a model to delete: ");
		for (int i = 0; i < allJets.size(); i++) {
			System.out.println(i + " " + allJets.get(i));
		}
		int choice = kb.nextInt();
		allJets.remove(choice);
	}

	public void Quit() {
		for (Jet quit : allJets) {
		}
	}

	private List<String> makeListsOfInfo() {
		List<String> jetList = new ArrayList<String>(); // makes a vertical list (with multiple rows) composed of
														// horizontal lists of string names.
		for (int i = 0; i < jetList.size(); i++) { // must analyze each name in the list of info.
		}
		return jetList;
	}
}
