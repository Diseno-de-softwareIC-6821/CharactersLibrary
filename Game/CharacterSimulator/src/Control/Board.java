/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Intefaces.IAction;
import Model.GameClasses.Square;
import java.awt.Color;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Model.GameClasses.Configuration;
import javax.swing.border.Border;

/**
 *
 * @author 
 */


public class Board {
           
    private Square[][] squares;
    private int size; 
    private Fighter fighter; 
    
    public Board(int size, Fighter fighter) {
        this.squares = new Square[size][size];
        this.size = size;
        this.fighter = fighter;
        generateSquares();
    }
    private void setFighter(Fighter oneFighter){
        this.fighter = oneFighter;
    }

    public Square[][] getBoard() {
        return squares;
    }
    public Square getSquare(int i, int j){
        return squares[i][j];
    }
    

    private void generateSquares(){
        int sizeXsquare = Configuration.SCREEN_SIZE/this.size;
        for(int i = 0; i<size; i++){
            for(int j  = 0; j<size; j++){
                JPanel onePanel = new JPanel();
                onePanel.setSize(sizeXsquare, sizeXsquare);
                onePanel.setBackground(Configuration.DEFAULT_SQUARE_COLOR);
                onePanel.setLocation(i * sizeXsquare, j*sizeXsquare);
                onePanel.setBorder(Configuration.DEFAULT_SQUARE_BORDER);
             
                this.squares[i][j] = new Square(i*sizeXsquare, j* sizeXsquare, onePanel, false );
            }
        }
    }
    

    public int getSize() {
        return size;
    }
    public int getActualX(){
        return this.fighter.getPosX();
    }
    public int getActualY(){
        return this.fighter.getPosY();
    }
    public boolean isNextMoveValid(){
  
        
    }
    public void beforeMove(){
        
        Square actualSquare = this.getSquare(this.getActualX(), this.getActualY());
        actualSquare.changeState();
    }

    //movement implementations 
    
    public void moveFighter(){
        
        int x = this.fighter.getPosX();
        int y = this.fighter.getPosY();
        
        Square nextSquare = this.getSquare(x, y);
        nextSquare.setImage(this.fighter.getCurrentTexture());
        nextSquare.changeState(); 
    }

    


    
    
    
}
