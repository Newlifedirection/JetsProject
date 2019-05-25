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
		displayUserMenu();
	}

	public void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Main Menu, please make your selection");
		System.out.println();
		System.out.println("1: List Fleet "); // List fleet prints out the model, speed, range, and price of each jet.
												// (There must be at least 5 jets stored when the program starts).
		System.out.println("2: Fly all Jets "); // Fly all Jets calls the fly() method on the entire fleet of jets.
												// fly() prints out the jet details and the amount of time the jet can
												// fly until it runs out of fuel (based on speed and range).
		System.out.println("3: View Fastest Jet "); // The view fastest jet option print out all of the information
													// about a jet. Note: these methods must search the collection of
													// jets to find the appropriate jet.
		System.out.println("4: View Jet with Longest Range "); // The view longest range options print out all of the
																// information about a jet. Note: these methods must
																// search the collection of jets to find the appropriate
																// jet.
		System.out.println("5: Load all Cargo Jets ");
		System.out.println("6: Dogfight! ");
		System.out.println("7: Add a Jet to Fleet ");
		System.out.println("8: Remove a Jet from Fleet ");
		System.out.println("9: Quit ");

		int choice = kb.nextInt();
	}
}
