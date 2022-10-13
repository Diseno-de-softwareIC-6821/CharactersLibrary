/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Esteb
 */
public class Character implements  ILeveled{
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
    

    
    @Override
    public void levelUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void levelDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
