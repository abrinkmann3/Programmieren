public class Student{

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
		return "Student [name=" + name + ", geburtstag=" + geburtstag + ", matrnr=" + matrnr + "]";
	}
	
	
}
