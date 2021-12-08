
public class Inicio extends javax.swing.JFrame {

    /**
     * Esta Ventana sera para ingresar al juego, lo haremos solo con un boton Inicio
     */
    public Inicio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InicioJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        InicioJuego.setBackground(new java.awt.Color(0, 255, 255));
        InicioJuego.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        InicioJuego.setText("Juguemos Par Impar");
        InicioJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InicioJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioJuegoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(InicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(InicioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 262);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioJuegoMouseClicked
        // Codigo para pasar a la Ventana del Juego
        VentanaJuego1 iniciar = new VentanaJuego1();
        iniciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioJuegoMouseClicked

    
    public static void main(String args[]) {
        //Evento para iniciar la ventana Jframe
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicioJuego;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private VentanaJuego1 VentanaJuego1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
