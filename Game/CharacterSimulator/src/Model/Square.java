/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Esteb
 */
public class Square {
    
    private int x; 
    private int j; 
    private JPanel panel; 
    private boolean isOcupated;
    private Container container;
     

    public Square(int x, int j, JPanel panel, boolean isOcupated) {
        this.x = x;
        this.j = j;
        this.panel = panel;
        this.isOcupated = isOcupated;
        this.container = container.VOID;
    }
    public void change(){
        this.isOcupated = !this.isOcupated;
    }
    public void setItem(){
        this.container = Container.ITEM;
        this.panel.setBackground(Color.YELLOW);
    }
    public void setHole(){
        this.container = Container.HOLE;
        this.panel.setBackground(Color.BLACK);
    }
    public void setVoid(){
        this.container = Container.VOID;
        this.panel.setBackground(Configuration.DEFAULT_SQUARE_COLOR);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public JPanel getPanel() {
        return this.panel;
    }

    public void setPanel(JPanel label) {
        this.panel = label;
    }

    public boolean isIsOcupated() {
        return isOcupated;
    }

    public void setIsOcupated(boolean isOcupated) {
        this.isOcupated = isOcupated;
    }
    
    
    
    
    
    
    
}
