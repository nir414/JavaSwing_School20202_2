package java0816_shape;
public class ShapeMain {
	public static void main(String[] args) {
		Circle c1 = new Circle("���׶��1", 9);
		Rectangle r1 = new Rectangle("�׸�1", 15, 15);
		
		System.out.println("������� ������ ���: "+Shape.shapCnt);
		System.out.println("================================");
		
		c1.draw();
		r1.draw();
		

		System.out.println("������� ������ ���: "+Shape.shapCnt);
		System.out.println("================================");
		
		c1.calculateArea();
		c1.calculateRound();

		System.out.println("================================");
		
		r1.calculateArea();
		r1.calculateRound();

		System.out.println("================================");
	}
}