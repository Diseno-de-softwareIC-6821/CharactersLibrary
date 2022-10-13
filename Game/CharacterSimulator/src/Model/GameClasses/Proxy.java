/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.GameClasses;

import Control.Board;
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
    private GameScreen screen; 
    public Proxy() {
        
    }

    public void setScreen(GameScreen screen) {
        this.screen = screen;
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
        this.board.beforeMove();
        fighter.moveUp();
        this.board.moveFighter();
    }

    @Override
    public void moveDown() {
        //
        this.board.beforeMove();
        fighter.moveDown();
        this.board.moveFighter();
    }

    @Override
    public void moveLeft() {
 
        this.board.beforeMove();

        fighter.moveLeft();
        this.board.moveFighter();
    }

    @Override
    public void moveRight() {
        this.board.beforeMove();
        fighter.moveRight();
        this.board.moveFighter();
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
