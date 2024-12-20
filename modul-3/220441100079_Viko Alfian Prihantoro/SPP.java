/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package module.pkg3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZAN
 */
public class SPP extends javax.swing.JFrame {

    /**
     * Creates new form SPP
     */
    public SPP() {
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

        TOP = new javax.swing.JPanel();
        lPayicon = new javax.swing.JLabel();
        lTitle = new javax.swing.JLabel();
        lSchoolicon = new javax.swing.JLabel();
        FORM = new javax.swing.JPanel();
        lName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lFee = new javax.swing.JLabel();
        tfFee = new javax.swing.JTextField();
        MONTH = new javax.swing.JPanel();
        lMonth = new javax.swing.JLabel();
        chbJan = new javax.swing.JCheckBox();
        chbJune = new javax.swing.JCheckBox();
        chbFeb = new javax.swing.JCheckBox();
        chbJuly = new javax.swing.JCheckBox();
        chbMarch = new javax.swing.JCheckBox();
        chbAug = new javax.swing.JCheckBox();
        chbApr = new javax.swing.JCheckBox();
        chbSep = new javax.swing.JCheckBox();
        chbMay = new javax.swing.JCheckBox();
        chbOct = new javax.swing.JCheckBox();
        chbNov = new javax.swing.JCheckBox();
        chbDec = new javax.swing.JCheckBox();
        btnCheck = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearm = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lTotal = new javax.swing.JLabel();
        tfTuition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDebt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TOP.setBackground(new java.awt.Color(204, 204, 204));
        TOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 6));
        TOP.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));
        TOP.add(lPayicon);

        lTitle.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        lTitle.setText("Pembayaran SPP Sekolah YGY");
        TOP.add(lTitle);
        TOP.add(lSchoolicon);

        getContentPane().add(TOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        FORM.setBackground(new java.awt.Color(102, 102, 102));
        FORM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        FORM.setLayout(new java.awt.GridLayout(2, 2));

        lName.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("NAME              =");
        FORM.add(lName);
        FORM.add(tfName);

        lFee.setFont(new java.awt.Font("Ravie", 1, 14)); // NOI18N
        lFee.setForeground(new java.awt.Color(255, 255, 255));
        lFee.setText("Pembayaran =");
        lFee.setToolTipText("");
        FORM.add(lFee);

        tfFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFeeActionPerformed(evt);
            }
        });
        FORM.add(tfFee);

        getContentPane().add(FORM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 850, 80));

        MONTH.setBackground(new java.awt.Color(51, 51, 51));
        MONTH.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));

        lMonth.setFont(new java.awt.Font("Regave DemiBold", 1, 14)); // NOI18N
        lMonth.setForeground(new java.awt.Color(255, 255, 255));
        lMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMonth.setText("MONTHS");

        chbJan.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbJan.setForeground(new java.awt.Color(255, 255, 255));
        chbJan.setText("JANUARY");

        chbJune.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbJune.setForeground(new java.awt.Color(255, 255, 255));
        chbJune.setText("JUNE");

        chbFeb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbFeb.setForeground(new java.awt.Color(255, 255, 255));
        chbFeb.setText("FEBRUARY");

        chbJuly.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbJuly.setForeground(new java.awt.Color(255, 255, 255));
        chbJuly.setText("JULY");

        chbMarch.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbMarch.setForeground(new java.awt.Color(255, 255, 255));
        chbMarch.setText("MARCH");

        chbAug.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbAug.setForeground(new java.awt.Color(255, 255, 255));
        chbAug.setText("AUGUST");

        chbApr.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbApr.setForeground(new java.awt.Color(255, 255, 255));
        chbApr.setText("APRIL");

        chbSep.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbSep.setForeground(new java.awt.Color(255, 255, 255));
        chbSep.setText("SEPTEMBER");

        chbMay.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbMay.setForeground(new java.awt.Color(255, 255, 255));
        chbMay.setText("MAY");

        chbOct.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbOct.setForeground(new java.awt.Color(255, 255, 255));
        chbOct.setText("OCTOBER");

        chbNov.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbNov.setForeground(new java.awt.Color(255, 255, 255));
        chbNov.setText("NOVEMBER");

        chbDec.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        chbDec.setForeground(new java.awt.Color(255, 255, 255));
        chbDec.setText("DECEMBER");

        btnCheck.setText("CHECK DEBTS");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnCount.setText("SAVE");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR ALL");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearm.setText("CLEAR MONTH");
        btnClearm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearmActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        lTotal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lTotal.setText("TUITION FEE  TOTAL  =");
        jPanel1.add(lTotal, java.awt.BorderLayout.CENTER);

        tfTuition.setEditable(false);
        tfTuition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTuitionActionPerformed(evt);
            }
        });
        jPanel1.add(tfTuition, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout MONTHLayout = new javax.swing.GroupLayout(MONTH);
        MONTH.setLayout(MONTHLayout);
        MONTHLayout.setHorizontalGroup(
            MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MONTHLayout.createSequentialGroup()
                .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MONTHLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(lMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MONTHLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClearm, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbJan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbJune, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbFeb)
                            .addComponent(chbJuly, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbNov))
                        .addGap(12, 12, 12)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbMarch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbAug, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chbApr, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbSep)
                            .addComponent(chbDec, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(chbMay, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chbOct, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MONTHLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        MONTHLayout.setVerticalGroup(
            MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MONTHLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MONTHLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addComponent(chbJan)
                                .addGap(15, 15, 15)
                                .addComponent(chbJune))
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addComponent(chbFeb)
                                .addGap(15, 15, 15)
                                .addComponent(chbJuly)
                                .addGap(12, 12, 12)
                                .addComponent(chbNov))
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addComponent(chbMarch)
                                .addGap(15, 15, 15)
                                .addComponent(chbAug))
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addComponent(chbApr)
                                .addGap(15, 15, 15)
                                .addComponent(chbSep)
                                .addGap(12, 12, 12)
                                .addComponent(chbDec))
                            .addGroup(MONTHLayout.createSequentialGroup()
                                .addComponent(chbMay)
                                .addGap(15, 15, 15)
                                .addComponent(chbOct))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MONTHLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MONTHLayout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClearm, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(MONTHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MONTHLayout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(MONTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 850, 260));

        tDebt.setBackground(new java.awt.Color(204, 204, 204));
        tDebt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Fee", "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEP", "OCT", "NOV", "DES", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tDebt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 850, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
    if (tfName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fill in name field", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (!chbJan.isSelected() && !chbFeb.isSelected() && !chbMarch.isSelected() && !chbApr.isSelected() && 
        !chbMay.isSelected() && !chbJune.isSelected() && !chbJuly.isSelected() && !chbAug.isSelected() && 
        !chbSep.isSelected() && !chbOct.isSelected() && !chbNov.isSelected() && !chbDec.isSelected()) {
        JOptionPane.showMessageDialog(this, "Choose minimal a month", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (tfFee.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fill in the price first", "DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try {
        DefaultTableModel model = (DefaultTableModel) tDebt.getModel();
        String Name = tfName.getText();
        String Stat = "UNPAID"; 
        int Fee = Integer.parseInt(tfFee.getText());
        
        int Months = 0;

        if (chbJan.isSelected()) Months++;
        if (chbFeb.isSelected()) Months++;
        if (chbMarch.isSelected()) Months++;
        if (chbApr.isSelected()) Months++;
        if (chbMay.isSelected()) Months++;
        if (chbJune.isSelected()) Months++;
        if (chbJuly.isSelected()) Months++;
        if (chbAug.isSelected()) Months++;
        if (chbSep.isSelected()) Months++;
        if (chbOct.isSelected()) Months++;
        if (chbNov.isSelected()) Months++;
        if (chbDec.isSelected()) Months++;

        if (Months == 12) {
            Stat = "PAID";
        }

        int Debt = Fee * (12 - Months);
        
        Object[] rowData = new Object[15];
        rowData[0] = Name;
        rowData[1] = Debt;
        rowData[2] = chbJan.isSelected();
        rowData[3] = chbFeb.isSelected();
        rowData[4] = chbMarch.isSelected();
        rowData[5] = chbApr.isSelected();
        rowData[6] = chbMay.isSelected();
        rowData[7] = chbJune.isSelected();
        rowData[8] = chbJuly.isSelected();
        rowData[9] = chbAug.isSelected();
        rowData[10] = chbSep.isSelected();
        rowData[11] = chbOct.isSelected();
        rowData[12] = chbNov.isSelected();
        rowData[13] = chbDec.isSelected();
        rowData[14] = Stat;
        
        model.addRow(rowData);
        
        JOptionPane.showMessageDialog(this, "Data successfully added", "SUCCEED", JOptionPane.INFORMATION_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "UR FORMAT IS INVALID", "ERROR !!!", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCountActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        int tFee = Integer.parseInt(tfFee.getText());
        int debts = 0;

        if (!chbJan.isSelected()) {
            debts++;
        }
        if (!chbFeb.isSelected()){
            debts++;
        }
        if (!chbMarch.isSelected()){
            debts++;
        }
        if (!chbApr.isSelected()){
            debts++;
        }
        if (!chbMay.isSelected()){
            debts++;
        }
        if (!chbJune.isSelected()){
            debts++;
        }
        if (!chbJuly.isSelected()){
            debts++;
        }
        if (!chbAug.isSelected()){
            debts++;
        }
        if (!chbSep.isSelected()){
            debts++;
        }
        if (!chbOct.isSelected()){
            debts++;
        }
        if (!chbNov.isSelected()){
            debts++;
        }
        if (!chbDec.isSelected()){
            debts++;
        }

        tfTuition.setText(String.valueOf(tFee * debts));
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnClearmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearmActionPerformed
        chbJan.setSelected(false);
        chbFeb.setSelected(false);
        chbMarch.setSelected(false);
        chbApr.setSelected(false);
        chbMay.setSelected(false);
        chbJune.setSelected(false);
        chbJuly.setSelected(false);
        chbAug.setSelected(false);
        chbSep.setSelected(false);
        chbOct.setSelected(false);
        chbNov.setSelected(false);
        chbDec.setSelected(false);
    }//GEN-LAST:event_btnClearmActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfName.setText("");
        tfTuition.setText("");
        tfFee.setText("");
        chbJan.setSelected(false);
        chbFeb.setSelected(false);
        chbMarch.setSelected(false);
        chbApr.setSelected(false);
        chbMay.setSelected(false);
        chbJune.setSelected(false);
        chbJuly.setSelected(false);
        chbAug.setSelected(false);
        chbSep.setSelected(false);
        chbOct.setSelected(false);
        chbNov.setSelected(false);
        chbDec.setSelected(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void tfTuitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTuitionActionPerformed

    }//GEN-LAST:event_tfTuitionActionPerformed

    private void tfFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFeeActionPerformed

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
            java.util.logging.Logger.getLogger(SPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FORM;
    private javax.swing.JPanel MONTH;
    private javax.swing.JPanel TOP;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearm;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox chbApr;
    private javax.swing.JCheckBox chbAug;
    private javax.swing.JCheckBox chbDec;
    private javax.swing.JCheckBox chbFeb;
    private javax.swing.JCheckBox chbJan;
    private javax.swing.JCheckBox chbJuly;
    private javax.swing.JCheckBox chbJune;
    private javax.swing.JCheckBox chbMarch;
    private javax.swing.JCheckBox chbMay;
    private javax.swing.JCheckBox chbNov;
    private javax.swing.JCheckBox chbOct;
    private javax.swing.JCheckBox chbSep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lFee;
    private javax.swing.JLabel lMonth;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPayicon;
    private javax.swing.JLabel lSchoolicon;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lTotal;
    private javax.swing.JTable tDebt;
    private javax.swing.JTextField tfFee;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTuition;
    // End of variables declaration//GEN-END:variables
}
