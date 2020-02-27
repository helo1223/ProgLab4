package gepjarmu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(1998, "HUHU20201", "koccsento");
		Vehicle v2 = new Vehicle(2005, "HUHU20202", "koccsento2");
		Person p1 = new Person(1998, "Ember Ember", "1234 J�v�ros, December utca 42.");
		Person p2 = new Person(1998, "Felfedez� D�ra", "1235 Rosszv�ros, Janu�r utca 1.");

		ArrayList<Vehicle> autok = new ArrayList<>();
		ArrayList<Person> emberek = new ArrayList<>();
		autok.add(v1);
		autok.add(v2);

		emberek.add(p1);
		emberek.add(p2);

		try {
			p1.addCar(v1);
			p1.addCar(v2);
			p2.addCar(v1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			p1.removeCar(v1.getRendszam());
			p1.removeCar(v1.getRendszam());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(p1.listCars());

		ArrayList<Vehicle> oldC = oldCars(autok, 2000); //2000-es �v el�tt gy�rtott aut�k
		ArrayList<Person> oldP = oldOwners(emberek);
		for (Person person : oldP) {
			System.out.println(person.getNev());
		}
		for (Vehicle vehicle : oldC) {
			System.out.println(vehicle);
		}

	}

	public static ArrayList<Vehicle> oldCars(ArrayList<Vehicle> autok, int gye) {
		ArrayList<Vehicle> old = new ArrayList<>();
		for (int i = 0; i < autok.size(); i++) {
			if (autok.get(i).getGye() < gye) {
				old.add(autok.get(i));
			}
		}
		return old;

	}

	public static ArrayList<Person> oldOwners(ArrayList<Person> emberek) {
		ArrayList<Person> old = new ArrayList<>();
		for (int i = 0; i < emberek.size(); i++) {
			for (int j = 0; j < emberek.get(i).listCars().size(); j++) {
				if (emberek.get(i).listCars().get(j).getGye() < 2010 && !old.contains(emberek.get(i))) {
					old.add(emberek.get(i));
				}
			}

		}
		return old;

	}

}
