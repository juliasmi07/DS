package westview.ds;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class driverHashMaps {

	public driverHashMaps() {
		
	}
		
	public static void main(String[] args) {
	
		HashMap m  = new HashMap<String, String>();
		
		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("sunny", "clouded");
		
		//query the map for non-existing
		//prints null
		System.out.println(m.get("study"));
		
		//querery for something that exists
		System.out.println(m.get("nice"));

		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		String[] str = new String[4];		
		HashMap state = new HashMap<String, HashMap<String, String[]>>();

		//list of fav foor
		ArrayList<String> favs = new ArrayList<String>();
		favs.add("pasta");
		favs.add("ice cream");
		favs.add("pizza");

		
		m2.put("Julia", favs);
		
		System.out.println(m2.get("Julia"));

		
		//Hashmap with City	State	Confirmed	Deaths	Recovered	Active
		//fill Hashmap
		//scanner searches for that city and state
		//
		
		
		HashMap data = new HashMap<String, HashMap<String, String[]>>();
									//State     City       Data
			//data[ Confirmed	Deaths	Recovered	Active ]
							
	
		//split method 
		try {
			File file = new File("covid.csv");
			Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
		String[] row = scanner.nextLine().split(",");
		//System.out.print(str.);
		//data.put(row[1],row[0]+row[2,row.length] );
		
		}
		
		} catch (FileNotFoundException e) {
		System.out.println(e);
		}
	}
		
	
}
