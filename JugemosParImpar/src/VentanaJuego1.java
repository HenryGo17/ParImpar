
import java.applet.AudioClip;
import java.util.Scanner;
import javax.swing.JOptionPane;

// Ventana para desarrollo del juego
public class VentanaJuego1 extends javax.swing.JFrame {

    private AudioClip Sonido;

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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(650, 250));
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 255, 255));

        mov.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        mov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movMouseDragged(evt);
            }
        });

        numAzar.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        numAzar.setText("Presiona el Boton");
        numAzar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numAzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numAzarMouseEntered(evt);
            }
        });
        numAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAzarActionPerformed(evt);
            }
        });

        numPar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        numPar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boxempty.png"))); // NOI18N
        numPar.setText("Es Par?");
        numPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numParActionPerformed(evt);
            }
        });

        numImpar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        numImpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boxempty.png"))); // NOI18N
        numImpar.setText("Es Impar?");
        numImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numImparActionPerformed(evt);
            }
        });

        Resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.jpg"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(numAzar))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(numPar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(numImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(numAzar)
                .addGap(4, 4, 4)
                .addComponent(mov, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(numPar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(numImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
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
      AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Presionar.wav"));
        Sonido.play(); 
        
    int aleatorio=0;
    aleatorio= (int)(Math.random()*100);       
        
    addNumber(""+aleatorio);
     
     
    }//GEN-LAST:event_numAzarActionPerformed

    
    //Codigo boton Par, validara si el número es par
    private void numParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numParActionPerformed
     
     int numero;
     numero = Integer.parseInt(mov.getText());
     
     
     if (numero % 2 == 0){
         AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Correcto.wav"));
        Sonido.play();
      JOptionPane.showMessageDialog(null,"   Correcto  ");
      
     }
     else {
         AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Incorrecto.wav"));
        Sonido.play();
         JOptionPane.showMessageDialog(null,"   Incorrecto  ");
         
     }
    }//GEN-LAST:event_numParActionPerformed

    private void numImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numImparActionPerformed
        
        int numero;
        numero= Integer.parseInt(mov.getText());
        
        if (numero % 2 ==0){
            AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Incorrecto.wav"));
        Sonido.play();
            JOptionPane.showMessageDialog(null,"  Incorrecto  ");
           
        }
        else {
            AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Correcto.wav"));
        Sonido.play();
            JOptionPane.showMessageDialog(null,"   Correcto  ");
            
        }
    }//GEN-LAST:event_numImparActionPerformed

    private void numAzarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numAzarMouseEntered
        // TODO add your handling code here:AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Son/Click.wav"));
        Sonido.play();
    }//GEN-LAST:event_numAzarMouseEntered

    
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
