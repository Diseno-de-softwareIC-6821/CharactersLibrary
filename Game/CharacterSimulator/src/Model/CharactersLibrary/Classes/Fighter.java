/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;

import Model.CharactersLibrary.Intefaces.IAction;
import Model.GameClasses.Configuration;


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Esteb
 */

public class Fighter implements  ILeveled,IAction {

    private HashMap<Integer, String> textures;
    private String currentTexture;
    private ArrayList<Item>  items;
    private Item selectedItem;
    private String name; 
    private int level; 
    private double experience;
    private double health;
    private double defense;
    private double speed; 
    private double dps;
    private int spawnLevel;
    private int housingSpace;
    private int posX;
    private int posY;
    private double damage;
    


    public Fighter(HashMap<Integer, String> textures, String currentTexture,
            ArrayList<Item> items, Item selectedItem, String name, int level, 
            double experience, double health, double defense, double speed,
            double dps, int spawnLevel, int housingSpace, int posX, int posY, double damage) {
        this.textures = textures;
        this.currentTexture = currentTexture;
        this.items = items;
        this.selectedItem = selectedItem;
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.health = health;
        this.defense = defense;
        this.speed = speed;
        this.dps = dps;
        this.spawnLevel = spawnLevel;
        this.housingSpace = housingSpace;
        this.posX = posX;
        this.posY = posY;
        this.damage = damage;
    }
    public Fighter() {
        
    }
    public void addItem(Item newItem ){
        this.items.add(newItem);
    }
    public void deleteItem(){
        this.items.remove(selectedItem);
    }

    
    private int getCurrentItemIndex( ){
        int index = 0;
        for(Item i : items){
            if(i.equals(selectedItem)){
                return index;
            }
            index+=1;
        }
        return index;
    } 

    
    @Override
    public void levelUp() {
        this.level+=1;
        this.damage +=Configuration.DAMAGE_PER_LEVEL_UP;
        
    }
    @Override
    public void levelDown() {
        this.level-=1;
        this.damage -=Configuration.DAMAGE_PER_LEVEL_UP;
    }

    @Override
    public void moveUp() {
        this.posY-=1;
    }

    @Override
    public void moveDown() {
        this.posY+=1;
    }

    @Override
    public void moveLeft() {
        this.posX-=1;
    }

    @Override
    public void moveRight() {
        this.posX+=1;
    }

    public String getCurrentTexture() {
        return currentTexture;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getExperience() {
        return experience;
    }

    public double getHealth() {
        return health;
    }

    public double getDefense() {
        return defense;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDps() {
        return dps;
    }

    public int getSpawnLevel() {
        return spawnLevel;
    }

    public int getHousingSpace() {
        return housingSpace;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    @Override
    public String toString() {
        return "Fighter{" +
                "textures=" + textures +
                ", currentTexture='" + currentTexture + '\'' +
                ", items=" + items +
                ", selectedItem=" + selectedItem +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", experience=" + experience +
                ", health=" + health +
                ", defense=" + defense +
                ", speed=" + speed +
                ", dps=" + dps +
                ", spawnLevel=" + spawnLevel +
                ", housingSpace=" + housingSpace +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }

    public double getDamage() {
        return damage;
    }

    @Override
    public void nextWeapon() {
        int index = getCurrentItemIndex();
        if(index+1 >= this.items.size()){//this if make the list like circular
            index = 0; //first
        }else{
            index+=1;//next
        }
        selectedItem = items.get(index);
    }

    public void attack(Fighter fighter) {
        double totalDamage = selectedItem.damage;
        if(selectedItem.damage >0){
           totalDamage+=this.damage;
        }
        fighter.health-= totalDamage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    

}
