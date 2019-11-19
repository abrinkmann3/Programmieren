package KalenderAufstellen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String[] args) {
		
		GregorianCalendar cal = new GregorianCalendar();
		
		DateFormat sdf = new SimpleDateFormat("EEEE', der 'dd.MM.yyyy' um 'hh:mm' Uhr'");
		
		System.out.println(sdf.format(cal.getTime()));
		
		
		
		DateFormat datekurz = new SimpleDateFormat("dd.MM.yyyy");
		
		String d1 = "25.06.2019";
		String d2 = "24.12.2019";
		
		try {
			long dif = datekurz.parse(d2).getTime() -datekurz.parse(d1).getTime();
			dif = (dif/(1000*60*60*24));
			System.out.println("Die Differenz beträgt: " + dif + " Tage");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

}
