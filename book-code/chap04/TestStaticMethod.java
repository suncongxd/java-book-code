

public class TestStaticMethod{
	public static void main(String[] args){
		StaticMethod obj=new StaticMethod();
		StaticMethod.sMethod1();		//������ͨ���������þ�̬����
		StaticMethod.sMethod2(obj);
		obj.iMethod();
	}
}

class StaticMethod{
	int x=0;
	static int y=1;
	public void iMethod(){
		System.out.print("x;y = "+x+";");
		sMethod1();
		y++;
	}
	public static void sMethod1(){
		//System.out.println(this.x);		//���ܷ���ʵ����Ա����
		//iMethod();						//���ܷ���ʵ������
		System.out.println(StaticMethod.y);	//���Է��ʾ�̬����
	}
	public static void sMethod2(StaticMethod o){
		System.out.println(o.x);			//����ͨ��o���÷���ʵ����Ա����
		o.iMethod();						//����ͨ��o���õ���ʵ������
		System.out.print("Calling sMethod1() in sMethod2(): ");
		sMethod1();							//����ֱ�ӵ��þ�̬����
	}
}