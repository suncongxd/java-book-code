package inner;

public class Book{
	class Description{
		String desc;
		Description(String s){
			desc=s;
		}
		void setPrice(int i){
			price=i;		//�ڲ�����Է������������г�Ա
		}
	}
	private int price;
	Description d;			//�ڲ���ʵ����Ϊ�ⲿ���Ա
	public Book(String s, int p){
		d=buildDescription(s);
		d.setPrice(p);
	}
	private Description buildDescription(String s){	//�ڲ�����Ϊ�ⲿ�෽���ķ�������
		return new Description(s);
	}
	public Description getDescription(){			//�ڲ�����Ϊ�ⲿ�෽���ķ�������
		System.out.println(d.desc+";"+this.price);
		return d;
	}
	public static void main(String[] args){
		Book b=new Book("Java Programming Language", 99);
		Description dd=b.getDescription();
	}
}