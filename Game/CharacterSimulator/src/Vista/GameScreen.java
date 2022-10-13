/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Control.Board;
import Model.GameClasses.Square;

/**
 *
 * @author Esteb
 */
public class GameScreen extends javax.swing.JFrame {

    /**
     * Creates new form GameScreen
     */
    Board board;
    public GameScreen(int size) {
        initComponents();
        board = new Board(size);
        this.addBoard();
        this.jTextFieldCharacterLevel.setEditable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void addBoard(){
        Square[][] squares = board.getBoard();
        for(int i = 0; i < board.getSize(); i++){
            for(int j = 0; j < board.getSize(); j++){
                Square oneSquare = squares[i][j];
                this.screenBoard.add(oneSquare.getPanel());
            }
        }
    }
     public GameScreen() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screenBoard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCharacterTittle = new javax.swing.JLabel();
        jPanelImage = new javax.swing.JPanel();
        jLabelLevel = new javax.swing.JLabel();
        jTextFieldCharacterLevel = new javax.swing.JTextField();
        jProgressBarExperience = new javax.swing.JProgressBar();
        jlabelCharacterEXP = new javax.swing.JLabel();
        jLabelCharacterName = new javax.swing.JLabel();
        jTextFieldCharacterHealth = new javax.swing.JTextField();
        jLabelCharacterhealth = new javax.swing.JLabel();
        jTextFieldCharacterName = new javax.swing.JTextField();
        jTextFieldCharacterItem = new javax.swing.JTextField();
        jLabelCharacterSpeed1 = new javax.swing.JLabel();
        jTextFieldCharacterSpeed = new javax.swing.JTextField();
        jLabelCharacterSpeed2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbuttonSalir = new javax.swing.JButton();
        jLabelGameStadisctics = new javax.swing.JLabel();
        jLabelTimeTittle = new javax.swing.JLabel();
        jLabelClockTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        screenBoard.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout screenBoardLayout = new javax.swing.GroupLayout(screenBoard);
        screenBoard.setLayout(screenBoardLayout);
        screenBoardLayout.setHorizontalGroup(
            screenBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        screenBoardLayout.setVerticalGroup(
            screenBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabelCharacterTittle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCharacterTittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterTittle.setText("Character");

        jPanelImage.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelImageLayout = new javax.swing.GroupLayout(jPanelImage);
        jPanelImage.setLayout(jPanelImageLayout);
        jPanelImageLayout.setHorizontalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelImageLayout.setVerticalGroup(
            jPanelImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabelLevel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLevel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLevel.setText("Level");

        jTextFieldCharacterLevel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCharacterLevel.setFocusable(false);
        jTextFieldCharacterLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCharacterLevelActionPerformed(evt);
            }
        });

        jProgressBarExperience.setForeground(new java.awt.Color(0, 204, 204));

        jlabelCharacterEXP.setForeground(new java.awt.Color(0, 255, 255));
        jlabelCharacterEXP.setText("/exp");

        jLabelCharacterName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCharacterName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterName.setText("Name");

        jTextFieldCharacterHealth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCharacterHealth.setFocusable(false);

        jLabelCharacterhealth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCharacterhealth.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterhealth.setText("Health");

        jTextFieldCharacterName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCharacterName.setFocusable(false);

        jTextFieldCharacterItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCharacterItem.setFocusable(false);

        jLabelCharacterSpeed1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCharacterSpeed1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterSpeed1.setText("Item");

        jTextFieldCharacterSpeed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCharacterSpeed.setFocusable(false);

        jLabelCharacterSpeed2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCharacterSpeed2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCharacterSpeed2.setText("Speed");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLevel)
                                    .addComponent(jLabelCharacterhealth)
                                    .addComponent(jLabelCharacterSpeed1)
                                    .addComponent(jLabelCharacterName)
                                    .addComponent(jLabelCharacterSpeed2))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCharacterHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCharacterLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldCharacterItem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCharacterSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelCharacterTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jProgressBarExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelCharacterEXP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCharacterTittle)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCharacterName)
                            .addComponent(jTextFieldCharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLevel)
                            .addComponent(jTextFieldCharacterLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCharacterhealth)
                    .addComponent(jTextFieldCharacterHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCharacterSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCharacterSpeed2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCharacterSpeed1)
                    .addComponent(jTextFieldCharacterItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBarExperience, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelCharacterEXP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));

        jbuttonSalir.setBackground(new java.awt.Color(198, 83, 83));
        jbuttonSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbuttonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonSalir.setText("Salir");
        jbuttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSalirActionPerformed(evt);
            }
        });

        jLabelGameStadisctics.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelGameStadisctics.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGameStadisctics.setText("Game stadistics");

        jLabelTimeTittle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTimeTittle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTimeTittle.setText("Time");

        jLabelClockTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelClockTime.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClockTime.setText("Time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbuttonSalir)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelTimeTittle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelClockTime)
                        .addGap(38, 38, 38))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabelGameStadisctics)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTimeTittle)
                    .addComponent(jLabelClockTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jbuttonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabelGameStadisctics)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(screenBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(screenBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSalirActionPerformed
        MainScreen ventana = new MainScreen();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbuttonSalirActionPerformed

    private void jTextFieldCharacterLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCharacterLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCharacterLevelActionPerformed

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
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCharacterName;
    private javax.swing.JLabel jLabelCharacterSpeed1;
    private javax.swing.JLabel jLabelCharacterSpeed2;
    private javax.swing.JLabel jLabelCharacterTittle;
    private javax.swing.JLabel jLabelCharacterhealth;
    private javax.swing.JLabel jLabelClockTime;
    private javax.swing.JLabel jLabelGameStadisctics;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelTimeTittle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelImage;
    private javax.swing.JProgressBar jProgressBarExperience;
    private javax.swing.JTextField jTextFieldCharacterHealth;
    private javax.swing.JTextField jTextFieldCharacterItem;
    private javax.swing.JTextField jTextFieldCharacterLevel;
    private javax.swing.JTextField jTextFieldCharacterName;
    private javax.swing.JTextField jTextFieldCharacterSpeed;
    private javax.swing.JButton jbuttonSalir;
    private javax.swing.JLabel jlabelCharacterEXP;
    private javax.swing.JPanel screenBoard;
    // End of variables declaration//GEN-END:variables
}
