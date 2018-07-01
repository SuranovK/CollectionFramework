package collectionDay3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		// Create a scanner object
		// Create a list of names by taking user input
		// include few duplicates
		// and find out how many unique elements

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the names: ");

		List<String> names = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			names.add(scanner.nextLine());
		}
		
		
		//Another way to count unique elements
		//int aaaFrequency = Collections.frequency(names, "AAA");

		SortedSet<String> sortName = new TreeSet<>(names);

		System.out.println("Names are displayed " + names);

		System.out.println("Sorted version " + sortName);
		
		
		// for(String eachSet: set) {
	    // int count=0;
	    // for(String each: names) {
	    // if(eachSet.equals(each)) {
	    // count++;
	    // }
	    // }
	    // System.out.println("String:"+eachSet+" count: "+count);
	  }

	  // Optional Task
	  // find out exactly how many time a name showed up

	

	

}
