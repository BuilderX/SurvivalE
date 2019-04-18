package Calandar;

import java.util.LinkedList;
import java.util.List;

public class Inventory extends Item {
       	               Item data;
	  	       List<Item> list;
	               Stones[] gems = new Stones[5];
		       GoldAmount gold = null;
	
			Inventory(int Gamt){
			   this.gold = Gamt;
				
			}
			
			public Inventory() {
				this.list = new LinkedList<Item>();
			}

			public void add(Item item){
			      if(item != null){
			       	 this.list.add(item);
                               }else{
                               	console.log(item + " Item Doesn't exist in bag");
                               }
			}
	
			public Item selectItem(index){
			     return this.list.get(index);
			}
			public Item selectSpecificItem(Item item){
			     return this.list.indexOf(item);
			}
	
			public void remove(Item item){
				this.list.remove(item);
			}
	
			public  void ClearBag(){
				this.list.clear();
			}
			public int getItemSize(){
				return this.list.size();
			}

}
