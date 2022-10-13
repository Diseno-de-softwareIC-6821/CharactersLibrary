/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.GameClasses;

import Control.Board;
import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Intefaces.IAction;
import Model.CharactersLibrary.Intefaces.ILeveled;
/**
 *
 * @author Esteb
 */
public class Proxy implements IAction,ILeveled{

    private Board board; 
    private Fighter fighter; 
    
    public Proxy() {
        
    }
    
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public void setFighter(Fighter fighter) {
        this.fighter = fighter;
    }
    
    
    
    
    @Override
    public void moveUp() {
        //implements the move up in the interface
        fighter.moveUp();
    }

    @Override
    public void moveDown() {
        //
        fighter.moveDown();
            
    }

    @Override
    public void moveLeft() {
        //implements move left implementations
        fighter.moveLeft();
    }

    @Override
    public void moveRight() {

        fighter.moveRight();
    }



    @Override
    public void levelUp() {
        
    }

    @Override
    public void levelDown() {

        fighter.levelDown();
    }

}
