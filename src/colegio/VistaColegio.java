/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author Cristian
 */
public class VistaColegio extends javax.swing.JFrame {

    /**
     * Creates new form VistaColegio
     */
    public VistaColegio() {
        initComponents();
        initPintar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaMates = new javax.swing.JTextField();
        cajaEDFisica = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        etiquetaMates = new javax.swing.JLabel();
        etiquetaEDFisica = new javax.swing.JLabel();
        cajaCatalan = new javax.swing.JTextField();
        etiquetaCatalan = new javax.swing.JLabel();
        etiquetaMedia = new javax.swing.JLabel();
        cajaMedia = new javax.swing.JTextField();
        botonInicio = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        etiquetaNombre.setText("Nombre");

        etiquetaApellido.setText("Apellido");

        etiquetaMates.setText("Mates");

        etiquetaEDFisica.setText("ED. Fisica");

        cajaCatalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCatalanActionPerformed(evt);
            }
        });

        etiquetaCatalan.setText("Catalan");

        etiquetaMedia.setText("Nota media");

        botonInicio.setText("Inicio");

        botonAnterior.setText("Anterior");

        botonSiguiente.setText("Siguiente");

        botonFinal.setText("Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaMedia)
                                    .addComponent(etiquetaMates)
                                    .addComponent(etiquetaEDFisica)
                                    .addComponent(etiquetaCatalan))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cajaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cajaMates, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(cajaCatalan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaEDFisica, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaApellido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(cajaNombre))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonInicio)
                        .addGap(181, 181, 181)
                        .addComponent(botonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(botonSiguiente)
                        .addGap(162, 162, 162)
                        .addComponent(botonFinal)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaMates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMates))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaEDFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEDFisica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCatalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCatalan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMedia)
                    .addComponent(cajaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInicio)
                    .addComponent(botonAnterior)
                    .addComponent(botonSiguiente)
                    .addComponent(botonFinal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaCatalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCatalanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCatalanActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public void initPintar(){
    Alumnos alu = new Alumnos("Pepe", "Perez", 9, 5, 3 );
    this.cajaNombre.setText(alu.getNombre());
    this.cajaApellido.setText(alu.getApellido());
    this.cajaMates.setText(String.valueOf(alu.getMates())); //como la nota es un float tengo que convertirla a string, para eso uso string.valueof()
    this.cajaEDFisica.setText(String.valueOf(alu.getEdfisica()));
    this.cajaCatalan.setText(String.valueOf(alu.getCatalan()));
    float resultado = alu.notamedia(alu.getMates(), alu.getEdfisica(), alu.getCatalan());
    this.cajaMedia.setText(String.valueOf(resultado));
    }
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
            java.util.logging.Logger.getLogger(VistaColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaColegio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonFinal;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCatalan;
    private javax.swing.JTextField cajaEDFisica;
    private javax.swing.JTextField cajaMates;
    private javax.swing.JTextField cajaMedia;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCatalan;
    private javax.swing.JLabel etiquetaEDFisica;
    private javax.swing.JLabel etiquetaMates;
    private javax.swing.JLabel etiquetaMedia;
    private javax.swing.JLabel etiquetaNombre;
    // End of variables declaration//GEN-END:variables
}