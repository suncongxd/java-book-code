

public class ShiftRight{
	public static void main(String[] args){
		System.out.println(Integer.toBinaryString(-12));
		
		int i=-12;
		System.out.println(Integer.toBinaryString(i>>2)); //����������
		System.out.println(Integer.toBinaryString(i>>>2));//�޷�������
		
		byte b=-12;
		System.out.println(Integer.toBinaryString(b>>2));//����byteת��Ϊint��Ȼ�����������
		System.out.println(Integer.toBinaryString(b>>>2));//����byteת��Ϊint��Ȼ���޷�������
		
		System.out.println(Integer.toBinaryString(b>>2L));//byteת��Ϊint��������ת��Ϊlong
		System.out.println(Long.toBinaryString(-12L>>2L));
	}
}