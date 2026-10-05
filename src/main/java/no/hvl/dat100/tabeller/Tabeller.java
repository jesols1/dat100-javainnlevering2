package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		int i;
		for(i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];

			if (i < tabell.length - 1) {
				resultat += ",";
			}
		}

		resultat += "]";
		System.out.println(resultat);
		return resultat;

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int i;
		for(i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		System.out.println(sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean result = false;
		int i;
		for(i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				result = true;
			}
		}

	return result;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
			return i;
			}
		}
		return -1;
		}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - 1 - i];
			System.out.println(reversert[i]);
		}

		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i+1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] fullTabell = new int[tabell1.length + tabell2.length];
		int posisjon = 0;

		for(int i = 0; i < tabell1.length; i++) {
			fullTabell[posisjon] = tabell1[i];
			posisjon++;
		}
		for(int i = 0; i < tabell2.length; i++) {
			fullTabell[posisjon] = tabell2[i];
			posisjon++;
		}
	return fullTabell;
	}
}
