/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith4;

import com.sun.imageio.plugins.png.RowFilter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author admin
 */
public class BaiTH4 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTH4
     */
    public BaiTH4() {
        initComponents();
    }
    ArrayList<SinhVien> sv = new ArrayList();
    
    DefaultTableModel model = new DefaultTableModel(); 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        txtNS = new javax.swing.JTextField();
        txtMSSV = new javax.swing.JTextField();
        cbLop = new javax.swing.JComboBox<>();
        bnXoa = new javax.swing.JButton();
        bnSUa = new javax.swing.JButton();
        bnTimKiem = new javax.swing.JButton();
        bnThem = new javax.swing.JButton();
        bnThemLop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lý Lịch Sinh Viên");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao Tác"));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Họ Tên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setText("Năm Sinh");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Lớp");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel4.setText("MSSV");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(txtHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, -1));
        jPanel1.add(txtNS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 110, -1));
        jPanel1.add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, -1));

        cbLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "57TH1", "57TH2", "58TH1", "58TH2" }));
        jPanel1.add(cbLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, -1));

        bnXoa.setText("Xóa");
        bnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(bnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        bnSUa.setText("Sửa");
        bnSUa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSUaActionPerformed(evt);
            }
        });
        jPanel1.add(bnSUa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        bnTimKiem.setText("Tìm Kiếm");
        bnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(bnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        bnThem.setText("Thêm");
        bnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThemActionPerformed(evt);
            }
        });
        jPanel1.add(bnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        bnThemLop.setText("...");
        bnThemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnThemLopActionPerformed(evt);
            }
        });
        jPanel1.add(bnThemLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 180));

        tbDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ và Tên", "Năm Sinh", "Lớp"
            }
        ));
        tbDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 400, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThemActionPerformed
        TableModel mData = tbDS.getModel();
        
        String MSSV = txtMSSV.getText();
        String HoTen = txtHT.getText();
        String NamSinh = txtNS.getText();
        String Lop = cbLop.getSelectedItem().toString();
        SinhVien a = new SinhVien();
        a.setHoTen(HoTen);
        a.setMSVV(MSSV);
        a.setNamSinh(NamSinh);
        a.setLop(Lop);
        sv.add(a);
        
        
        int socot = mData.getColumnCount();
        model.setColumnCount(socot);
        Vector<String> name = new Vector<>();
        name.add("MSSV");
        name.add("Họ và Tên");
        name.add("Năm Sinh");
        name.add("Lớp");
        model.setColumnIdentifiers(name);       
        
        
        //for(int i=0;i<sv.size();i++)
        //{
          //  SinhVien x = sv.get(i);
            Vector<String> hang = new Vector<>();
            hang.add(a.getMSVV());
            hang.add(a.getHoTen());
            hang.add(a.getNamSinh());
            hang.add(a.getLop());
            model.addRow(hang);
        //}
        
        tbDS.setModel(model);
        
    }//GEN-LAST:event_bnThemActionPerformed

    private void bnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXoaActionPerformed

    int n = tbDS.getSelectedRow();
    int c = n+1;
    if(n>0)
    {
        int a = JOptionPane.showConfirmDialog(null, "Bạn Chắc Chắn Muốn Xóa SV Này" + c, "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        if (a == 0)
        {
            model.removeRow(n);
            sv.remove(n);
            tbDS.setModel(model);
        }
    }
    else
    {
        JOptionPane.showConfirmDialog(null, "Bạn Chưa Chọn Dòng!");
    }
    }//GEN-LAST:event_bnXoaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void tbDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSMouseClicked
        TableModel mData = tbDS.getModel();
        //Lấy dòng đc chọn
        int chon = tbDS.getSelectedRow();
        txtMSSV.setText( mData.getValueAt(chon, 0).toString());
        txtHT.setText( mData.getValueAt(chon, 1).toString());
        txtNS.setText( mData.getValueAt(chon, 2).toString());
        cbLop.setSelectedItem(chon);
    }//GEN-LAST:event_tbDSMouseClicked

    private void bnSUaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSUaActionPerformed
        if(tbDS.getSelectedRow()==-1)
        {
            if(tbDS.getRowCount()==0)
            {
                JOptionPane.showConfirmDialog(null, "Bảng trống!");
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "Vui lòng chọn hàng cần sửa!");
            }
        }
        else
        {
            model.setValueAt(txtMSSV.getText(), tbDS.getSelectedRow(), 0);
            model.setValueAt(txtHT.getText(), tbDS.getSelectedRow(), 1);
            model.setValueAt(txtNS.getText(), tbDS.getSelectedRow(), 2);
            model.setValueAt(cbLop.getSelectedItem().toString(), tbDS.getSelectedRow(), 3);
        }
        
    }//GEN-LAST:event_bnSUaActionPerformed

    private void bnThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnThemLopActionPerformed
        String Them = JOptionPane.showInputDialog("Thêm lớp bạn cần");
        cbLop.addItem(Them); 
    }//GEN-LAST:event_bnThemLopActionPerformed

    private void bnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTimKiemActionPerformed
        
        
    }//GEN-LAST:event_bnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTH4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTH4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTH4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTH4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTH4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnSUa;
    private javax.swing.JButton bnThem;
    private javax.swing.JButton bnThemLop;
    private javax.swing.JButton bnTimKiem;
    private javax.swing.JButton bnXoa;
    private javax.swing.JComboBox<String> cbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDS;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNS;
    // End of variables declaration//GEN-END:variables
}
