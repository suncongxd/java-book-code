

public class InstanceInitializer{
	Comp c1=new Comp(1);
	public InstanceInitializer(){
		System.out.println("Instance Initializer");
	}
	Comp c2;
	public static void main(String[] args){
		InstanceInitializer ii=new InstanceInitializer();
	}
	Comp c3=new Comp(3);
	{ //实例初始化程序块
		c2=new Comp(2);
	}
}
class Comp{
	public Comp(int i){
		System.out.println("Comp("+i+")");
	}
}