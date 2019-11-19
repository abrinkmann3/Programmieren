package SiggErklärtDieWelt;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class KundenTableModel extends AbstractTableModel{ //erstellt die Logik hinter der KundenTableModel
	
	private ArrayList<Kunde> kundenliste = new ArrayList<Kunde>();
	private String [] columnNames = {"Kundennummer", "Name", "isAktiv?"}; //Definiert die Namen der Spalten
	
	public KundenTableModel(ArrayList<Kunde> kundenliste) {
		this.kundenliste = kundenliste;
	}
	
	public String getColumnName(int col) { //return unser Stringarray
		return columnNames[col];
	}
	
	public int getColumnCount() { //Anzahl Spalten
		return columnNames.length;
	}
	
	public int getRowCount() { //Anzahl Zeilen
		return kundenliste.size();
	}
	
	public Class getColumnClass(int col) {
		return getValueAt(0,col).getClass();
	}
	
	public Object getValueAt(int row, int col) {
		switch(col) {
		case 0: return kundenliste.get(row).getKdnr();
		case 1: return kundenliste.get(row).getName();
		case 2: return kundenliste.get(row).isAktiv();
		default: return null;
		}
	}
	
	public void setValueAt(Object value, int row, int col) {
		switch(col) {
		case 0: kundenliste.get(row).setKdnr((int)value);
		}
	}
	

	
	
	
}
