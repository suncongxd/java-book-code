

public class BlankFinals{
	public static void main(String[] args){
		Car[] cars=new Car[]{new Car("BMW"), 
							new Car("Rolls-Royce"),
							new Car("Toyota")};
		for(Car c: cars){
			c.Print();
		}
	}
}

class Car{
	final int carID;			//空白final的基本类型成员
	final Brand brand;			//空白final的引用类型成员
	static int counter=10000;
	public Car(String s){		//构造方法中必须对carID和brand赋初值
		carID=counter++;
		brand=new Brand(s);
	}
	public void Print(){
		System.out.println(brand.brandName+" No."+carID);
	}
}
class Brand{
	String brandName;
	public Brand(String s){
		brandName=s;
	}	
}