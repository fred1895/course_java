package entites;

public class Salario {
	public String name;
	public double salary;
	public double tax;
	
	public void increaseSalary(double porcentage) {
		this.salary += porcentage*this.salary/100;
	}
	
	public double realSalary() {
		return salary - tax;
	}
	
	public String toString() {
		return name + ": " + realSalary() + " R$";
	}
	
}
