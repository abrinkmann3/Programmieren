package WriterReader;

import java.io.*;
import java.util.ArrayList;

import edu.princeton.cs.introcs.StdIn;

public class MainStuff {

	public static void main(String[] args) {
		
		
		ArrayList<Student> studenten = new ArrayList<Student>();
		
		studenten.add(new Student("Tim", "Stranghöner", 12345));
		studenten.add(new Student("Steve", "Keim", 12345));
		
		File file;
		
		do {
			System.out.println("Bitte geben Sie einen Filenamen ein");
			//String name = StdIn.readLine();
			String name = "StudentenTest";
			file = new File("/Users/stranghoener/Desktop/ProgDataLAger", name);
		
			if(file.exists()) {
				System.out.println("Dateiname ist bereits vergeben");
			}
		}
		while(file.exists());
		
			try {
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				
				for(Student s:studenten) {
					bw.write(s.toString());
					bw.newLine();
				}
				bw.close();
				fw.close();
				System.out.println("Die Datei wurde erstellt");
			} catch (IOException e) {
				System.out.println("File konnte nicht beschrieben werden");
				e.printStackTrace();
			}
			
		
	}

}
