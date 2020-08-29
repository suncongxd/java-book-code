

public class TestEnum{
	public static void main(String[] args){
		for(Season s: Season.values()){
			if(s.ordinal()==1)			//sΪSUMMER
				System.out.println(s.name()+";"+s.toString());
			if(s.ordinal()==2)			//sΪFALL
				System.out.println(s.getDeclaringClass());
			if(s.equals(Season.valueOf("WINTER")))
				System.out.println(s);
		}
	}
}
enum Season{
	SPRING, SUMMER, FALL, WINTER
}