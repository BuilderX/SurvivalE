public class Behaviors{
  public enum Behaviors{
     ANGRY,SAD,HAPPY,NEUTRAL,DEPRESSED,MAD,ILLUSIONS,HUNRGY,PARALYZED
    
    }
     Animal a;
    public Behaviors(Animal a ){
       this.a = a;
    }
    public void State(){
         switch(B){
            case ANGRY:
            break;
            case HAPPY:
            break;
            case SAD:
            break;
            case DEPRESSED:
            break;
            case MAD;
            break;
            case HUNGRY
            break;
            case ILLUSIONS:
            break;
            CASE PARALYZED;
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
