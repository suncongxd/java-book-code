

public class Sportsman extends Person implements Runner, Swimmer, Jumper{
	public void run() { System.out.println("Sportsman running"); }
	public void swim() { System.out.println("Sportsman swimming"); }
	public void jump() { System.out.println("Sportsman jumping"); }
	
	public static void toRun(Runner r) { r.run(); }
	public static void toSwim(Swimmer s) { s.swim(); }
	public static void toJump(Jumper j) { j.jump(); }
	public static void toEatAndDrink(Person p) { p.eat(); p.drink(); }
	
	public static void main(String[] args){
		Sportsman s=new Sportsman();
		toRun(s);
		toSwim(s);
		toJump(s);
		toEatAndDrink(s);
	}
}

class Person{
	public void eat(){ System.out.println("Person eating"); }
	void drink() { System.out.println("Person drinking"); }
}

interface Runner{
	void run();
	void eat();
}
interface Swimmer{
	void swim();
}
interface Jumper{
	void jump();
}