package Calandar;

import java.util.HashMap;

public class PlayerData {
	// TribeRelationship 
	private HashMap<String,NPC> entity_Relationships;
	private final double staminaMax = 100D;
	private final double fatigueMin= 0D;
	private double stamina = 0D;
	private double fatigue;
	private double exp;
	private Inventory Inventory;
	int waterAmount;
	int wellNessValue = 100;
	int TribeMembers = 0;
	double currentBodyTemperature;
	Disease sick;

	public PlayerData(HashMap<String, NPC> entity_Relationships, double staminaMax, double fatigueMin, double stamina,
			  double fatigue, Calandar.Inventory inventory, double exp, int waterAmount, double currentBodyTemperature,
			  Disease sick, int wellNessValue) {
		
		this.entity_Relationships = entity_Relationships;
		this.staminaMax = staminaMax;
		this.fatigueMin = fatigueMin;
		this.stamina = stamina;
		this.fatigue = fatigue;
		this.exp = exp;
		this.waterAmount = waterAmount;
		this.currentBodyTemperature = currentBodyTemperature;
		this.sick = sick;
		this.wellNessValue = wellNessValue;
		Inventory = inventory;
	}

	public HashMap<String, NPC> getEntity_Relationshipss() {
		return entity_Relationships;
	}
	public void addToMap(String s,NPC AI ){
		if(s.length < 1 || AI == null){ 
		 System.out.println('Invalid Input');	
			return null;
		}else{
	          entity_Relationships.put(s,AI);
		}
	}
	public void setEntity_Relationshipss(HashMap<String, NPC> entity_Relationshipss) {
		
		if(entity_Relationshipss == null){ return null}
		    this.entity_Relationships = entity_Relationshipss;
	}

	public double getStaminaMax() {
		return staminaMax;
	}

	public void setStaminaMax(double staminaMax) {
		if(staminaMax < 1){ return 0}
		   this.staminaMax = staminaMax;
	}

	public double getFatigueMin() {
		return fatigueMin;
	}


	public double getStamina() {
		return stamina;
	}

	public void setStamina(double stamina) {
		if(stamina < 1){ return 0}
		   this.stamina = stamina;
	}

	public double getFatigue() {
		return fatigue;
	}

	public void setFatigue(double fatigue) {
		if(fatigue < 1){ return 0}
	           this.fatigue = fatigue;
	}

	public Calandar.Inventory getInventory() {
		return Inventory;
	}

	public void setInventory(Calandar.Inventory inventory) {
               if(inventory == null){ return null}
		  Inventory = inventory;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
               if(exp < 1){ return 0}
		   this.exp = exp;
	}

	public int getWaterAmount() {
		return waterAmount;
	}

	public void setWaterAmount(int waterAmount) {
                if(waterAmount < 1){ return 0}
		    this.waterAmount = waterAmount;
	}

	public double getCurrentBodyTemperature() {
		return currentBodyTemperature;
	}

	public void setCurrentBodyTemperature(double currentBodyTemperature) {
	       if(currentBodyTemperature < 1){ return 0}
		   this.currentBodyTemperature = currentBodyTemperature;
	}

	public Disease getSick() {
		return sick;
	}

	public void setSick(Disease sick) {
		if(fatigue === null){ return null}
		this.sick = sick;
	}

	public int getWellNessValue() {
		return wellNessValue;
	}

	public void setWellNessValue(int wellNessValue) {
		if(wellNessValue < 1){ return 0}
		this.wellNessValue = wellNessValue;
	}

	public PlayerData(int tribeMembers) {
		if(tribeMembers < 1){ return 0}
		TribeMembers = tribeMembers;
	}

	public int getTribeMembers() {
		
		return TribeMembers;
	}
}
