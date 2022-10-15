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
import Model.GameClasses.Container;
import java.io.IOException;
import javax.swing.border.Border;
import org.json.simple.parser.ParseException;

/**
 *
 * @author 
 */


public class Board {
           
    private Square[][] squares;
    private int size; 
    private Fighter fighter; 
    private ArrayList<Fighter> enemies; 
    
    public Board(int size, Fighter fighter) {
        this.squares = new Square[size][size];
        this.size = size;
        this.fighter = fighter;
        generateSquares();
        enemies = new ArrayList<>();
    }
    public void setUpEnemies() throws ParseException, IOException{
        ArrayList<Fighter> newEnemies = JSONLoader.getAllFighters();
        for(int i = 0; i<Configuration.ENEMIES_PER_LEVEL; i++){
            enemies.add(newEnemies.get(i));
        }
    }
    public ArrayList<Fighter> getNearEnemies(){
        ArrayList<Fighter> nearEnemies = new ArrayList<>();
        int x = fighter.getPosX();
        int y = fighter.getPosY();
        int weaponRange = fighter.getSelectedItem().getExploRange();
        for(int i = x; i< x+weaponRange && isValidSquare(i, y); i++){
            Fighter maybeEnemy = searchEnemyByPosition(i, y);
            if(maybeEnemy != null){
                nearEnemies.add(fighter);
            }
            
        }
        for(int i = x; i > x-weaponRange && isValidSquare(i, y); i--){
            Fighter maybeEnemy = searchEnemyByPosition(i, y);
            if(maybeEnemy != null){
                nearEnemies.add(fighter);
            }
        }
        for(int i = y; i< y+weaponRange && isValidSquare(i, y); i++){
            Fighter maybeEnemy = searchEnemyByPosition(i, y);
            if(maybeEnemy != null){
                nearEnemies.add(fighter);
            }
        }
        for(int i = y; i>y-weaponRange && isValidSquare(i, y); i--){
             Fighter maybeEnemy = searchEnemyByPosition(i, y);
            if(maybeEnemy != null){
                nearEnemies.add(fighter);
            }
        }
        return nearEnemies;
    }
    private Fighter searchEnemyByPosition(int i, int j ){
        for(Fighter enemy : enemies){
            if(enemy.getPosX() == i && enemy.getPosY() ==j ){
                return enemy;
            }
        }
        return null;
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

    public Fighter getFighter() {
        return fighter;
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
    public boolean isValidSquare(int i, int j){
        System.out.println("Checking for this position"+ String.valueOf(i)+","+ String.valueOf(j));
        if((i < this.size && i>=0) &&(j < this.size && j >=0)){
            Container nextContainer = this.getSquare(i, j).getContainer();
            if( nextContainer !=Container.HOLE){
                return true;
            }
        }
        return false;
    }
    
    public boolean isNextMoveValid(EMovements nextMove){
        boolean isValid = true;
        switch(nextMove){
            case MOVE_UP: 
                if(!isValidSquare(this.fighter.getPosX(), this.fighter.getPosY()-1)){isValid = false;}
                break;
            case MOVE_DOWN: 
                if(!isValidSquare(this.fighter.getPosX(), this.fighter.getPosY()+1)){isValid = false;}
                break;
            case MOVE_LEFT: 
                if(!isValidSquare(this.fighter.getPosX()-1, this.fighter.getPosY())){ isValid = false ;}
                break;
            case MOVE_RIGHT: 
                if(!isValidSquare(this.fighter.getPosX()+1, this.fighter.getPosY())){isValid = false;}
                break;
            default: 
                System.out.println("No movement implemented");
                isValid = false ;
        }
        
        return isValid;
    }
    public void beforeMove(){
        
        Square actualSquare = this.getSquare(this.getActualX(), this.getActualY());
        actualSquare.changeState();
        actualSquare.getPanel().remove(actualSquare.getLabelImage());
        actualSquare.getPanel().repaint();
    }

    //movement implementations 
    
    public void moveFighter(Fighter fighter){
        int x = fighter.getPosX();
        int y = fighter.getPosY();
        
        Square nextSquare = this.getSquare(x, y);
        nextSquare.setImage(fighter.getCurrentTexture());
        
    }

    


    
    
    
}
