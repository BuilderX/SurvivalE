
enum Behaviors{
     ANGRY("ANGRY"),SAD("SAD"),HAPPY("HAPPY"),NEUTRAL("NEUTRAL"),DEPRESSED("DEPRESSED"),MAD("MAD"),ILLUSIONS("ILLUSIONS"),HUNRGY("HUNRGY"),PARALYZED("PARALYZED");
    
    public String Emotion;
      ///public Behaviors(AnimalData a){
      //   this.ani = a;
      //}
    private Behaviors(String em){
     	this.Emotion = em;
    }
     
    public void State(Behaviors beh, AnimalData ani){
         switch(beh.Emotion){
            case "ANGRY":
                 ani.attack += 5;
                 ani.def -= 10;
                 ani.lifeSpan -= 1;
                 ani.healthiness -= 10;
                 ani.angerLevel += 50;
                 ani.hungerLv -= 5;
                 ani.mentalHealth -= 10;
            break;
            case "HAPPY":
                 ani.lifeSpan += 1;
                 ani.healthiness += 10;
                  if(ani.healthiness >= 200){
                     ani.attack += 15;
                  }
                   ani.angerLevel -= 20;
                  if(ani.angerLevel <= 0){
                     ani.angerLevel = 0;
                  }
            break;
            case "SAD":
                 ani.healthiness -= 10;
                 ani.hungerLv += 10;
                  if(ani.healthiness < 0 ){
                     ani.Alive = false;
                     initDeath();
                 }
                 int z = Math.round(Math.Random(0) * 1);
                 if(z == 1){
                    ani.mentalHealth -= 10;
                 }
                 else if(z == 0){
                        ani.mentalHealth -= 30;
                 }
             
                 ani.angerLevel = 0;
                 break;
            case "DEPRESSED":
            break;
            case "MAD":
            break;
            case "HUNGRY":
               ani.hungerLv -= 10; 
             if(ani.hungerLv > 110){
                  ani.health -= ani.health;
               if(ani.health <= 0){
                  ani.alive = false;
                  initDeath();
                 }
             }
            break;
            case "ILLUSIONS":
                 ani.mentalHealth -= 10;
                 if(ani.mentalHealth <= 0){
                     generateIllutions();
                 }
            break;
            case "PARALYZED":
                  ani.healthiness -= 10;
            break;
            default:
            break;
         }
    }
  
    private void generateIllutions(){
 
    }
  
    public void cycle(){
       for( String a: B.values()){
             System.out.println(a);
       }
    }

}
