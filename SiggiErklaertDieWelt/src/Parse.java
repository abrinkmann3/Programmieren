
public class Parse {

	public static void main(String[] args) {
		
		String zahl = "40";
		
		int umgewandelt = 0;
		
		
		try {
			umgewandelt = Integer.parseInt(zahl) * 2;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(umgewandelt);
		
		
	}

}
