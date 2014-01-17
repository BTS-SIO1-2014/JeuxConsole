package monjeux;

import java.util.Scanner;

public class Programme {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		print("Bievenu dans mon super jeux");
		print("Quel est ton nom?");
		try (Scanner sc = new Scanner(System.in)) {
			String in = sc.nextLine();
			print("Bienvenue " + in);
			Joueur joueur = new Joueur(in);
			print(joueur.toString());
			print("La partie commence!");
			print("Level 1");
			print("Voici la liste des commandes");
			Commande.afficherListeDeCommandes();

			print("Vous êtes attaqué!");
			Monstre unMonstre = new Monstre("Poney de la mort!");
			print(unMonstre.toString());
			unMonstre.attaque(joueur);
			while (joueur.pv > 0) {
				print("Que voulez vous faire?");
				in = sc.nextLine();
				if (Commande.ATTAQUE.equals(in)) {
					joueur.attaque(unMonstre);
				} else {
					unMonstre.attaque(joueur);
				}
				print(unMonstre.toString());
				print(joueur.toString());
				if (unMonstre.estMort()) {
					print("Winner!");
					break;
				}
				if (joueur.estMort()) {
					print("Looser!");
				}
			}
		}
	}

	public static void print(final String string) {
		System.out.println(string);
	}

}
