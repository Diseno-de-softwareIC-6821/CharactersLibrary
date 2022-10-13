/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

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


public class Board  {
           
    private Square[][] squares;
    private int size; 
    public Board(int size) {
        this.squares = new Square[size][size];
        this.size = size;
        generateSquares();
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


    
    
    
}
