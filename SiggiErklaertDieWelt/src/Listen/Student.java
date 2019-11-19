package Listen;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	private String name;
	private String geburtstag;
	private int matrnr;
	
	public Student(String name, String geburtstag, int matrnr) {
		this.name = name;
		this.geburtstag = geburtstag;
		this.matrnr = matrnr;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}

	public int getMatrnr() {
		return matrnr;
	}

	public void setMatrnr(int matrnr) {
		this.matrnr = matrnr;
	}

	@Override
	public String toString() {
		return ("Student Name: " + name + ", Geburtstag: " + geburtstag + ", Matnr: " + matrnr);
	}
	
	public static class StudentNameCompAsc implements Comparator<Student>{ //einmal der Bums mit Comparator
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
		}
	}

	public int compareTo(Student s) { //einmal genau das selbe als compareTo, es lassen sich jedoch nur Zahlen miteinander vergleichen
			return this.getName().compareTo(s.getName());
	}
	
	
	
}
