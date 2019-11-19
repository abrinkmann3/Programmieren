package Sortierung;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> studenten = new ArrayList<Student>();
		
		studenten.add(new Student(123, "Hans"));
		studenten.add(new Student(133, "Günther"));
		studenten.add(new Student(874, "Harry"));
		studenten.add(new Student(997, "Dennis"));
		studenten.add(new Student(324, "Julian"));
		studenten.add(new Student(87, "Tim"));
		
		Collections.sort(studenten);
		
		for(Student s:studenten) {
			System.out.println(s.toString());
		}

	}

}
