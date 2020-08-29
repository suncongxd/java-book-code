

public class Rectangle{
	private int width=0;
	private int height=0;
	
	public boolean setWidth(int w){
		if(w>0){
			width=w;
			return true;
		}
		return false;
	}
	public boolean setHeight(int h){
		if(h>0){
			height=h;
			return true;
		}
		return false;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int getArea(){
		return width*height;
	}
	public int getPerimeter(){
		return 2*(width+height);
	}
	
	public static void main(String[] args){
		Rectangle rect=new Rectangle();
		if( rect.setWidth(3) &&	rect.setHeight(2) ){
			System.out.println(rect.width+"; "+rect.height);
			System.out.println("Area of Rectangle: "+rect.getArea());
			System.out.println("Perimeter of Rectangle: "+rect.getPerimeter());
		}
	}
}