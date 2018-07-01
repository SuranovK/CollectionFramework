package collectionDay3;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPractice2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.name.substring(2).compareTo(o1.name.substring(2));
	}
	
	public static void main(String[] args) {
		Comparator<Student> studComp = new idComparator();
		
		TreeSet<Student> tstudent = new TreeSet<>();
		
		tstudent.add(new Student(1,"Adam"));
		tstudent.add(new Student(2,"Dave"));
		tstudent.add(new Student(5,"Dave"));
		tstudent.add(new Student(4,"Zain"));
		tstudent.add(new Student(2,"Bob"));
		
		//Collections.sort(tstudent, studComp);;
	    
	    System.out.println(tstudent);
		
	}
}
