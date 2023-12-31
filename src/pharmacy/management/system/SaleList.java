/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy.management.system;

/**
 *
 * @author mbish
 */
public class SaleList extends javax.swing.JFrame {

    /**
     * Creates new form SaleList
     */
    public SaleList() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sale List");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 17, 110, -1));

        jLabel2.setText("From");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 73, -1, 22));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 73, 134, -1));

        jLabel3.setText("To");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 79, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 73, 139, -1));

        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 110, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 107, 134, -1));

        jButton1.setText("Transfer-1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        jButton2.setText("Transfer-2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, -1, -1));

        jButton3.setText("Transfer-3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, -1));

        jCheckBox1.setText("Select");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 75, 85, -1));

        jCheckBox2.setText("Select All");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 108, 85, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl No.", "Type", "Username", "MRP", "Net Amount", "User Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 175, 1280, 460));

        jLabel5.setText("Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 144, 37, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Cash", "Credit" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 141, 134, -1));

        jLabel34.setText("CGST");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, -1, 30));
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 660, -1, -1));

        jLabel35.setText("SGST");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 690, -1, 30));
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, -1, -1));

        jLabel36.setText("CGST");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, -1, 30));
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 660, -1, -1));

        jLabel37.setText("IGST");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 720, 30, 30));
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 720, -1, -1));

        jLabel32.setText("Amount :");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 660, 70, 20));
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 660, -1, -1));

        jLabel38.setText("Amount :");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 690, 70, 20));
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 690, -1, -1));

        jLabel39.setText("Amount :");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 720, 70, 20));
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 720, -1, -1));

        jLabel6.setText("Taxable Amount");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 680, -1, -1));

        jLabel7.setText("Non-taxable Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 142, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 139, -1));

        jLabel8.setText("Total MRP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 60, 20));

        jLabel9.setText("Net Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, 130, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 130, -1));

        jLabel10.setText("Total Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, -1, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 720, 130, -1));

        jButton4.setText("PDF");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, -1, -1));

        jButton5.setText("Excel");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, -1, -1));

        jButton6.setText("Print");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, -1, -1));

        jButton7.setText("Transfer");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 710, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jCheckBox3.setText("Report All");
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(SaleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
