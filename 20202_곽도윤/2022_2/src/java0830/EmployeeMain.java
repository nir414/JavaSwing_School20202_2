package java0830;
public class EmployeeMain {
	public static void main(String[] args) {
		Staff s1 = new Staff("S01", "이익준", 3);
		Staff s2 = new Staff("S02", "장겨율", 10);
		Master m1 = new Master("M01", "채송화", 15, 20);
		Master m2 = new Master("M02", "양석현", 20, 30);
		
		s1.paySalary();
		s2.paySalary();
		m1.paySalary();
		m2.paySalary();
		
		s1.printInfo();
		s2.printInfo();
		m1.printInfo();
		m2.printInfo();
	}
}