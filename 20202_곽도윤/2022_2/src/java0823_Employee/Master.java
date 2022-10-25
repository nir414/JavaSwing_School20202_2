package java0823_Employee;
public class Master extends Employee{
	int bouns;
	
	public Master(String no, String name, int career, int bouns) {
		super(no, name, career);
		this.bouns = bouns;
	}
	
	public void paySalary() {
		super.salary = super.career*30 + bouns;
	}
}