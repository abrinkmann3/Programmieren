package WriterReader;

import java.io.*;

public class ReaderMain {

	public static void main(String[] args) {
		
		File file = new File("/Users/stranghoener/Desktop/ProgDataLAger/StudentenTest");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String zeile;
			
			while((zeile = br.readLine()) != null) {
				System.out.println(zeile);
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
