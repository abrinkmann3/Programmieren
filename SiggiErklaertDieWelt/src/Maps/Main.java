package Maps;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studenten = new HashMap<Integer, Student>();
		
		Student s1 = new Student("Peter", "05.09.1978", 7653);
		Student s2 = new Student("Wolfgang", "07.04.1958", 9489);
		Student s3 = new Student("Marie", "12.19.1990", 2234);
		
		studenten.put(342, s1);
		studenten.put(533, s2);
		studenten.put(783, s3);
		
		System.out.println(studenten.get(342));

	}

}
