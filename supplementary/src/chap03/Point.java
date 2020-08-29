package chap03;

public class Point {
	public int x = 2;
	public int y;

	public Point(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		Point p = new Point(22);
	}
}