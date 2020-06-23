package entities;

public class Students {
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double totalNote() {
		return firstNote + secondNote + thirdNote;
	}
	
	public String graduate() {
		if (totalNote() < 60) {
			return " FAILED";
		} else {
			return " PASSED";
		}
		
	}
	
	public String toString() {
		return String.format("%s got %.2f %n %s %s", name, totalNote(), name, graduate());
	}
}
