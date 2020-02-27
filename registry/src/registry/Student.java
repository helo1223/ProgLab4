package registry;

public class Student {
	private String name;
	private String neptun;
	private int yob; // Year Of Birth
	private double average;
	private int credits;

	public Student(String na, String ne, int y) {
		name = na;
		neptun = ne;
		yob = y;
		average = 0.0;
		credits = 0;
	}

	public String getName() {
		return name;
	}

	public String getNeptun() {
		return neptun;
	}

	public void addMark(int mark, int credit) {
		average = (average * credits + mark * credit) / (credits + credit);
		credits += credit;
	}

	public String toString() {
		return name + " (" + neptun + ") " + yob + ", " + average + ", " + credits;
	}
}
