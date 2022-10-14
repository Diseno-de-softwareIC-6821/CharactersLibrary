/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.CharactersLibrary.Classes;

import Model.CharactersLibrary.Intefaces.ILeveled;
import Model.Enums.EType;
import Model.Enums.EWeapon;

import java.util.HashMap;

/**
 *
 * @author Esteb
 */
public class Item implements ILeveled{
    public String name;
    public EType type;
    public double level;
    public double scope;
    public double duration;
    public double damage;
    public double exploRange;
    public EWeapon weaponType;
    public double ammo;
    public HashMap<Integer,String> textureMap;
    public String currentTexture;

    public Item(String name, EType type, double level, double scope, double duration, double damage, double exploRange, EWeapon weaponType, double ammo, HashMap<Integer, String> textureMap, String currentTexture) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.scope = scope;
        this.duration = duration;
        this.damage = damage;
        this.exploRange = exploRange;
        this.weaponType = weaponType;
        this.ammo = ammo;
        this.textureMap = textureMap;
        this.currentTexture = currentTexture;
    }


    @Override
    public void levelUp() {
        this.level+=1;
    }

    @Override
    public void levelDown() {
        this.level-=1;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return (int)level;
    }

    public int getScope() {
        return (int) scope;
    }

    public double getDuration() {
        return duration;
    }

    public double getDamage() {
        return damage;
    }

    public int getExploRange() {
        return (int)exploRange;
    }

    public int getAmmo() {
        return (int) ammo;
    }

    public String getCurrentTexture() {
        return currentTexture;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", scope=" + scope +
                ", duration=" + duration +
                ", damage=" + damage +
                ", exploRange=" + exploRange +
                ", weaponType=" + weaponType +
                ", ammo=" + ammo +
                ", textureMap=" + textureMap +
                ", currentTexture='" + currentTexture + '\'' +
                '}';
    }

}
