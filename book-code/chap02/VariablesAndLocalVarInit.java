

public class VariablesAndLocalVarInit{
	static int x; //x是成员变量、类变量
	int y; //y是成员变量、实例变量
	int[] a=new int[10]; //a是数组变量
	public int func(int y){ //y为方法参数
		int local_y=this.y; //local_y为局部变量，this.y为成员变量y的一种表示方法
		this.y=y;
		return local_y;
	}
	public static void main(String[] args){
		VariablesAndLocalVarInit init=new VariablesAndLocalVarInit();
		System.out.println(init.y); //成员变量自动初始化
		int y;
		if((int)(Math.random()*10) > 5)
			y=2;
		//！ System.out.println(y); //局部变量y仅在某些情况下被初始化为2，其他情况下未被初始化，编译器报错
	}
}