public class Behaviors{
  public enum Behaviors{
     ANGRY,SAD,HAPPY,NEUTRAL,DEPRESSED,MAD,ILLUSIONS,HUNRGY,PARALYZED
    
    }
     AnimalData ani;
    public Behaviors(AnimalData a){
       this.ani = a;
    }
    public void State(ani){
         switch(ani.CurrentFeeling){
            case ANGRY:
                 ani.attack += 5;
                 ani.def -= 10;
                 ani.lifeSpan -= 1;
                 ani.healthiness -= 10;
                 ani.angerLevel += 50;
                 ani.hungerLv -= 5;
                 ani.mentalHealth -= 10;
              
            break;
            case HAPPY:
                 ani.lifeSpan += 1;
                 ani.healthiness += 10;
                if(ani.healthiness > 200){
                      ani.attack += 15;
                 }
                 ani.angerLevel -= 20;
                 if(ani.angerLevel < 0){
                      ani.angerLevel = 0;
                 }
            break;
            case SAD:
                 ani.healthiness -= 10;
                 ani.hungerLv += 10;
                 if(ani.healthiness < 0 ){
                      ani.Alive = false;
                      initDeath();
                 }
                 int z = Math.round(Math.Random(0) * 1);
             
                 ani.angerLevel += 20;
                 break;
            case DEPRESSED:
            break;
            case MAD;
            break;
            case HUNGRY:
               ani.hungerLv -= 10; 
             if(ani.hungerLv > 110){
                  ani.health -= ani.health;
                 if(ani.health < 0){
                  ani.alive = false;
                  initDeath();
                 }
             }
            break;
            case ILLUSIONS:
                 ani.mentalHealth -= 10;
              
            break;
            CASE PARALYZED;
                 ani.healthiness -= 10;
              
             
            break;
            default:
            break;
         }
    }
    public void cycle(){
       for( String a: B.values()){
             System.out.println(a);
       }
    }

}
