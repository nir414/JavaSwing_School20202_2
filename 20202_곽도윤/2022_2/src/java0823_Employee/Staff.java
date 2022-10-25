package java0823_Employee;
public class Staff extends Employee {
	public Staff(String no, String name, int career) {
		super(no, name, career);
	}
	
	public void paySalary() {		
		if (super.career >= 5) 
			super.salary = super.career*20;
		else 
			super.salary = super.career*10;
	}
}