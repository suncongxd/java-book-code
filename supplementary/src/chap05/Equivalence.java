package chap05;

class Value {
	int i;

	/* equals()Ĭ�ϱȽ�����,Ҫ�Ƚ����ݾ���Ҫ��equals()������д */
	public boolean equals(Value v) {
		return (this.i == v.i) ? true : false;
	}

}

public class Equivalence {
	public static void main(String[] args) {
		
		Integer n1=new Integer(47); 
		Integer n2=new Integer(47);
		System.out.println("n1==n2: "+ (n1==n2));//���õıȽ�
		System.out.println("n1!=n2: "+ (n1!=n2));
		System.out.println("n1.equals(n2): "+ n1.equals(n2));//Integer����дequals()
		 
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 10;
		System.out.println("v1.equals(v2): " + v1.equals(v2));

	}
}