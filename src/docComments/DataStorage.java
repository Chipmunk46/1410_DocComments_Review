package docComments;

import java.util.ArrayList;

public class DataStorage {
	// Create arraylist to store consoles
	private ArrayList<Console> consoleList;
	
	// Create hardcoded console objects to pass to the arraylist.
	Console ps4 = new Console(dimensions, controller, storageSize, avOutput);
	Console xboxone = new Console(dimensions, controller, storageSize, avOutput);
	Console nintendoSwitch = new Console(dimensions, controller, storageSize, avOutput);
	Console pc = new Console(dimensions, controller, storageSize, avOutput);
	
	
}
