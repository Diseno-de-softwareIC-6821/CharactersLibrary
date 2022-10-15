/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.GameClasses;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Esteb
 */
public class Configuration {
    
    public static final Color DEFAULT_SQUARE_COLOR = Color.WHITE;
    public static final int SCREEN_SIZE = 600;   
    public static final Border DEFAULT_SQUARE_BORDER = BorderFactory.createLineBorder(Color.BLACK);
    public static final int IMAGE_SIZE_SETTING  = 2;
    public static final String JSON_ROUTE = "CharacterBlueprints.json";
    //
    public static final String IMAGE_ROUTE  = "src\\Media\\";
    public static final int ENEMIES_PER_LEVEL = 2;
    public static final double DAMAGE_PER_LEVEL_UP = 5;
    
}
