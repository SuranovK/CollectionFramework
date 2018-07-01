package CollectionOfFrameworks;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.print.attribute.standard.PrinterLocation;

public class MapDay {
	public static void main(String[] args) {
		ArrayList<Long> longlist = new ArrayList<>();
		longlist.add(100L);
		longlist.add(101L);
		longlist.add(102L);
		longlist.add(103L);
		longlist.add(104L);
		longlist.add(105L);
		longlist.add(106L);
		longlist.add(100L);
		longlist.add(101L);
		longlist.add(103L);
		longlist.add(105L);
		longlist.add(106L);
		
		System.out.println(longlist);
		
		
		SortedSet<Long> sortlong = new TreeSet<>(longlist);
		
		
		
		System.out.println(sortlong);
		
		
		//System.out.println(longlist);
		
		HashMap<Double, String> myMap = new HashMap<>();
		myMap.put(13.1, "Apple mac");
		myMap.put(15.14, "Samsung Note");
		myMap.put(24.1, "Dell");
		myMap.put(24.1, "Dell");
		myMap.put(23.1, "Dell");

		System.out.print(myMap);
		
	}
}
