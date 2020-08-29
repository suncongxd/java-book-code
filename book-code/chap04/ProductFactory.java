

public class ProductFactory{
	public static void main(String[] args){
		Product[] products=new Product[5];
		for(int i=0;i<products.length;i++)
			products[i]=new Product();
		for(int i=0;i<products.length;i++)
			System.out.println("Product "+products[i].getSerialNumber());
		System.out.println("Current value of Product.counter : "+ Product.counter);
	}
}

class Product{
	private int serialNumber;
	public static int counter=1;
	public Product(){
		serialNumber = counter++;
	}
	public int getSerialNumber(){
		return serialNumber;
	}
}