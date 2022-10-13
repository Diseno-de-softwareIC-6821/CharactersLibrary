/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;

/**
 *
 * @author Esteb
 */
public class Item implements ILeveled{
    private String name;
    
    private int level;
    private int scope;
    private double duration;
    private double damage;
    private int exploRange;
    //private weaponType :eWeapon,
    private int ammo;
    //private textureMap: Map<number, string>, 
    //private currentTexture: string,
    @Override
    public void levelUp() {
        this.level+=1;
    }

    @Override
    public void levelDown() {
        this.level-=1;
    }
    
}
