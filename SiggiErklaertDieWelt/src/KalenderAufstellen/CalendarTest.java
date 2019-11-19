package KalenderAufstellen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();

		// Ausgabe mit Methoden der Klasse gregorianCalendar
//				System.out.println(cal);	
//				System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH) 
//						+ "." + (cal.get(GregorianCalendar.MONTH)+1) 
//						+ "." + cal.get(GregorianCalendar.YEAR));	
//				System.out.printf("%02d.%02d.%4d\n",cal.get(GregorianCalendar.DAY_OF_MONTH),
//												   (cal.get(GregorianCalendar.MONTH)+1),
//												    cal.get(GregorianCalendar.YEAR));

		// Formattoerte Ausgabe
		DateFormat dtf = DateFormat.getTimeInstance();
		System.out.println("Aktuelle Uhrzeit " + dtf.format(cal.getTime()));

		DateFormat df = DateFormat.getDateInstance();
		System.out.println("Heute ist der " + df.format(cal.getTime()));

		// Komplexere Formattierung
		DateFormat sdf = new SimpleDateFormat("d.M.yyyy");
		System.out.println("Heute ist der " + sdf.format(cal.getTime()));

		DateFormat sdf2 = new SimpleDateFormat("EEEE', den 'dd.MM.yyyy' um 'hh:mm' Uhr'");
		System.out.println(sdf2.format(cal.getTime()));

		sdf2.format(cal.get(GregorianCalendar.DAY_OF_MONTH) + 5);
		
		
		System.out.println(cal.get(GregorianCalendar.DAY_OF_MONTH) + "." + (cal.get(GregorianCalendar.MONTH)+1) + "." + cal.get(GregorianCalendar.YEAR));
		
	}

}
