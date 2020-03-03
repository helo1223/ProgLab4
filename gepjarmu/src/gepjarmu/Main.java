package gepjarmu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(1998, "HUHU20201", "koccsento");
		Vehicle v2 = new Vehicle(2005, "HUHU20202", "koccsento2");
		Person p1 = new Person(1998, "Ember Ember", "1234 Jóváros, December utca 42.");
		Person p2 = new Person(1998, "Felfedező Dóra", "1235 Rosszváros, Január utca 1.");

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

		System.out.println(oldCars(autok, 10));
		
		
		ArrayList<Person> oldP = oldOwners(emberek);
		for (Person person : oldP) {
			System.out.println(person.getNev());
		}

	}

	public static int oldCars(ArrayList<Vehicle> autok, int idos) {
		int db = 0;
		for (int i = 0; i < autok.size(); i++) {
			if (autok.get(i).getGye() < 2020 - idos) {
				db++;
			}
		}
		return db;

	}

	public static ArrayList<Person> oldOwners(ArrayList<Person> emberek) {
		ArrayList<Person> old = new ArrayList<>();
		for (Person person : emberek) {
			if(oldCars(person.listCars(),1) >= 1) {
				old.add(person);
			}
		}

		return old;

	}

}
