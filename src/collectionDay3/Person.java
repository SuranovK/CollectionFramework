package collectionDay3;

public class Person implements Comparable<Person> {

	  String name;
	  int age ;
	  
	  /// Modify compareTo method to compare age instead of names 
	  // and call your collections.Sort method in other class
	  
	  @Override
	  public int compareTo(Person o) {   
		  //return this.name.compareTo(o.name);
		  ////return o.name.compareTo(this.name);
		  
	    return this.age-o.age;
	    /*
	     * //Ascending
		//int n = this.name.compareTo(o.name);
		
		//Descending
		int n = o.name.compareTo(this.name);
		
		//Ascending
		//int a = this.age - o.age;
		
		//Descending
		int a = o.age - this.age;
		
		if(!this.name.equals(o.name))
			return n;
		else return a;
		}
		
	*/
	 // Task 3 
        /*
         * Compare by both name and age 
         * compare with name first in ascending order 
         * then compare by age in descending order
         * 
         * if(this.name.equals(o.name))
            return o.age-this.age;
          else
            return this.name.compareTo(o.name) ;
         * 
         * */
	  }	  
	  
	  

	  public String getName() {
	    return name;
	  }
	  public int getAge() {
	    return age;
	  }
	  public Person(String name, int age) {
	    super();
	    this.name = name;
	    this.age = age;
	  }
	  
	  @Override
	  public String toString() {
	    return "Person [name=" + name + ", age=" + age + "]";
	  }
	  
	  
	  
	  
	  
	  
	}