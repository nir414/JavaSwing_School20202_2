package java0823_Employee;
public class EmployeeMain {
	public static void main(String[] args) {
		Staff s1 = new Staff("S01", "������", 3);
		Staff s2 = new Staff("S02", "��ܿ�", 10);
		Master m1 = new Master("M01", "ä��ȭ", 15, 20);
		Master m2 = new Master("M02", "�缮��", 20, 20);

		s1.paySalary();
		s1.printInfo();
		s2.paySalary();
		s2.printInfo();
		m1.paySalary();
		m1.printInfo();
		m2.paySalary();
		m2.printInfo();
	}
}