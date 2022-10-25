package java0830;

public class Staff extends Employe{
	public Staff() {
		// TODO Auto-generated constructor stub
	}
	public Staff(String no, String name, int career) {
		super(no , name , career);
	}
	public void paySalary() {
		if (career >= 5) {
			super.salary = career *20;
		}
		else {
			super.salary = career *10;
		}
	}
}
