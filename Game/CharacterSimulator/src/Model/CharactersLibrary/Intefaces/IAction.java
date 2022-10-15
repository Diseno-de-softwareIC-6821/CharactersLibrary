/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.CharactersLibrary.Intefaces;

import Model.CharactersLibrary.Classes.Fighter;

/**
 *
 * @author Esteb
 */
public interface IAction {
    
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
    public void nextWeapon();
    public void attack(Fighter fighter );

    
    
}
