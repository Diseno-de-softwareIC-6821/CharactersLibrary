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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Esteb
 */
public class GameControl extends Thread implements KeyListener {
    Board board;
    GameScreen screen;
    Proxy proxy;
    public  volatile boolean stopGame;

    public GameControl(int size, Fighter fighter, GameScreen screen) {
        this.board = new Board(size, fighter);
        this.proxy = new Proxy();
        this.proxy.setBoard(board);
        this.proxy.setFighter(fighter);
        this.screen = screen;
        this.screen.addBoard(board);
        stopGame = false;
        this.start();
    }
    @Override
    public void run(){
        while(!stopGame){
            screen.updateInterface();
            try {
                sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("failed theread");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
           System.out.println("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode){
            case KeyEvent.VK_W:
                proxy.moveUp();
                //up
                System.out.println("Moving up");
                break;
            case KeyEvent.VK_D:
                proxy.moveRight();
                //right
                System.out.println("Moving Right");
                break;
            case KeyEvent.VK_A:
                proxy.moveLeft();
                //left
                System.out.println("Moving left");
                break;
            case KeyEvent.VK_S:
                proxy.moveDown();
                //down
                System.out.println("Moving down");
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
            System.out.println("KeyRelease");
    }
    
    
    
}
