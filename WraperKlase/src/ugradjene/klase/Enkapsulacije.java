package ugradjene.klase;

public class Enkapsulacije {

	public static void daLiJeSlovo (char karakter) {
		
		boolean s = Character.isLetter(karakter);
		if (s) {
			System.out.println("Ovo je slovo");
		}else {
			System.out.println("Ovo nije slovo");
		}
		
	}
	
	public static void brojacSlova(String rec) {
		
		System.out.println("Ova rec ima " + rec.length() + " slova");
	}
	
	
	
	
	
	
	
	
	
	
	
}
