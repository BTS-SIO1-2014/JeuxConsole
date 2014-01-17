package monjeux;

public class Joueur extends Entities {

	public Joueur(final String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return "Joueur: " + super.affichageStd();
	}

	public void perd(final int i) {
		this.pv = this.pv - 2;

	}

	public void attaque(final Monstre unMonstre) {
		Programme.print("Coup de pied");
		unMonstre.perd(3);

	}
}
