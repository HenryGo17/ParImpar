
import java.util.Scanner;
import javax.swing.JOptionPane;

// Ventana para desarrollo del juego
public class VentanaJuego1 extends javax.swing.JFrame {

       //Codigo para que la ventana Jframe se ejecute
    public VentanaJuego1() {
        initComponents();
        panel.setFocusable(true);
        
    }
    //Con este codigo permitimos que nuesto Label se le asigne un valor
    public void addNumber (String digito){
        mov.setText(digito);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        mov = new javax.swing.JLabel();
        numAzar = new javax.swing.JButton();
        numPar = new javax.swing.JButton();
        numImpar = new javax.swing.JButton();
        Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 255, 255));

        mov.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        mov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movMouseDragged(evt);
            }
        });

        numAzar.setText("Presiona el Boton");
        numAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAzarActionPerformed(evt);
            }
        });

        numPar.setText("Es Par?");
        numPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numParActionPerformed(evt);
            }
        });

        numImpar.setText("Es Impar?");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(numPar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numImpar)
                .addGap(85, 85, 85))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numAzar)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(numAzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numImpar)
                    .addComponent(numPar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Codigo que da moviemiento al número
    private void movMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movMouseDragged
        // TODO add yomov
        mov.setLocation(mov.getLocation().x+evt.getX()- mov.getWidth()/2,mov.getLocation().y+evt.getY()- mov.getHeight());
          
    }//GEN-LAST:event_movMouseDragged
    

    //Codigo para ingresar un número al azar cuando se presione el boton 
    private void numAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAzarActionPerformed
        
    int aleatorio=0;
    aleatorio= (int)(Math.random()*100);       
        
    addNumber(""+aleatorio);
     
     
    }//GEN-LAST:event_numAzarActionPerformed

    
    //Codigo boton Par, validara si el número es par
    private void numParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numParActionPerformed
     
     int numero;
     numero = Integer.parseInt(mov.getText());
     
     
     if (numero % 2 == 0){
      JOptionPane.showMessageDialog(null,"   Correcto  ");
     }
     else {
         JOptionPane.showMessageDialog(null,"   Incorrecto  ");
     }
    }//GEN-LAST:event_numParActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaJuego1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Resultado;
    private javax.swing.JLabel mov;
    private javax.swing.JButton numAzar;
    private javax.swing.JButton numImpar;
    private javax.swing.JButton numPar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
