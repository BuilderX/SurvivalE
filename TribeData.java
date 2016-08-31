package Calandar;

/**
 * Created by Rook on 5/30/2015.
 */
public class TribeData extends Entity {

            String name;
            int numOfMemebers;
            boolean producing;
            Calendar ticks;
            NameGenerator nameGen;
            Random ran = new Random();
            Creature NewTribeMemeber;
            
    public TribeData(String name, int numOfMembers, boolean producing) {
        this.name = name;
        this.numOfMembers = numOfMembers;
        this.producing = producing;
        while(ticks.TICKS_PER_DAY ==5000 ||ticks.TICKS_PER_DAY == 10000){
        	  producing = true;
        	if(true){
        	  numOfMemebers += 1;
        	  Creature NewMember = new Creature(NewTribeMember);
        	  
        	  nameGen = new NameGenerator();
        	  NewMember.name = nameGen.nameArray[ran.nextInt(nameArray.length - 0 + 1) + 0];
        	  
        	}
        }else{
              producing = true;      
                    
                    
        }
    }

    @Override
    public void update(float data) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfMemebers() {
        return numOfMemebers;
    }

    public void setNumOfMemebers(int numOfMemebers) {
        this.numOfMemebers = numOfMemebers;
    }

    public boolean isProducing() {
        return producing;
    }

    public void setProducing(boolean producing) {
        this.producing = producing;
    }
    public void increaseTribeMembers(){
        numOfMemebers++;

    }

}
