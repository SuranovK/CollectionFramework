package CollectionOfFrameworks;

import java.util.HashMap;

public class MapTask {

	public static void main(String[] args) {
		HashMap<Double, String> myMap = new HashMap<>();
		myMap.put(13.1, "Apple mac");
		myMap.put(15.14, "Samsung Note");
		myMap.put(24.1, "Dell");
		myMap.put(24.1, "Dell");
		myMap.put(23.1, "Dell");
		myMap.put(1.1, "vvv");

		System.out.println(myMap);
		
		String getobjetc = myMap.get(13.1);
		System.out.println(getobjetc);
		
		
		
		
		if(myMap.containsKey(1.1)) {
			myMap.putIfAbsent(3.3, "sddssd");
			}
			
			
			
			
			
			
		}
		
	}


