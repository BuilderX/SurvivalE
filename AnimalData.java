package Calandar;

public class AnimalData {
	private int hp;
	private int attack;
	private int def;
	private int lifeSpan;
	private int healthiness;
	boolean sick;
	boolean isAttacking;
	boolean Alive;
	int daysNotFed;
	int angerLevel;
	AnimalData a;
	enum Behavior;
	
	
	public AnimalData(int hp, int attack, int def, int lifeSpan,
			int healthiness, boolean sick, int daysNotFed, int angerLevel) {
		super();
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.lifeSpan = lifeSpan;
		this.healthiness = healthiness;
		this.sick = sick;
		this.daysNotFed = daysNotFed;
		this.angerLevel = angerLevel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	public int getHealthiness() {
		if(this.healthiness < 20){
		   
		   this.sick = true;
	 	   this.lifeSpan -= 1;
			
		}
		return healthiness;
	}
	public void setHealthiness(int healthiness) {
		this.healthiness = healthiness;
	}
	public boolean isSick() {
		if(this.hp > 2){
		    this.hp -= 1;
		    this.sick = true;
		    this.attack -= 5;
		}else if(this.hp < 1 ){
			this.Alive = false;
		}
		return sick;
	
	}
	public void setSick(boolean sick) {
		this.sick = sick;
	
	}
	public void ifSick(){
		
          if(this.sick == true){
         	for(int g = this.healthiness, o = this.hp; g >= 20 || o < = 20; g--,o--){
 	                      
                   }
		}
	}
	public boolean isAttacking() {
	  	  this.isAttacking = true;
		return isAttacking;
	}
	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}
	public int getDaysNotFed() {
		int currentHp = getHp(), int Healthy = getHealthiness();
		if(daysNotFed > 4){
	              Behavior = ANGRY;
		   if(Behavior=== 'Angry'){
		      while(currentHp < 50 && currentHp > 10){
			    Healthy -= 40;
			   }   
			}}
		return daysNotFed;
	}
	public void setDaysNotFed(int daysNotFed) {
		this.daysNotFed = daysNotFed;
	}
	public int getAngerLevel() {
		return angerLevel;
	}
	public void setAngerLevel(int angerLevel) {
		this.angerLevel = angerLevel;
	}
	
	
}
