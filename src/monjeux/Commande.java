package monjeux;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	public static List<Commande> listeDeCommandes = new ArrayList<>();

	public static final Commande ATTAQUE = new Commande("attaque");
	public static Commande HAUT = new Commande("haut");
	public static Commande BAS = new Commande("bas");
	public static Commande DROITE = new Commande("droite");
	public static Commande GAUCHE = new Commande("gauche");

	static {
		listeDeCommandes.add(Commande.BAS);
		listeDeCommandes.add(Commande.HAUT);
		listeDeCommandes.add(Commande.GAUCHE);
		listeDeCommandes.add(Commande.DROITE);
	}

	String nom;

	public Commande(final String nomDeLaCommande) {
		this.nom = nomDeLaCommande;
	}

	@Override
	public String toString() {
		return this.nom;
	}

	public static void afficherListeDeCommandes() {
		Programme.print("Voici la liste des commandes");
		for (Commande com : Commande.listeDeCommandes) {
			Programme.print(com.toString());
		}
	}

	@Override
	public boolean equals(final Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof String) {
			return ((String) obj).equals(this.nom);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
