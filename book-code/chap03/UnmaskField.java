

public class UnmaskField{
	private int x = 1;
	private int y = 1;

	public void changeFields(int a, int b) {
		x = a;			//xָ��Ա����
		int y = b;		//�ֲ�����yʹͬ�������Ա����������
		this.y=8;		//this.yָ��Ա����
		System.out.println("x=" + x + "; y=" + y); //�����yֵΪ�ֲ�����y��ֵ
	}

	public void PrintFields() {
		System.out.println("x=" + x + "; y=" + y); //�����Ϊ��Ա����x��y��ֵ
	}

	public static void main(String args[]) {
		UnmaskField uf = new UnmaskField();
		uf.PrintFields();
		uf.changeFields(10,9);
		uf.PrintFields();
	}
}