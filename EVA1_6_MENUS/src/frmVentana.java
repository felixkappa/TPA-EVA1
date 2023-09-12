
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author FelixFinix
 */
public class frmVentana extends javax.swing.JFrame 
implements ActionListener{


    public frmVentana() {
        initComponents();
        
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( e.getSource() == itmOpcionUno){
                    System.out.println("Evento Action Listener");
                }
                else if (e.getSource() == itmSalir){
                    System.exit(0);
                }
                else{
                    System.out.println("funcionan igual");
                }
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        
        itmOpcionUno.addActionListener(listener);
        itmOpcionDos.addActionListener(listener);
        itmSalir.addActionListener(listener);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        tabArchivo = new javax.swing.JMenu();
        itmOpcionUno = new javax.swing.JMenuItem();
        itmOpcionDos = new javax.swing.JMenuItem();
        itmOpcionTres = new javax.swing.JMenuItem();
        tabOtrasOpciones = new javax.swing.JMenu();
        itmOtraOpcionUno = new javax.swing.JMenuItem();
        itmOtraOpcionDos = new javax.swing.JMenuItem();
        itmSalir = new javax.swing.JMenuItem();
        tabEdit = new javax.swing.JMenu();
        itmEditarUno = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabArchivo.setBackground(new java.awt.Color(255, 51, 255));
        tabArchivo.setText("Archivo");

        itmOpcionUno.setBackground(new java.awt.Color(255, 51, 255));
        itmOpcionUno.setText("Opción 1");
        tabArchivo.add(itmOpcionUno);

        itmOpcionDos.setBackground(new java.awt.Color(255, 51, 255));
        itmOpcionDos.setText("Opción 2");
        tabArchivo.add(itmOpcionDos);

        itmOpcionTres.setBackground(new java.awt.Color(255, 51, 255));
        itmOpcionTres.setText("Opción 3");
        tabArchivo.add(itmOpcionTres);

        tabOtrasOpciones.setBackground(new java.awt.Color(255, 51, 255));
        tabOtrasOpciones.setText("Otras Opciones");

        itmOtraOpcionUno.setBackground(new java.awt.Color(255, 51, 255));
        itmOtraOpcionUno.setText("Otra Opción ");
        tabOtrasOpciones.add(itmOtraOpcionUno);

        itmOtraOpcionDos.setBackground(new java.awt.Color(255, 51, 255));
        itmOtraOpcionDos.setText("Otra Opción 2");
        tabOtrasOpciones.add(itmOtraOpcionDos);

        tabArchivo.add(tabOtrasOpciones);

        itmSalir.setBackground(new java.awt.Color(255, 51, 255));
        itmSalir.setText("Salir");
        tabArchivo.add(itmSalir);

        jMenuBar1.add(tabArchivo);

        tabEdit.setBackground(new java.awt.Color(255, 102, 255));
        tabEdit.setText("Edit");

        itmEditarUno.setBackground(new java.awt.Color(255, 51, 255));
        itmEditarUno.setText("Editar 1");
        tabEdit.add(itmEditarUno);

        jMenuItem7.setBackground(new java.awt.Color(255, 0, 255));
        jMenuItem7.setText("Editar 2");
        tabEdit.add(jMenuItem7);

        jMenuBar1.add(tabEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmEditarUno;
    private javax.swing.JMenuItem itmOpcionDos;
    private javax.swing.JMenuItem itmOpcionTres;
    private javax.swing.JMenuItem itmOpcionUno;
    private javax.swing.JMenuItem itmOtraOpcionDos;
    private javax.swing.JMenuItem itmOtraOpcionUno;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenu tabArchivo;
    private javax.swing.JMenu tabEdit;
    private javax.swing.JMenu tabOtrasOpciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
