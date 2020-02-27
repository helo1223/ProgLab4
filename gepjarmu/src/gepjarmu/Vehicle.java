package gepjarmu;

public class Vehicle {
	private int gye; // gyártás éve
	private String rendszam;
	private String tipus;
	private Person owner;

	public Vehicle(int gye, String rendszam, String tipus) {
		this.gye = gye;
		this.rendszam = rendszam;
		this.tipus = tipus;
	}

	public int getGye() {
		return gye;
	}

	public String getRendszam() {
		return rendszam;
	}

	public String getTipus() {
		return tipus;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [gye=" + gye + ", rendszam=" + rendszam + ", tipus=" + tipus + ", owner=" + owner + "]";
	}

}
