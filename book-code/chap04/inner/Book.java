package inner;

public class Book{
	class Description{
		String desc;
		Description(String s){
			desc=s;
		}
		void setPrice(int i){
			price=i;		//内部类可以访问外包类的所有成员
		}
	}
	private int price;
	Description d;			//内部类实例作为外部类成员
	public Book(String s, int p){
		d=buildDescription(s);
		d.setPrice(p);
	}
	private Description buildDescription(String s){	//内部类作为外部类方法的返回类型
		return new Description(s);
	}
	public Description getDescription(){			//内部类作为外部类方法的返回类型
		System.out.println(d.desc+";"+this.price);
		return d;
	}
	public static void main(String[] args){
		Book b=new Book("Java Programming Language", 99);
		Description dd=b.getDescription();
	}
}