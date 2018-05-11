import android.content.res.Configuration;

public class Calendar {
			public static int DAYS_PER_SEASON;
			public static int TICKS_PER_DAY;
			private static Configuration config;
	                private static int DayCount = 0;
	     Calendar(){
	            initCalender();
	     }
	       public static void initConfiguration(Configuration config){
			DAYS_PER_SEASON = getInteger("Days per season",30);
			TICKS_PER_DAY = getInteger("Ticks per day", 15000);
	       }
	       public void initCalender(){
	           initConfiguration(this.config);
	           Season SPRING = Season.SPRING;
		   Season SUMMER = Season.SUMMER;
		   Season FALL = Season.FALL;
		   Season WINTER = Season.WINTER;
		       
		   Season Seasons[] = {SPRING,SUMMER,FALL,WINTER};
		       
		   for(int i = 0; i < SEASONS.length;i++){  
		     for(int j = 0; j < DAYS_PER_SEASON;j++){
		        if(SEASONS[i].getStartChance() > 5000){
			 if(SEASONS[i].getRain() > 5){
		          if(SEASONS[i].getThunder() <= 111104){
			    // Pass Results To Weather Generator
			  }
			 }
		        }     
		       for(int g = 0; g < TICKS_PER_DAY;g++){
		       
		       }	
		         DayCount++;
		     } 
	           }
	       }
	       private static int getInteger(String string, int i) {
         	   return i;
	       }
	       private int getDayPerSeason(){
	           return DAYS_PER_SEASON;
	       }
	       private int getTicksPerSeason(){
	           return TICKS_PER_DAY;
	       }
	       private int setDayPerSeason(DPS){
	           this.DAYS_PER_SEASON = DPS;
	       }
	       private int setTicksPerSeason(TPD){
	           this.TICKS_PER_DAY = TPD;
	       }
	
}
