

import java.util.Random;

public class FinalVariables{
	final int i1=1;								//����ʱ����
	final int i2=(new Random()).nextInt(20);	//�Ǳ���ʱ����
	final Value v1=new Value(1);
	Value v2=new Value(2);
	final int[] a={1,2,3};
	
	public static void main(String[] args){
		FinalVariables fv=new FinalVariables();
		
		//fv.i1++;								//����ʱ������ֵ���ܸ���
		System.out.println(fv.i1);
		System.out.println(fv.i2);
		
		//fv.v1=new Value(3);					//v1����ָ����������ʵ��
		fv.v1.i++;								//v1ָ��Ķ���ĳ�Աi���Ը���
		fv.v1.Print();
		
		fv.v2=new Value(3);						//v2����ָ����������ʵ��
		fv.v2.Print();
		
		//fv.a=new int[3];						//a����ָ��������������
		fv.a[2]=4;								//aָ�����������ݿ��Ը���
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