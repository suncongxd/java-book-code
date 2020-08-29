

public class NewEnum{
	public static void main(String[] args){
		//Season2 ss=new Season2(23);		//不能创建新的实例
		for(Season2 s: Season2.values()){
			System.out.println(s.name()+" at ordinal "+s.ordinal()+
					", average temperature:"+s.getAvgTemp());
		}
	}
}

enum Season2{
	SPRING(15), SUMMER(25), FALL, WINTER(2);
	private int avgTemperature;
	Season2(int t){
		this.avgTemperature=t;
	}
	Season2(){
		this.avgTemperature=18;
	}
	public int getAvgTemp(){
		return avgTemperature;
	}
}