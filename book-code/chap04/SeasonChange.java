


public class SeasonChange{
	Season currentSeason=Season.SPRING;
	public void change(){
		switch(currentSeason){
		case SPRING:
			currentSeason=Season.SUMMER;
			break;
		case SUMMER:
			currentSeason=Season.FALL;
			break;
		case FALL:
			currentSeason=Season.WINTER;
			break;
		case WINTER:
			currentSeason=Season.SPRING;
			break;
		}
	}
	public void Print(){
		System.out.println("The current season is "+currentSeason);
	}
	public static void main(String[] args){ 
		SeasonChange sc=new SeasonChange();
		for(int i=0;i<6;i++){
			sc.Print();
			sc.change();
		}
	}
}