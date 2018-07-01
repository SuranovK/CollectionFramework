package collectionDay3;

import java.util.*;

public class OtherVersion {
	public static void main(String[] args) {
		
		
		
		 /// if your key does not exists in the map yet 
        // --> your count will be 1 
      /// if it already exists your cournt will be 
         // existing value incremented by 1 
      
      //freMap.put(each, 0) ; 
		List<String> names = Arrays.asList("Asanbai","Asanbai","Adam","Frank","Kylie");
		Map<String, Integer> freMap = new HashMap<>();
		
		
			
		for (String each : names) {
			if(! freMap.containsKey(each)) {
			freMap.put(each, 1);
		}else {
			int count = freMap.get(each);
			freMap.put(each,count+1);
		}
			
		
		}
	System.out.println(freMap);
	
	
	String word = "ABCDATYUIO";
	
	Map<Character, Integer> table = new HashMap<>();
	
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(!table.containsKey(letter)) {
				table.put(letter, 1);
			}else
			{
				Integer count = table.get(letter);
				table.put(letter,count + 1);
			}
		}
	System.out.println(table);
	
	
		
	
	}
	}
		
	


