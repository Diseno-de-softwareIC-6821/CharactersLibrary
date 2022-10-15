/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.JSONLoader;
import Model.CharactersLibrary.Classes.Fighter;
import Model.CharactersLibrary.Classes.Item;
import Model.CharactersLibrary.Intefaces.ILeveled;
import Model.CircularList.CircularStructure;
import Model.CircularList.Node;
import Model.Enums.EIleveled;
import Model.GameClasses.Configuration;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Esteb
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    CircularStructure list;
    Node current;
    private Fighter selectedFighter;
    private Item selectedItem;
    
    
    public MainScreen() throws Exception {
        initComponents();
        SpinnerModel smodel = new SpinnerNumberModel(2, 2, 20, 1);
        list = new CircularStructure();
        
        ArrayList<ILeveled> characterList =  JSONLoader.getIleveled(EIleveled.FIGHTER);
        
        list.insert( characterList);
        
        this.squaresSizeSpinner.setModel(smodel);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        current = list.first;
        
        jProgressBarSpeed.setStringPainted(true);
        jProgressBarDamage.setStringPainted(true);
        
        updateUI();
    }
    private void updateUI(){
        String nameImage ="";
        if(isFighter()){
            Fighter oneFighter = (Fighter) current.getIleveled();
            jTextFieldName.setText(oneFighter.getName());
            jProgressBarSpeed.setValue((int) oneFighter.getSpeed());
            //jProgressBarDamage.setValue((int));
            nameImage = oneFighter.getCurrentTexture();
            jProgressBarDamage.setValue((int)oneFighter.getDamage());
        }else{
            Item oneItem = (Item) current.getIleveled();
            jTextFieldName.setText(oneItem.getName());
            jProgressBarSpeed.setValue((int) oneItem.getAmmo());
            nameImage = oneItem.getCurrentTexture();
        
        }
        jPanelCharacterSelected.setSize(100, 100);
        jPanelItemSelected.setSize(100,100);
        paintImage(jPanelImageSelection, nameImage, jLabelImageSelection);

        
    }
    private boolean isFighter(){
        if(current.getIleveled() instanceof Fighter){
            return true;
        }
        return false;
    }   
    private void paintImage(JPanel panel, String route, JLabel label){
        route = Configuration.IMAGE_ROUTE.concat(route);
        label.setSize(panel.getWidth(), panel.getHeight());
        ImageIcon image = new ImageIcon(route);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(
                                    panel.getWidth(), 
                                    panel.getHeight(), 
                                    Image.SCALE_DEFAULT));

        label.setIcon(icon);
        label.setBounds(0, 0,    panel.getWidth(),  panel.getHeight());
        panel.add(label);
        panel.repaint();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMaintitle = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        squaresSizeSpinner = new javax.swing.JSpinner();
        jLabelSquaresXSquares = new javax.swing.JLabel();
        jLabelConfiguration = new javax.swing.JLabel();
        jPanelImageSelection = new javax.swing.JPanel();
        jButtonNext = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jLabelSelection = new javax.swing.JLabel();
        jLabelImageSelection = new javax.swing.JLabel();
        jPanelStadistics = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelInformationTitle = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jLabelDamage = new javax.swing.JLabel();
        jProgressBarSpeed = new javax.swing.JProgressBar();
        jProgressBarDamage = new javax.swing.JProgressBar();
        jTextFieldName = new javax.swing.JTextField();
        jPanelCharacterSelected = new javax.swing.JPanel();
        jLabelImageCharacterSelected = new javax.swing.JLabel();
        jPanelItemSelected = new javax.swing.JPanel();
        jLabelItemSelected = new javax.swing.JLabel();
        jLabelImageItemSelected = new javax.swing.JLabel();
        jLabelPlus = new javax.swing.JLabel();
        jLabelCharacterSelected = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(183, 65, 7));

        jPanel3.setBackground(new java.awt.Color(158, 3, 3));

        jLabelMaintitle.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabelMaintitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMaintitle.setText("Characters Simulator");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabelMaintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelMaintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButtonStart.setBackground(new java.awt.Color(204, 255, 204));
        jButtonStart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.setEnabled(false);
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(179, 200, 68));

        squaresSizeSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(squaresSizeSpinner, ""));
        squaresSizeSpinner.setFocusable(false);
        squaresSizeSpinner.setValue(2);

        jLabelSquaresXSquares.setText("Squares X Squares");

        jLabelConfiguration.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelConfiguration.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfiguration.setText("Configurations");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSquaresXSquares, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(squaresSizeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelConfiguration)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConfiguration)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSquaresXSquares)
                    .addComponent(squaresSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelImageSelection.setBackground(new java.awt.Color(208, 108, 51));

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonDone.setBackground(new java.awt.Color(219, 219, 124));
        jButtonDone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jLabelSelection.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSelection.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSelection.setText("Select your character");

        jLabelImageSelection.setText("  ");

        javax.swing.GroupLayout jPanelImageSelectionLayout = new javax.swing.GroupLayout(jPanelImageSelection);
        jPanelImageSelection.setLayout(jPanelImageSelectionLayout);
        jPanelImageSelectionLayout.setHorizontalGroup(
            jPanelImageSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageSelectionLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanelImageSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageSelectionLayout.createSequentialGroup()
                        .addComponent(jLabelSelection)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImageSelectionLayout.createSequentialGroup()
                        .addGroup(jPanelImageSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelImageSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelImageSelectionLayout.createSequentialGroup()
                                .addComponent(jButtonBack)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNext)))
                        .addGap(79, 79, 79)
                        .addComponent(jButtonDone)
                        .addContainerGap())))
        );
        jPanelImageSelectionLayout.setVerticalGroup(
            jPanelImageSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImageSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSelection)
                .addGap(63, 63, 63)
                .addComponent(jLabelImageSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanelImageSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDone)
                    .addComponent(jButtonNext)
                    .addComponent(jButtonBack))
                .addContainerGap())
        );

        jPanelStadistics.setBackground(new java.awt.Color(204, 102, 0));

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Name");

        jLabelInformationTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelInformationTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformationTitle.setText("Stadistics");

        jLabelSpeed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelSpeed.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSpeed.setText("Speed");

        jLabelDamage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDamage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDamage.setText("Damage");

        jProgressBarSpeed.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBarSpeed.setForeground(new java.awt.Color(0, 0, 0));

        jProgressBarDamage.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBarDamage.setForeground(new java.awt.Color(0, 0, 0));

        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelStadisticsLayout = new javax.swing.GroupLayout(jPanelStadistics);
        jPanelStadistics.setLayout(jPanelStadisticsLayout);
        jPanelStadisticsLayout.setHorizontalGroup(
            jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInformationTitle)
                    .addGroup(jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelStadisticsLayout.createSequentialGroup()
                            .addComponent(jLabelSpeed)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                            .addComponent(jProgressBarSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                            .addComponent(jLabelName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                        .addComponent(jLabelDamage)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBarDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelStadisticsLayout.setVerticalGroup(
            jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInformationTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                        .addGroup(jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelSpeed)
                                    .addComponent(jProgressBarSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDamage))
                    .addComponent(jProgressBarDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCharacterSelected.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelCharacterSelectedLayout = new javax.swing.GroupLayout(jPanelCharacterSelected);
        jPanelCharacterSelected.setLayout(jPanelCharacterSelectedLayout);
        jPanelCharacterSelectedLayout.setHorizontalGroup(
            jPanelCharacterSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCharacterSelectedLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelImageCharacterSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCharacterSelectedLayout.setVerticalGroup(
            jPanelCharacterSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCharacterSelectedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImageCharacterSelected)
                .addGap(32, 32, 32))
        );

        jPanelItemSelected.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelItemSelectedLayout = new javax.swing.GroupLayout(jPanelItemSelected);
        jPanelItemSelected.setLayout(jPanelItemSelectedLayout);
        jPanelItemSelectedLayout.setHorizontalGroup(
            jPanelItemSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemSelectedLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanelItemSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelImageItemSelected)
                    .addComponent(jLabelItemSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelItemSelectedLayout.setVerticalGroup(
            jPanelItemSelectedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemSelectedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImageItemSelected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelItemSelected)
                .addGap(25, 25, 25))
        );

        jLabelPlus.setFont(new java.awt.Font("Unispace", 0, 48)); // NOI18N
        jLabelPlus.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlus.setText("+");

        jLabelCharacterSelected.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCharacterSelected.setText("Character Selected");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Item Selected");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanelImageSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelStadistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCharacterSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCharacterSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanelItemSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImageSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelStadistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCharacterSelected)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelCharacterSelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelItemSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
       
            GameScreen newGame = new GameScreen((int) squaresSizeSpinner.getValue(), this.selectedFighter);
            newGame.setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        if(this.selectedFighter == null){
            selectedFighter  = (Fighter) current.getIleveled();
            
            jLabelSpeed.setText("Ammo");
            list = new CircularStructure();
            try {
                list.insert(JSONLoader.getIleveled(EIleveled.ITEMS));
            } catch (ParseException | IOException ex) {
                 System.out.println("Error al cargar los item");
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
               
            }
            this.jLabelSelection.setText("Select your Item");
            paintImage(jPanelCharacterSelected, selectedFighter.getCurrentTexture(), jLabelImageCharacterSelected);
            current = list.first;
            updateUI();
        }else if(this.selectedItem == null){ 
            selectedItem  = (Item) current.getIleveled();
            this.selectedFighter.addItem(selectedItem);
            paintImage(jPanelItemSelected, selectedItem.getCurrentTexture(), jLabelImageItemSelected);
            this.jButtonStart.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        current = current.getNext();
        updateUI();
              
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        current = current.getBack();
        updateUI();
    }//GEN-LAST:event_jButtonBackActionPerformed
    public void ItemSelection(){
        this.jLabelSelection.setText("Choose one item");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainScreen().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCharacterSelected;
    private javax.swing.JLabel jLabelConfiguration;
    private javax.swing.JLabel jLabelDamage;
    private javax.swing.JLabel jLabelImageCharacterSelected;
    private javax.swing.JLabel jLabelImageItemSelected;
    private javax.swing.JLabel jLabelImageSelection;
    private javax.swing.JLabel jLabelInformationTitle;
    private javax.swing.JLabel jLabelItemSelected;
    private javax.swing.JLabel jLabelMaintitle;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPlus;
    private javax.swing.JLabel jLabelSelection;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JLabel jLabelSquaresXSquares;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCharacterSelected;
    private javax.swing.JPanel jPanelImageSelection;
    private javax.swing.JPanel jPanelItemSelected;
    private javax.swing.JPanel jPanelStadistics;
    private javax.swing.JProgressBar jProgressBarDamage;
    private javax.swing.JProgressBar jProgressBarSpeed;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JSpinner squaresSizeSpinner;
    // End of variables declaration//GEN-END:variables
}
