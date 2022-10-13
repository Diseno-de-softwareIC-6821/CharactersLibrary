/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;
import Model.CharactersLibrary.Intefaces.IAction;


import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Esteb
 */
public class Fighter implements  ILeveled,IAction {
    // public HashMap<int, String> textures;
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

    public Fighter() {
        
    }
    

    public Fighter(String currentTexture, ArrayList<Item> items, Item selectedItem, String name, int level, double experience, double health, double defense, double speed, double dps, int spawnLevel, int housingSpace, int posX, int posY) {
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
    }
    
    
    
    @Override
    public void levelUp() {
        this.level+=1;
    }
    @Override
    public void levelDown() {
        this.level-=1;
    }

    @Override
    public void moveUp() {
        this.posY+=1;
    }

    @Override
    public void moveDown() {
        this.posY-=1;
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

    
    
}
