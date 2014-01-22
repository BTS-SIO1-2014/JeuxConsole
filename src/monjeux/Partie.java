package monjeux;

public class Partie {

	private Joueur joueur;
	private Niveau niveau;
	private TourDeJeux tour;

	public Partie(final Joueur joueur) {
		this.joueur = joueur;
	}

	public void lancer() {
		Programme.print("La partie commence!");

		creationNiveau();

		Commande.afficherListeDeCommandes();
		this.niveau.afficherNiveau();

		this.tour = new TourDeJeux();
		this.tour.setNiveau(this.niveau);

		this.tour.resolution();
		while (!this.tour.isPartieFinie()) {
			this.tour.resolution();
		}

		Programme.print("Fin de la partie");

	}

	private void creationNiveau() {
		this.niveau = new Niveau("Prairie Infernale");
		this.niveau.setJoueur(this.joueur);
		this.niveau.setMonstre(new Monstre("Poney de la mort!"));
	}

}
