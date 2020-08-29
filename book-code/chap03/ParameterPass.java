

public class ParameterPass{
	public void passValue(int v){
		v=3;
	}
	public void passObject1(Circle c){
		c=new Circle(3.0);
	}
	public void passObject2(Circle c){
		c.setRadius(3.0);
	}
	public void passArray1(int[] a){
		a=new int[4];
	}
	public void passArray2(int[] a){
		a[a.length-1]=0;
	}
	public void printArray(int[] a){
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		ParameterPass pp=new ParameterPass();
		int i=4;
		pp.passValue(i);		//��ֵ������ı�i������
		System.out.println(i);
		
		Circle circ=new Circle(4.0);
		pp.passObject1(circ);	//����ı�circָ��Ķ���
		System.out.println(circ.getRadius());
		
		pp.passObject2(circ);	//ͨ��setRadius�ı���circָ��Ķ����radius����ֵ
		System.out.println(circ.getRadius());
		
		int[] array=new int[]{1,2,3};
		pp.passArray1(array);	//����ı�array����
		pp.printArray(array);
		
		pp.passArray2(array);	//ͨ������a�ı���array��������һ��Ԫ�ص�ֵ
		pp.printArray(array);
	}
}

class Circle{
	private double radius;
	public Circle(double r){
		radius=r;
	}
	public void setRadius(double r){
		radius=r;
	}
	public double getRadius(){
		return radius;
	}
}