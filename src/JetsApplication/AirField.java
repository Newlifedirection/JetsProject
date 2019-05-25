package JetsApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	
	private List<Jet> allJets;

	
	public AirField() {
		super();
		allJets = new ArrayList<Jet>();
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
				
				if(type.equals("Fighter")) {
					FighterJet fighterJet = new FighterJet(model, speed, range, price);
					allJets.add(fighterJet);
				}
				if(type.equals("Cargo")) {
					CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
					allJets.add(cargoPlane);
				}
				if(type.equals("Passenger")) {
					PassengerPlane passengerPlane = new PassengerPlane(model, speed, range, price);
					allJets.add(passengerPlane);
				}
				else {
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

	private List<String> makeListsOfInfo() {
		List<String> jetList = new ArrayList<String>(); // makes a vertical list (with multiple rows) composed of
														// horizontal lists of string names.
		for (int i = 0; i < jetList.size(); i++) { // must analyze each name in the list of info.
//			jetList.add(new ArrayList<String>()); // we must create a vertical list, with each row containing an array.
//			jetList.remove(new ArrayList<String>()); // we must be able to remove items from the array list
		}
		return jetList;
	}
}
