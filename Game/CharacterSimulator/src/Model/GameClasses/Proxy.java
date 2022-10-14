/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.GameClasses;

import Control.Board;
import Control.EMovements;
import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Intefaces.IAction;
import Model.CharactersLibrary.Intefaces.ILeveled;
import Vista.GameScreen;
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
        if(this.board.isNextMoveValid(EMovements.MOVE_UP)){
            this.board.beforeMove();
            fighter.moveUp();
            this.board.moveFighter();
        }
     
    }

    @Override
    public void moveDown() {
        //
        if(this.board.isNextMoveValid(EMovements.MOVE_DOWN)){
            this.board.beforeMove();
            fighter.moveDown();
            this.board.moveFighter();
        }
     
    }

    @Override
    public void moveLeft() {
        if(this.board.isNextMoveValid(EMovements.MOVE_LEFT)){
            this.board.beforeMove();
            fighter.moveLeft();
            this.board.moveFighter();
        }
    }

    @Override
    public void moveRight() {
        if(this.board.isNextMoveValid(EMovements.MOVE_RIGHT)){
            this.board.beforeMove();
            fighter.moveRight();
            this.board.moveFighter();
        }
        
    }



    @Override
    public void levelUp() {
        fighter.levelUp();
       
    }

    @Override
    public void levelDown() {

        fighter.levelDown();
    }

}
