package java0830;

public class Master extends Employe{
	int bonus;
	public Master(String no, String name, int career, int bonus) {
		super(no, name, career);
		this.bonus = bonus;
	}
	public void paySalary() {
		super.salary = career*30 + bonus;
	}
}
