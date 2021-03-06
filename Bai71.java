
import static java.lang.Math.PI;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Bai71 extends javax.swing.JFrame {

    /**
     * Creates new form Bai71
     */
    public Bai71() {
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

        bnTinh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBK = new javax.swing.JTextField();
        txtCV = new javax.swing.JTextField();
        txtDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnTinh.setText("Tính");
        bnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTinhActionPerformed(evt);
            }
        });
        getContentPane().add(bnTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel1.setText("Tính Chu Vi và Diện Tích Hình Tròn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Chu Vi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setText("Diên Tích");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(txtBK, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 90, 150, -1));

        txtCV.setEditable(false);
        getContentPane().add(txtCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 130, 150, -1));

        txtDT.setEditable(false);
        getContentPane().add(txtDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 170, 150, -1));

        jLabel4.setText("Bán Kính");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTinhActionPerformed
        double b=0,c;
        String sb = txtBK.getText();
        try
        {
            b=Double.parseDouble(sb);
        }
        catch(Exception ex)
        {
          JOptionPane.showConfirmDialog(null, "Vui lòng nhập số!");
        }
        txtDT.setText(String.valueOf(b*b*PI));
        txtCV.setText(String.valueOf(PI*2*b));
    }//GEN-LAST:event_bnTinhActionPerformed

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
            java.util.logging.Logger.getLogger(Bai71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai71().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBK;
    private javax.swing.JTextField txtCV;
    private javax.swing.JTextField txtDT;
    // End of variables declaration//GEN-END:variables
}
