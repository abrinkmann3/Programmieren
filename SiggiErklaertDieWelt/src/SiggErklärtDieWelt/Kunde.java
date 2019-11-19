package SiggErklärtDieWelt;

public class Kunde {
	
	private int kdnr;
	private String name;
	private boolean isAktiv;
	
	public Kunde(int kdnr, String name, boolean isAktiv) {
		this.kdnr = kdnr;
		this.name = name;
		this.isAktiv = isAktiv;
	}
	
	public int getKdnr() {
		return kdnr;
	}
	public void setKdnr(int kdnr) {
		this.kdnr = kdnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAktiv() {
		return isAktiv;
	}
	public void setAktiv(boolean isAktiv) {
		this.isAktiv = isAktiv;
	}

	@Override
	public String toString() {
		return "Kunde [kdnr=" + kdnr + ", name=" + name + ", isAktiv=" + isAktiv + "]";
	}
	
	
	
}
