package collectionDay3;

import java.util.Comparator;

public class ReverseName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int n= o2.name.compareTo(o1.name);
		
		return n;
	}

	
	
}
