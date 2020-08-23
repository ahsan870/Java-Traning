package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {

		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Ahsan");
		hmap.put(2, "Riyad");
		hmap.put(7, "Anik");
		hmap.put(49, "Raju");
		hmap.put(3, "Rafi");
		System.out.println("Display "+hmap);
		hmap.clear();
		System.out.println("HastMap "+hmap);
		// ---------------------------------------------
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();

		/* Adding elements to HashMap */
		lmap.put(2, "Riyad");
		lmap.put(7, "Anik");
		lmap.put(12, "Ahsan");
		lmap.put(49, "Raju");
		lmap.put(3, "Rafi");
		System.out.println("LinkedHastMap "+lmap);

		// ---------------------------------------------
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		/* Adding elements to HashMap */
		tmap.put(2, "Riyad");
		tmap.put(7, "Anik");
		tmap.put(12, "Ahsan");
		tmap.put(49, "Raju");
		tmap.put(3, "Rafi");
		System.out.println("TreeMap "+lmap);
		
		tmap.forEach((k, v) -> System.out.println("Key = "+k+"  Value = "+ v));
		
		lmap.remove(2);
		System.out.println("TreeMap, After removed "+lmap);
	}

}
