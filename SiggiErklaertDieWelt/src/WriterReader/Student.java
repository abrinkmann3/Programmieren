package WriterReader;

public class Student {
	private String vorname;
	private String nachname;
	private int matnr;
	
	public Student(String vorname, String nachname, int matnr){
		this.vorname = vorname;
		this.nachname = nachname;
		this.matnr = matnr;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getMatnr() {
		return matnr;
	}

	public void setMatnr(int matnr) {
		this.matnr = matnr;
	}
	
	public String toString() {
		return (this.vorname + ", " + this.nachname + ", " + this.matnr);
	}
}
