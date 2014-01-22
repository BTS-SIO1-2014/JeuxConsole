package monjeux;

public class TourDeJeux {

	private Niveau niveau;

	public void setNiveau(final Niveau niveau) {
		this.niveau = niveau;

	}

	public void resolution() {
		String choix = choix();
		if (Commande.ATTAQUE.equals(choix)) {
			this.niveau.getJoueur().attaque(this.niveau.getMonstre());
		} else {
			this.niveau.getMonstre().attaque(this.niveau.getJoueur());
		}
		this.niveau.afficherNiveau();

	}

	private String choix() {
		Programme.print("Que voulez vous faire?");
		return Programme.in.nextLine();
	}

	public boolean isPartieFinie() {
		if (this.niveau.getMonstre().estMort()) {
			Programme.print("Winner!");
			return true;
		}
		if (this.niveau.getJoueur().estMort()) {
			Programme.print("Looser!");
			return true;
		}
		return false;
	}

}
