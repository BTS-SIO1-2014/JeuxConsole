package monjeux;

public class Niveau {

	private String titre;
	private Joueur joueur;
	private Monstre monstre;

	public Niveau(final String string) {
		this.titre = string;
	}

	public void setJoueur(final Joueur joueur) {
		this.joueur = joueur;

	}

	public void setMonstre(final Monstre monstre) {
		this.monstre = monstre;

	}

	public void afficherNiveau() {
		Programme.print(this.titre);
		Programme.print(getMonstre().affichageStd());
		Programme.print(getJoueur().affichageStd());

	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public Monstre getMonstre() {
		return this.monstre;
	}

}
