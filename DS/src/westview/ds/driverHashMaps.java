package westview.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class driverHashMaps {

	public driverHashMaps() {

	}

	public static void main(String[] args) {

		HashMap m = new HashMap<String, String>();

		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("sunny", "clouded");

		// query the map for non-existing
		// prints null
		System.out.println(m.get("study"));

		// querery for something that exists
		System.out.println(m.get("nice"));

		HashMap m2 = new HashMap<String, ArrayList<String>>();

		String[] str = new String[4];
		HashMap state = new HashMap<String, HashMap<String, String[]>>();

		// list of fav foor
		ArrayList<String> favs = new ArrayList<String>();
		favs.add("pasta");
		favs.add("ice cream");
		favs.add("pizza");

		m2.put("Julia", favs);

		System.out.println(m2.get("Julia"));

		// Hashmap with City State Confirmed Deaths Recovered Active
		// fill Hashmap
		// scanner searches for that city and state
		//

		// HashMap data = new HashMap<String, HashMap<String, String[]>>();
		// HashMap data = new HashMap<String, Integer[]>();
		HashMap data = new HashMap<String, Integer[]>();
		// State City Data
		// data[ Confirmed Deaths Recovered Active ]

		// City0 State1 Confirmed2 Deaths3 Recovered4 Active5

		// split method

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name;
		try {
			File file = new File("covid.csv");
			Scanner scanner = new Scanner(file);

			System.out.println("Enter your State below:");
			name = reader.readLine(); // taking string input
			System.out.println("Your input :" + name);

			while (scanner.hasNextLine()) {
				String[] row = scanner.nextLine().split(",");
				int[] r = new int[4];
				r[0] = Integer.parseInt(row[2]);
				r[2] = Integer.parseInt(row[4]);
				r[3] = Integer.parseInt(row[5]);

				if (row[1].equals(name)) {
					data.put(row[1], r);
					// System.out.println(data.put(row[1], row[2]));
				}
			}
			System.out.println("This data : " + Arrays.toString(data.values().toArray()));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (NumberFormatException ex) { // handle your exception
			System.out.println(ex);
		} catch (Exception e) {
		}

	}

}
