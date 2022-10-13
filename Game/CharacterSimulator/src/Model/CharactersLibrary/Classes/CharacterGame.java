/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;
import java.util.ArrayList;

/**
 *
 * @author Esteb
 */
public class CharacterGame implements  ILeveled{
    // public HashMap<int, String> textures;
    public String currentTexture;
    public ArrayList<Item>  items;
    public Item selectedItem;
    public String name; 
    public int level; 
    public double experience;
    public double health;
    public double defense;
    public double speed; 
    public double dps;
    public int spawnLevel;
    public int housingSpace;
    public int posX;
    public int posY;

    public CharacterGame(String currentTexture, ArrayList<Item> items, Item selectedItem, String name, int level, double experience, double health, double defense, double speed, double dps, int spawnLevel, int housingSpace, int posX, int posY) {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void levelDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "CharacterGame{" +
                "currentTexture='" + currentTexture + '\'' +
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
}
