package gepjarmu;

import java.util.ArrayList;

public class Person {

	private int szulev;
	private String nev;
	private String lakcim;
	private ArrayList<Vehicle> cars = new ArrayList<>();

	public Person(int szulev, String nev, String lakcim) {
		this.szulev = szulev;
		this.nev = nev;
		this.lakcim = lakcim;
	}

	public int getSzulev() {
		return szulev;
	}

	public String getNev() {
		return nev;
	}

	public String getLakcim() {
		return lakcim;
	}

	public void addCar(Vehicle v) throws Exception {

		if (!cars.contains(v)) {
			if (!(v.getOwner()==null)) {
				throw new Exception("Ez az aut� m�r valaki tulajdon�ban van!");
			}
			cars.add(v);
			v.setOwner(this);
		} else {
			throw new Exception("Ez az aut� m�r a megadott szem�ly tulajdon�ban van!");
		}
	}

	public void removeCar(String platenum) throws Exception {
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).getRendszam().equals(platenum)) {
				cars.get(i).setOwner(null);
				cars.remove(i);
				return;
			}
		}
		throw new Exception("hib�s rendsz�m");
	}

	public ArrayList<Vehicle> listCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Person [szulev=" + szulev + ", nev=" + nev + ", lakcim=" + lakcim + "]";
	}

}
