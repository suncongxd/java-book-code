

public class VariablesAndLocalVarInit{
	static int x; //x�ǳ�Ա�����������
	int y; //y�ǳ�Ա������ʵ������
	int[] a=new int[10]; //a���������
	public int func(int y){ //yΪ��������
		int local_y=this.y; //local_yΪ�ֲ�������this.yΪ��Ա����y��һ�ֱ�ʾ����
		this.y=y;
		return local_y;
	}
	public static void main(String[] args){
		VariablesAndLocalVarInit init=new VariablesAndLocalVarInit();
		System.out.println(init.y); //��Ա�����Զ���ʼ��
		int y;
		if((int)(Math.random()*10) > 5)
			y=2;
		//�� System.out.println(y); //�ֲ�����y����ĳЩ����±���ʼ��Ϊ2�����������δ����ʼ��������������
	}
}