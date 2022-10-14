/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.CharactersLibrary.Classes.Fighter;
import Model.GameClasses.Proxy;
import Vista.GameScreen;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Esteb
 */
public class GameControl implements KeyListener{
    Board board;
    GameScreen screen;
    Proxy proxy;

    public GameControl(int size, Fighter fighter, GameScreen screen) {
        this.board = new Board(size, fighter);
        this.proxy = new Proxy();
        this.proxy.setBoard(board);
        this.proxy.setFighter(fighter);
        this.screen = screen;
        this.screen.addBoard(board);
              
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode){
            case KeyEvent.VK_W:
                proxy.moveUp();
                //up
                break;
            case KeyEvent.VK_D:
                proxy.moveRight();
                //right
                break;
            case KeyEvent.VK_A:
                proxy.moveLeft();
                //left
                break;
            case KeyEvent.VK_S:
                proxy.moveDown();
                //down
                break;
            default:
                System.out.println("Another key have been pressed");

                
        }
        e.consume(); //important beacause this event can throw weird things
      
    }

    public Board getBoard() {
        return board;
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
