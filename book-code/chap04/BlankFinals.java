

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
	final int carID;			//�հ�final�Ļ������ͳ�Ա
	final Brand brand;			//�հ�final���������ͳ�Ա
	static int counter=10000;
	public Car(String s){		//���췽���б����carID��brand����ֵ
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