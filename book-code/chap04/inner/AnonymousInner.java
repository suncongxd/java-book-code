package inner;

public class AnonymousInner{
	public Description buildDescription(String s, final String s2){
		return new Description(s){
			void Print(){
				super.Print();
				System.out.println("New Description: "+this.desc+s2);
			}
		};
	}
	public static void main(String[] args){
		AnonymousInner ai=new AnonymousInner();
		Description d=ai.buildDescription("Hello ","World");
		d.Print();
	}
}

class Description{
	String desc;
	Description(String s){
		desc=s;
	}
	void Print(){
		System.out.println("Description");
	}
}