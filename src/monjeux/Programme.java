package monjeux;

import java.util.Scanner;

public class Programme {

	public static Scanner in = new Scanner(System.in);

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		Jeux jeux = new Jeux();
		jeux.setTitle("Mon super jeux");
		jeux.afficherTitre();
		jeux.lancerPartie();
	}

	public static void print(final String string) {
		System.out.println(string);
	}

}
