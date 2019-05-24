package JetsApplication;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	private void jets() {
		}
	
	private List<String> makeListsOfInfo() {
        List<String> jetList = new ArrayList<String>(); //makes a vertical list (with multiple rows) composed of horizontal lists of string names.
        for (int i = 0; i < jetList.length; i++) { // must analyze each name in the list of info.
            jetList.add(new ArrayList<String>()); //we must create a vertical list, with each row containing an array.
            jetList.remove(new ArrayList<String>()); //we must be able to remove items from the array list
        }
	}
}
