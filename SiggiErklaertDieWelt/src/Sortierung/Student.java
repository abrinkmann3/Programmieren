package Sortierung;

public class Student implements Comparable<Student>{

	private int matrnr;
	private String name;
	
	public Student(int matrnr, String name) {
		this.matrnr = matrnr;
		this.name = name;
	}

	public int getMatrnr() {
		return matrnr;
	}

	public void setMatrnr(int matrnr) {
		this.matrnr = matrnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Matrikelnummer: " + this.matrnr + ", Name: " + this.name;
	}
	
	public int compareTo(Student o) {
		return this.matrnr - o.getMatrnr();
	}

}
