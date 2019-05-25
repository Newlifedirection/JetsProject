package JetsApplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.launch();
	}

	private void launch() {
		AirField airfield = new AirField();
		displayUserMenu(airfield);
	}

	public void displayUserMenu(AirField airfield) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Main Menu, please make your selection");
		System.out.println();
		System.out.println("1: List Fleet "); // List fleet prints out the model, speed, range, and price of each jet.
		System.out.println("2: Fly all Jets "); // Fly all Jets calls fly() method on fleet, prints out the jet details
												// and the amount of time the jet can.
												// fly until it runs out of fuel (based on speed and range).
		System.out.println("3: View Fastest Jet "); // The fastest jet option print out all of the information about a
													// jet.
													// Note: these methods must search the collection of jets to find
													// the appropriate jet.
		System.out.println("4: View Jet with Longest Range "); // The view longest range options print out all of the
																// information about a jet.
																// Note: this methods mustsearch the collection of jets
																// to find the appropriate jet.
		System.out.println("5: Load all Cargo Jets ");
		System.out.println("6: Dogfight! ");
		System.out.println("7: Add a Jet to Fleet ");
		System.out.println("8: Remove a Jet from Fleet ");
		System.out.println("9: Quit ");

		int choice = kb.nextInt();
		userAction(choice, airfield);

	}

	public void addJet() {
		System.out.println("Enter model");
		System.out.println("Enter speed");
		System.out.println("Enter range");
		System.out.println("Enter price");
	}

	public void userAction(int choice, AirField airfield) {

		switch (choice) {

		case 1:
			System.out.println("1");
			airfield.printAllJets();
			break;
		case 2:
			System.out.println("2");
			airfield.flyAllJets();
			break;
		case 3:
			System.out.println("3");
			airfield.viewFastestJets();
			break;
		case 4:
			System.out.println("4");
			airfield.viewLongestRange();
			break;
		case 5:
			System.out.println("5");
			airfield.loadAllCargoJets();
			break;
		case 6:
			System.out.println("6");
			airfield.dogFight();
			break;
		case 7:
			System.out.println("7");
			airfield.addAJet();
			break;
		case 8:
			System.out.println("8");
			airfield.removeAJet();
			break;
		case 9:
			System.out.println("9");
			airfield.Quit();
			break;

		default:
			System.out.println("Good Bye ");
			break;
		}
	}

}
