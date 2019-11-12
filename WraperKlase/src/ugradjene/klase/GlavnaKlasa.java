package ugradjene.klase;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		/*
		 * char karakter = '9';
		 * 
		 * Enkapsulacije.daLiJeSlovo(karakter);
		 * 
		 * String x = "2"; String y = "5";
		 * 
		 * int prviBroj = Integer.parseInt(x); int drugiBroj = Integer.parseInt(y);
		 * 
		 * System.out.println(prviBroj + drugiBroj);
		 */
		
		// kontakenacija stringova
		
		String a = "Pera";
		String b = "Detlic";
		
		System.out.println(a + b);
		
		StringBuilder builder = new StringBuilder();
			builder.append(a);
			builder.append(b);
			
		System.out.println(builder);
			
		// duzina stringa
		
		String rec = "prestolonaslednikovica";
		Enkapsulacije.brojacSlova(rec);
			
		
		
		
		// prolzak kroz String i uzimanje karaktera
		
		String password = "Mi ucimo javu!";
		
		
		
		
		
		
	}

}
