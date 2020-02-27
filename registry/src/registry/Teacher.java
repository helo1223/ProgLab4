package registry;

public class Teacher {
	private String name;
	private String neptun;
	private int yob; // Year Of Birth
	private String title;

	public Teacher(String na, String ne, int y) {
		name = na;
		neptun = ne;
		yob = y;
		title = "assistant teacher";
	}

	public String getName() {
		return name;
	}

	public String getNeptun() {
		return neptun;
	}

	public void setTitle(String s) {
		title = s;
	}

	public String toString() {
		return name + " (" + neptun + ") " + yob + ", " + title;
	}
}
