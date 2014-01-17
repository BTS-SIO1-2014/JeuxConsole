package monjeux;

public class Monstre extends Entities {

	public Monstre(final String nom) {
		super(nom);

	}

	@Override
	public String toString() {
		return "Monstre: " + super.affichageStd();
	}

	public void attaque(final Joueur joueur) {
		Programme.print("Coup de la mort!");
		joueur.perd(2);

	}

	public void perd(final int i) {
		this.pv = this.pv - i;

	}

}
