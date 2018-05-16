package Calandar;

/**
 * Created by Rook on 5/30/2015.
 */
public class TribeData extends Entity {

            String name = "";
            int numOfMemebers = 0;
            int maxPopPerLv = 0;
            boolean producing = false;
            Calendar ticks;
            NameGenerator nameGen;
            Random ran = new Random();
            Creature NewTribeMemeber;
            
    public TribeData(String name, int numOfMembers, boolean producing) {
        this.name = name;
        this.numOfMembers = numOfMembers;
        this.producing = producing;
        while(ticks.TICKS_PER_DAY ==5000 || ticks.TICKS_PER_DAY == 10000){
        	  producing = true;
        	if(producing){
        	  numOfMemebers += 1;
        	  Creature NewMember = new Creature(NewTribeMember);
        	  nameGen = new NameGenerator();
        	  NewMember.name = nameGen.nameArray[ran.nextInt(nameArray.length - 0 + 1) + 0];
        	  if(numOfMemebers >= maxPopPerLv){
                 producing = false; 
              }  
            }
       }
    }
            
    public String getName() {
        return name;
    }
    public int getNumOfMemebers() {
        return numOfMemebers;
    }
    public int getMaxPopPerLv(){
        return setMaxPopPerLv;
    }
    public boolean isProducing() {
        return producing;
    }   
    public void setNumOfMemebers(int numOfMemebers) {
        this.numOfMemebers = numOfMemebers;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProducing(boolean producing) {
        this.producing = producing;
    }
    public void increaseTribeMembers(){
        numOfMemebers++;
    }
    public void setMaxPopPerLv(int MPPL){
        this.setMaxPopPerLv = MPPL;
    }
}
