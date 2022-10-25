package java0816_shape;
public abstract class Shape {
	private String name;
	protected static final double PI = 3.14;
	protected static int shapCnt;
	
	public Shape() {
		shapCnt++;
	}
	public Shape(String name) {
		this();
		this.name = name;
	}
	
	public void draw() {
		System.out.println(name+"���� �׸���");
	}
	public abstract void calculateArea();
	public abstract void calculateRound();
}