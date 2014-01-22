package monjeux;

public class Jeux {

	private String title;

	public void setTitle(final String string) {
		this.title = string;
	}

	public void lancerPartie() {

		Joueur joueur = new Joueur();
		joueur.quelEstTonNom();
		Partie partie = new Partie(joueur);
		partie.lancer();
	}

	public void afficherTitre() {
		Programme.print(this.title);

	}

}
