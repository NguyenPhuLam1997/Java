
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class demoTable extends javax.swing.JFrame {

    /**
     * Creates new form demoTable
     */
    public demoTable() {
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

        bnEdit = new javax.swing.JButton();
        bnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLN = new javax.swing.JTextField();
        bnRemove1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnEdit.setText("Edit");
        bnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEditActionPerformed(evt);
            }
        });
        getContentPane().add(bnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        bnAdd.setText("add");
        bnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddActionPerformed(evt);
            }
        });
        getContentPane().add(bnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel1.setText("Frist Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        getContentPane().add(txtFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, -1));

        jLabel2.setText("Year");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        getContentPane().add(txtY, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 90, -1));

        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        getContentPane().add(txtLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, -1));

        bnRemove1.setText("remove");
        bnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRemove1ActionPerformed(evt);
            }
        });
        getContentPane().add(bnRemove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        tbDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"123", "123", "123"}
            },
            new String [] {
                "FristName", "LastName", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditActionPerformed
        // TODO add your handling code here:
        //1.Lấy về Model
        TableModel mData = tbDS.getModel();
        // lấy dòng đc chọn
        int chonSua = tbDS.getSelectedRow();
        // cập nhật FirstName
        mData.setValueAt(txtFN.getText(),
                         chonSua, 0);
        //cập nhật LastName
        mData.setValueAt(txtLN.getText(),
                         chonSua, 1);
        //cập nhật Years
        mData.setValueAt(txtY.getText(),
                         chonSua, 2);


    }//GEN-LAST:event_bnEditActionPerformed

    private void bnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddActionPerformed
    //1. lây v? model
         TableModel mData = tbDS.getModel();
         //2. chuy?n sang ki?u vector cho d? thao tác
         Vector<Vector<String>> Data = new Vector<>();
         //ð?i t? mData sang Data
         int sohang = mData.getRowCount();
         int socot = mData.getColumnCount();
         int j=0;
         for (int i = 0;i<sohang;i++)
        {
             Vector<String> hang = new Vector<>();
             for (j=0; j<socot;j++){
                if(mData.getValueAt(i, j) != null)
                { 
                    hang.add(mData.getValueAt(i,j).toString());
                }
             }
             Data.add(hang);
         }
         
         //hang moi
         Vector<String> hangmoi = new Vector<>();
         hangmoi.add(txtFN.getText() );
         hangmoi.add(txtLN.getText() );
         hangmoi.add(txtY.getText() );
         //thêm vào danh sách hàng
         Data.add(hangmoi);
         
         
         //3. c?p nh?t l?i Jtable
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(socot);
        Vector<String> name = new Vector<>();
        name.add("FirstName");
        name.add("LastNAme");
        name.add("Years");
        model.setColumnIdentifiers(name);
        //tính toán model
        for(int i=0;i<Data.size();i++)
        {
            Vector<String> rowdata = Data.get(i);
           model.addRow(rowdata); 
        }
        tbDS.setModel(model);
        
    }//GEN-LAST:event_bnAddActionPerformed

    private void bnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRemove1ActionPerformed
        //1. l?y model
        TableModel mData = tbDS.getModel();
        //2. ép sang ki?u default
        DefaultTableModel bang = new DefaultTableModel();
        //tính s? c?t, s? hàng
        int socot = mData.getColumnCount();
        int sohang = mData.getRowCount();
        bang.setColumnCount(mData.getColumnCount());
        //ð?i d? li?u table model snag dèautl
        for (int i=0;i<sohang;i++)
        {
            Vector<String> hang = new Vector<>();
            for(int j=0;j<socot;j++)
                hang.add(mData.getValueAt(i,j).toString());
            bang.addRow(hang);
        }
        //x? lí
        //l?y hàng ch?nn
        int h = tbDS.getSelectedRow();
        // xóa kh?i model
        bang.removeRow(h);
        //c?p nh?t
        tbDS.setModel(bang);                
        
    }//GEN-LAST:event_bnRemove1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //1.Lấy về model
        TableModel mData = tbDS.getModel();
        //Lấy dòng đc chọn
        int chon = tbDS.getSelectedRow();
        txtFN.setText( mData.getValueAt(chon, 0).toString());
        txtLN.setText( mData.getValueAt(chon, 1).toString());
        txtY.setText( mData.getValueAt(chon, 2).toString());
        
        
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(demoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demoTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAdd;
    private javax.swing.JButton bnEdit;
    private javax.swing.JButton bnRemove1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDS;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextField txtY;
    // End of variables declaration//GEN-END:variables
}