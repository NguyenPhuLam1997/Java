
import java.awt.Component;
import java.awt.Frame;
import static java.lang.Math.E;
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
public class Bai70 extends javax.swing.JFrame {

    private Component Frame;

    /**
     * Creates new form Bai70
     */
    public Bai70() {
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

        lbA = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        lbB = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bnTinhTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbA.setBackground(new java.awt.Color(0, 204, 204));
        lbA.setText("Số Lượng");
        getContentPane().add(lbA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtSoLuong.setToolTipText("Nhap So A!");
        getContentPane().add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, -1));
        getContentPane().add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 60, 20));

        lbB.setBackground(new java.awt.Color(0, 204, 204));
        lbB.setText("Đơn Giá");
        getContentPane().add(lbB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtThanhTien.setEditable(false);
        getContentPane().add(txtThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Thành Tiền");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        bnTinhTien.setText("Tính Tiền");
        bnTinhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTinhTienActionPerformed(evt);
            }
        });
        getContentPane().add(bnTinhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnTinhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTinhTienActionPerformed
        double a = 0,b = 0,c;
        String sa = txtSoLuong.getText();
        try
        {
            a=Double.parseDouble(sa);
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập số");
        }
        String sb = txtDonGia.getText();
        try
        {
            b=Double.parseDouble(sb);
        }
        catch(Exception ex)
        {
            JOptionPane.showConfirmDialog(null, "Vui lòng nhập số");
        }
        c=a*b;
        txtThanhTien.setText(String.valueOf(c));
    }//GEN-LAST:event_bnTinhTienActionPerformed

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
            java.util.logging.Logger.getLogger(Bai70.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai70.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai70.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai70.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai70().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnTinhTien;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
