

import java.util.Random;

public class FinalVariables{
	final int i1=1;								//编译时常量
	final int i2=(new Random()).nextInt(20);	//非编译时常量
	final Value v1=new Value(1);
	Value v2=new Value(2);
	final int[] a={1,2,3};
	
	public static void main(String[] args){
		FinalVariables fv=new FinalVariables();
		
		//fv.i1++;								//编译时常量的值不能更改
		System.out.println(fv.i1);
		System.out.println(fv.i2);
		
		//fv.v1=new Value(3);					//v1不能指向其他对象实例
		fv.v1.i++;								//v1指向的对象的成员i可以更改
		fv.v1.Print();
		
		fv.v2=new Value(3);						//v2可以指向其他对象实例
		fv.v2.Print();
		
		//fv.a=new int[3];						//a不能指向其他对象数组
		fv.a[2]=4;								//a指向的数组的内容可以更改
		for(int j: fv.a)
			System.out.print(j+" ");
	}
}

class Value{
	int i;
	public Value(int i){
		this.i=i;
	}
	public void Print(){
		System.out.println(this.i);
	}
}