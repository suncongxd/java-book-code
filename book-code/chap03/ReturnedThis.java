

public class ReturnedThis{
	public static void main(String[] args){
		Count c=new Count();
		c.increment().increment().increment().increment().print();
	}
}

class Count{
	int i=0;
	public Count increment(){
		i++;
		return this;
	}
	public void print(){
		System.out.println("i="+this.i);
	}
}