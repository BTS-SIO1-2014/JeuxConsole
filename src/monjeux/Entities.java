package monjeux;

public abstract class Entities {
	private String nom;
	protected int pv;

	public Entities(final String nom) {
		this.nom = nom;
		this.pv = 10;
	}

	public String affichageStd() {
		return this.nom + " PV:" + this.pv;
	}

	public boolean estMort() {
		return this.pv <= 0;
	}
}
