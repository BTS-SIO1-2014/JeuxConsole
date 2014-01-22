package monjeux;

public class Niveau {

	private String titre;
	private Joueur joueur;
	private Monstre monstre;

	public Niveau(final String string) {
		setTitre(string);
	}

	public void setJoueur(final Joueur joueur) {
		this.joueur = joueur;

	}

	public void setMonstre(final Monstre monstre) {
		this.monstre = monstre;

	}

	public void afficherNiveau() {
		Programme.print(getTitre());
		Programme.print(getMonstre().affichageStd());
		Programme.print(getJoueur().affichageStd());

	}

	public Joueur getJoueur() {
		return this.joueur;
	}

	public Monstre getMonstre() {
		return this.monstre;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(final String titre) {
		this.titre = titre;
	}

	public void niveauSuivant() {
		if (getMonstre().estMort()) {
			setTitre("Les enfers!!!");
			setMonstre(new Monstre("Tortue Infernale!"));
			afficherNiveau();
		}
	}

}
