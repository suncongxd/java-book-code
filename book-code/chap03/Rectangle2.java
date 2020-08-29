

public class Rectangle2{
	int width=3;
	int height=2;
	Point pos;
	public Rectangle2(int w, int h, int x, int y){
		width=w;
		height=h;
		pos=new Point(x,y);
	}
	public static void main(String[] args){
		Rectangle2 rect=new Rectangle2(10,11,1,1);
	}
}
class Point{
	int x;
	int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}