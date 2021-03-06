/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.XuLy;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class HoaDonForm extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonForm
     */
    public HoaDonForm() {
        initComponents();
        tbHD.setModel(XuLy.HoaDonModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnXoa = new javax.swing.JButton();
        txtTT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMKH = new javax.swing.JTextField();
        txtMNV = new javax.swing.JTextField();
        bnThoat = new javax.swing.JButton();
        bnSua = new javax.swing.JButton();
        bnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMHD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHD = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNLHD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnXoa.setText("Xóa");
        bnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(bnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));
        getContentPane().add(txtTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 70, -1));

        jLabel1.setText("Mã HD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setText("Mã KH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Tổng Tiền");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        getContentPane().add(txtMKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 70, -1));
        getContentPane().add(txtMNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, -1));

        bnThoat.setText("Thoát");
        bnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(bnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        bnSua.setText("Sửa");
        bnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(bnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        bnThem.setText("Thêm");
        bnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThemActionPerformed(evt);
            }
        });
        getContentPane().add(bnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel4.setText("Mã NV");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(txtMHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        tbHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbHD);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 400, 90));

        jLabel5.setText("Ngày Lập HD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, -1));
        getContentPane().add(txtNLHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXoaActionPerformed
        int n = tbHD.getSelectedRow();
        String MaHD = XuLy.HoaDonModel().getValueAt(n+1,0).toString();
        int thucThi = XuLy.DeleteHoaDon(MaHD);
        if(thucThi == 0){
            JOptionPane.showMessageDialog(rootPane, "Xóa bị lỗi","Lỗi:",JOptionPane.ERROR_MESSAGE);
        }
        tbHD.setModel(XuLy.HoaDonModel());
    }//GEN-LAST:event_bnXoaActionPerformed

    private void bnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnThoatActionPerformed

    private void bnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSuaActionPerformed
        XuLy.UpdateHoaDon(String.valueOf(txtMHD.getText()),String.valueOf(txtMKH.getText()),String.valueOf(txtMNV.getText()),String.valueOf(txtTT.getText()));
        tbHD.setModel(XuLy.HoaDonModel());
        // TODO add your handling code here:
    }//GEN-LAST:event_bnSuaActionPerformed

    private void bnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThemActionPerformed
        // TODO add your handling code h
        XuLy.InsertHoaDon(String.valueOf(txtMHD.getText()),String.valueOf(txtMKH.getText()),String.valueOf(txtMNV.getText()),String.valueOf(txtTT.getText()));
        tbHD.setModel(XuLy.HoaDonModel());
    }//GEN-LAST:event_bnThemActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnSua;
    private javax.swing.JButton bnThem;
    private javax.swing.JButton bnThoat;
    private javax.swing.JButton bnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHD;
    private javax.swing.JTextField txtMHD;
    private javax.swing.JTextField txtMKH;
    private javax.swing.JTextField txtMNV;
    private javax.swing.JTextField txtNLHD;
    private javax.swing.JTextField txtTT;
    // End of variables declaration//GEN-END:variables
}
