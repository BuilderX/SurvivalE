package Calandar;

import java.util.LinkedList;
import java.util.List;

public class Inventory extends Item {
			String name;
			int lv = 0;
			int att = 0;
			int damage = 0;
			Stones[] gems = new Stones[5];
			
	
	
			List<Item> list;
			public Inventory() {
				list = new LinkedList<Item>();
			
			}

			public void add(Item item){
			      if(item != null){
			       	 list.add(item);
                               }else{
                               	console.log(item + " Item equal to null");
                               }
                              
			}
			public void remove(Item item){
				list.remove(item);

			}
			public  void Clear(){
				list.clear();

			}

}
