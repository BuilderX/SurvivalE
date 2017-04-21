package Calandar;

import java.util.ArrayList;

public class NPC extends Entity{
		private Inventory[] set;
		private Item i;
		AnimalData animal;

	
	{
	protected ArrayList<String> Sounds = new ArrayList<String>(213);	
	}
	
	@Override
	public void update(float data) {

	}

	public static enum AnimalBehavior{
				ANGRY, DOMESTICATABLE, TAME, AGITATED
				
			}
	public static enum Direction{
				UP,DOWN,LEFT,RIGHT
				
			}
	public static enum behavior{
				WILDPATH,ERRATIC,RESTFUL
			}
	protected String getListItem(ArrayList a){
	 	    return a.get(o);
	}		
	protected void addTOlist(a){
		if(String.valueOf(a)){
		       Sounds.add(a);	
	  	}
	  	if(a instanceof String){
	               Sounds.add(a);	
	  	}
	}
	
	}
   
