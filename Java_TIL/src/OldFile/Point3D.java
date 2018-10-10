package _919;

class Point {
	private int x, y;
	
	public Point() {
		this(0, 0);
	}
	public Point(int x) {
		this(x, 0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	protected void move(int x, int y) {
		this.setXY(x, y);
	}
}

class Point3D extends Point {
	private int z;
	
	public Point3D() {
		super(0, 0);
	}
	public Point3D(int x) {
		super(x, 0);
	}
	public Point3D(int x, int y) {
		super(x, y);
	}
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void setXYZ(int x, int y, int z) {
		super.setXY(x, y);
		this.z = z;
	}
	
	protected void move(int x, int y, int z) {
		super.move(x, y);
		this.setZ(z);
	}
	
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.getZ() + ")";
	}
	
	public static void main(String[] args) {
		Point3D a = new Point3D();
		System.out.println(a.toString());
	}
}