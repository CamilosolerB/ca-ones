/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canhones;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/**
 *
 * @author caans
 */
public class Vista extends javax.swing.JFrame {
    
    //Graphics g;
    int scoreB = 0;
    int scoreN = 0;
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        int[][] ubicacion = ubicacionMuros();
        Wall linea1 = new Wall(ubicacion[0][0], ubicacion[0][1], ubicacion[0][2], ubicacion[0][3]);
        Wall linea2 = new Wall(ubicacion[1][0], ubicacion[1][1], ubicacion[1][2], ubicacion[1][3]);
        Wall linea3 = new Wall(ubicacion[2][0], ubicacion[2][1], ubicacion[2][2], ubicacion[2][3]);
        linea1.graphLinea(g);
        linea2.graphLinea(g);
        linea3.graphLinea(g);
    }
    public int[][] ubicacionMuros() {
        int[][] dimensiones = new int[3][4];
        String valores;
        JOptionPane.showMessageDialog(null, "Bienvenido, para trazar las dimensiones, separe por coma al ingresar los valores\n"
                + "y anote las coordenadas en el siguiente orden:\n"
                + "1. Posición inicial en X\n"
                + "2. Posición inicial en Y\n"
                + "3. Posición final en X\n"
                + "4. Posición final en Y");
        for (int i = 0; i < dimensiones.length; i++) {
            valores = JOptionPane.showInputDialog("Indique las coordenadas para el muro " + (i + 1));
            String[] partes = valores.split(",");
            if (partes.length == 4) {
                for (int j = 0; j < 4; j++) {
                    dimensiones[i][j] = Integer.parseInt(partes[j].trim());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en el formato de coordenadas. Deben ser 4 números separados por comas.");
            }
        }
        return dimensiones;
    }
    
    
    public void disparo(){
        int velIniB = Integer.parseInt(VelInicialB.getText());
        int velIniN = Integer.parseInt(VelInicialN.getText());
        int angleB = Integer.parseInt(anguloB.getText());
        int angleN = Integer.parseInt(anguloN.getText());
        CanonNegro canonN = new CanonNegro(angleN, velIniN);
        CanonBlanco canonB = new CanonBlanco(angleB, velIniB);
        System.out.println("Cañon blanco 1");
        int canon1B = canonB.graphTiro(plano, 80, 75);
        System.out.println("Cañon blanco 2");
        int canon2B = canonB.graphTiro(plano, 170, 75);
        System.out.println("Cañon negro 1");
        int canon1N = canonN.graphTiro(plano, 640, 80);
        System.out.println("Cañon negro 2");
        int canon2N = canonN.graphTiro(plano, 740, 80);
        scoreB = canon1B + canon2B;
        scoreN = canon1N + canon2N;
        disparoB.setText(""+scoreB);
        disparoN.setText(""+scoreN);
    }
    public Vista() {
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VelInicialN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        anguloN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        disparoN = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        anguloB = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        VelInicialB = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        disparoB = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        plano = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 35), new java.awt.Dimension(0, 35), new java.awt.Dimension(32767, 35));

        jLabel6.setText("Disparos acertados blancas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Negras");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Velocidad Inicial");

        VelInicialN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelInicialNActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Angulo de disparo");

        anguloN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloNActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("!Dispara!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disparos acertados Negras");

        disparoN.setBackground(new java.awt.Color(255, 255, 255));
        disparoN.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(anguloN, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(VelInicialN)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(disparoN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VelInicialN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anguloN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(disparoN)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, 540));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Blancas");

        anguloB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloBActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("!Dispara!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Angulo de disparo");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Velocidad Inicial");

        VelInicialB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelInicialBActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Angulo de disparo");

        disparoB.setText("0");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Disparos acertados blancas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disparoB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anguloB, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel16))
                    .addComponent(VelInicialB, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(68, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addContainerGap(69, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VelInicialB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anguloB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(disparoB)
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(258, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        plano.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canhones/canon (1).png"))); // NOI18N
        jLabel9.setText("jLabel7");
        plano.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 90, 90));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canhones/canon (1).png"))); // NOI18N
        jLabel10.setText("jLabel7");
        plano.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 90, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canhones/canon (2).png"))); // NOI18N
        jLabel11.setText("jLabel7");
        plano.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 90, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canhones/canon (2).png"))); // NOI18N
        jLabel12.setText("jLabel7");
        plano.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/canhones/campo.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        plano.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 6, 1170, -1));
        plano.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 40, 140));

        getContentPane().add(plano, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 830, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VelInicialNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelInicialNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VelInicialNActionPerformed

    private void anguloNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloNActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    disparo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VelInicialBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelInicialBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VelInicialBActionPerformed

    private void anguloBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        disparo();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VelInicialB;
    private javax.swing.JTextField VelInicialN;
    private javax.swing.JTextField anguloB;
    private javax.swing.JTextField anguloN;
    private javax.swing.JLabel disparoB;
    private javax.swing.JLabel disparoN;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel plano;
    // End of variables declaration//GEN-END:variables
}
