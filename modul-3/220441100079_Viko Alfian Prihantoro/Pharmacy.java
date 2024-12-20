
package module.pkg3;

import javax.swing.JOptionPane;

public class Pharmacy extends javax.swing.JFrame {

    public Pharmacy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TOP = new javax.swing.JPanel();
        lPharm1 = new javax.swing.JLabel();
        lTitle = new javax.swing.JLabel();
        lPharm2 = new javax.swing.JLabel();
        DRUGS = new javax.swing.JPanel();
        chbAlpra = new javax.swing.JCheckBox();
        chbLora = new javax.swing.JCheckBox();
        chbFluo = new javax.swing.JCheckBox();
        chbMela = new javax.swing.JCheckBox();
        chbSert = new javax.swing.JCheckBox();
        chbDesv = new javax.swing.JCheckBox();
        chbAmit = new javax.swing.JCheckBox();
        chbFluv = new javax.swing.JCheckBox();
        chbParo = new javax.swing.JCheckBox();
        chbMit = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        COUNT = new javax.swing.JPanel();
        lInvoice = new javax.swing.JLabel();
        tfInvoice = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        FORM = new javax.swing.JPanel();
        lName = new javax.swing.JLabel();
        lSymtomps = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        cmbSymtomps = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TOP.setBackground(new java.awt.Color(0, 153, 153));
        TOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        TOP.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));
        TOP.add(lPharm1);

        lTitle.setFont(new java.awt.Font("Edwardian Script ITC", 3, 36)); // NOI18N
        lTitle.setForeground(new java.awt.Color(255, 255, 255));
        lTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitle.setText("VILLAGE'S   APOTHECA   ");
        TOP.add(lTitle);
        TOP.add(lPharm2);

        DRUGS.setBackground(new java.awt.Color(255, 255, 255));
        DRUGS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        DRUGS.setLayout(new java.awt.GridLayout(2, 10, 5, 3));

        chbAlpra.setBackground(new java.awt.Color(153, 153, 153));
        chbAlpra.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbAlpra.setText("Alprazolam");
        chbAlpra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbAlpra.setFocusable(false);
        chbAlpra.setOpaque(true);
        chbAlpra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAlpraActionPerformed(evt);
            }
        });
        DRUGS.add(chbAlpra);

        chbLora.setBackground(new java.awt.Color(153, 153, 153));
        chbLora.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbLora.setText("Lorazepam");
        chbLora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbLora.setOpaque(true);
        chbLora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbLoraActionPerformed(evt);
            }
        });
        DRUGS.add(chbLora);

        chbFluo.setBackground(new java.awt.Color(153, 153, 153));
        chbFluo.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbFluo.setText("Fluoxetine");
        chbFluo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbFluo.setOpaque(true);
        chbFluo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbFluoActionPerformed(evt);
            }
        });
        DRUGS.add(chbFluo);

        chbMela.setBackground(new java.awt.Color(153, 153, 153));
        chbMela.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbMela.setText("Melatonin");
        chbMela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbMela.setOpaque(true);
        chbMela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMelaActionPerformed(evt);
            }
        });
        DRUGS.add(chbMela);

        chbSert.setBackground(new java.awt.Color(153, 153, 153));
        chbSert.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbSert.setText("Sertraline");
        chbSert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbSert.setOpaque(true);
        chbSert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSertActionPerformed(evt);
            }
        });
        DRUGS.add(chbSert);

        chbDesv.setBackground(new java.awt.Color(153, 153, 153));
        chbDesv.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbDesv.setText("Desvenlafaxine");
        chbDesv.setOpaque(true);
        chbDesv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDesvActionPerformed(evt);
            }
        });
        DRUGS.add(chbDesv);

        chbAmit.setBackground(new java.awt.Color(153, 153, 153));
        chbAmit.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbAmit.setText("Amitriptyline");
        chbAmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbAmit.setOpaque(true);
        chbAmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAmitActionPerformed(evt);
            }
        });
        DRUGS.add(chbAmit);

        chbFluv.setBackground(new java.awt.Color(153, 153, 153));
        chbFluv.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbFluv.setText("Fluvoxamine");
        chbFluv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbFluv.setOpaque(true);
        chbFluv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbFluvActionPerformed(evt);
            }
        });
        DRUGS.add(chbFluv);

        chbParo.setBackground(new java.awt.Color(153, 153, 153));
        chbParo.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbParo.setText("Paroxetine");
        chbParo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbParo.setOpaque(true);
        chbParo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbParoActionPerformed(evt);
            }
        });
        DRUGS.add(chbParo);

        chbMit.setBackground(new java.awt.Color(153, 153, 153));
        chbMit.setFont(new java.awt.Font("Segoe UI Black", 0, 8)); // NOI18N
        chbMit.setText("Mitrazapine");
        chbMit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbMit.setOpaque(true);
        chbMit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbMitActionPerformed(evt);
            }
        });
        DRUGS.add(chbMit);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images (1).jpeg")); // NOI18N
        DRUGS.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 2.jpeg")); // NOI18N
        DRUGS.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 3.jpeg")); // NOI18N
        DRUGS.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 4.jpeg")); // NOI18N
        DRUGS.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\image.5.png")); // NOI18N
        DRUGS.add(jLabel5);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 6.jpeg")); // NOI18N
        DRUGS.add(jLabel6);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 7.jpeg")); // NOI18N
        DRUGS.add(jLabel7);

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 8.jpeg")); // NOI18N
        DRUGS.add(jLabel8);

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images 9.jpeg")); // NOI18N
        DRUGS.add(jLabel9);

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\DL\\iloveimg-resized\\images10.jpeg")); // NOI18N
        DRUGS.add(jLabel10);

        COUNT.setBackground(new java.awt.Color(204, 204, 204));
        COUNT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        COUNT.setForeground(new java.awt.Color(255, 255, 255));
        COUNT.setPreferredSize(new java.awt.Dimension(812, 270));
        COUNT.setLayout(new java.awt.BorderLayout(0, 5));

        lInvoice.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        lInvoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInvoice.setText("Laporan");
        COUNT.add(lInvoice, java.awt.BorderLayout.PAGE_START);

        tfInvoice.setEditable(false);
        tfInvoice.setCaretColor(tfInvoice.getBackground());
        COUNT.add(tfInvoice, java.awt.BorderLayout.CENTER);

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        COUNT.add(btnClear, java.awt.BorderLayout.LINE_END);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        COUNT.add(btnExit, java.awt.BorderLayout.LINE_START);

        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        COUNT.add(btnPrint, java.awt.BorderLayout.PAGE_END);

        FORM.setBackground(new java.awt.Color(204, 204, 204));
        FORM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));
        FORM.setLayout(new java.awt.GridBagLayout());

        lName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lName.setText("NAME                 =");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 179, 0, 0);
        FORM.add(lName, gridBagConstraints);

        lSymtomps.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lSymtomps.setText("SYMTOMPS        =");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(11, 168, 0, 0);
        FORM.add(lSymtomps, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 257;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 169);
        FORM.add(tfName, gridBagConstraints);

        cmbSymtomps.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cmbSymtomps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-CHOOSE ONE SYMPTOMP-", "Anxiety", "Depression", "ADHD ( Attention Deficit Hyperactivity Disorder )", "OCD ( Obsessive Compulsive Disorder )", "Schizophrenia" }));
        cmbSymtomps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSymtompsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 3, 20);
        FORM.add(cmbSymtomps, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(COUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(DRUGS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TOP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TOP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(DRUGS, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FORM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(COUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbAlpraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAlpraActionPerformed
    String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
    if (chbAlpra.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbAlpra.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbAlpra.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbAlpra.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbAlpra.setSelected(false);
        }else if(chbLora.isSelected()){
        JOptionPane.showMessageDialog(this,"U can only select one medications, either Alprazolam or Lorazepam","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbAlpra.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Alprazolam is consumed for panic attack, stress, anxiety caused by depression, it contains Alganax 0.5mg . Price = Rp. 70.000/Strip(12 Tablets)","ALPRAZOLAM", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbAlpraActionPerformed

    private void chbLoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbLoraActionPerformed
    String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbLora.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbLora.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbLora.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbLora.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbLora.setSelected(false);
        }else if(chbAlpra.isSelected()){
        JOptionPane.showMessageDialog(this,"U can only select one medications, either Alprazolam or Lorazepam","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbLora.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Lorazepam is consumed for insomnia caused by anxiousness,can't be used with another OPIAT medications . Price = Rp. 68.000/Strip(12 Tablets)","LORAZEPAM", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbLoraActionPerformed

    private void chbFluoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbFluoActionPerformed
    String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbFluo.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbFluo.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbFluo.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluo.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluo.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluo.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Fluoxetine is consumed for treating sudden panic and anxiety attack, can be used to increase appetite. Price = Rp. 73.000/Strip(12 Tablets)","FLUOXETINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbFluoActionPerformed

    private void chbMelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMelaActionPerformed
    String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbMela.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbMela.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbMela.setSelected(false);
        }   else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbMela.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Melatonin is consumed to treat sleeping problems caused by stress or anxiousness . Price = Rp. 138.000/Box(30 Tablets)","MELATONIN", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbMelaActionPerformed

    private void chbSertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSertActionPerformed
       String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbSert.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbSert.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbSert.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbSert.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbSert.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbLora.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Sertraline is consumed to treat lack of serotonin in the brain so it can boost ur mood. Price = Rp. 53.000/Strip(10 Tablets)","SERTRALINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbSertActionPerformed

    private void chbDesvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDesvActionPerformed
        String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbDesv.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbDesv.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbDesv.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbDesv.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbDesv.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbDesv.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Desvenlafaxine is consumed to treat lack of norephinephrine so it can boost focus. Price = Rp. 75.000/Strip(10 Tablets)","DESVENLAFAXINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbDesvActionPerformed

    private void chbAmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAmitActionPerformed
        String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbAmit.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbAmit.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbAmit.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbAmit.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbAmit.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Amitripytiline is consumed to treat neuropathic pain caused by mental illnesses. Price = Rp. 30.000/Strip(12 Tablets)","AMITRIPTYLINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbAmitActionPerformed

    private void chbFluvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbFluvActionPerformed
        String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbFluv.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbFluv.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbFluv.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluv.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluv.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbFluv.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Fluvoxamine is mainly consumed to treat OCD, it can make bothersome thoughts supressed nor going away. Price = Rp. 65.000/Strip(10 Tablets)","FLUVOXAMINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbFluvActionPerformed

    private void chbParoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbParoActionPerformed
        String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbParo.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbParo.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Paroxetine, Fluvoxamine, and Sertraline.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbParo.setSelected(false);
        }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"This medication isn't for ADHD,ADHD Medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline ","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbParo.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbParo.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbParo.setSelected(false);
        }else{
            JOptionPane.showMessageDialog(this,"Paroxetine is used to treat lack of serotonin caused by OCD and is to treat major severe mental disorders. Price = Rp. 80.000/Strip(12 Tablets)","PAROXETINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbParoActionPerformed

    private void chbMitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbMitActionPerformed
        String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
        if (chbMit.isSelected()){
        if(Symptomps.equals("-CHOOSE ONE SYMPTOMP-")){
        JOptionPane.showMessageDialog(this,"PLEASE SELECT ANY SYMTOMPS","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbMit.setSelected(false);
        }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this," This Medication isn't for OCD, OCD Medications are Fluoxetine, Fluvoxamine.","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);
        chbMit.setSelected(false);
        }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Depression,Depression Medications are Alprazolam/Lorazepam, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbMit.setSelected(false);
        }else if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Anxiety,Anxiety Medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbMit.setSelected(false);
        }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"This medication isn't for Schizoprenia,Schizoprenia Medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbMit.setSelected(false);
        }else if(chbLora.isSelected()){
        JOptionPane.showMessageDialog(this,"U can only select one medications, either Lorazepam/Mitrazapine","DISCLAIMER !!!", JOptionPane.WARNING_MESSAGE);        
        chbMit.setSelected(false);        
        }else{
            JOptionPane.showMessageDialog(this,"Mirtazapine is consumed for its atypical tetracyclic antidepressant to treat severe mental disorders. Price = Rp. 30.000/Strip(12 Tablets)","MIRTAZAPINE", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_chbMitActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
    double Price = 0;
    String Meds = "";
    String Symptomps = String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
    String Name = tfName.getText();

    if (chbAlpra.isSelected()) {
        Price += 70000;
        Meds += "Alprazolam ";
    }
    if (chbLora.isSelected()) {
        Price += 68000;
        Meds += "Lorazepam ";
    }
    if (chbFluo.isSelected()) {
        Price += 73000;
        Meds += "Fluoxetine ";
    }
    if (chbMela.isSelected()) {
        Price += 138000;
        Meds += "Melatonin ";
    }
    if (chbSert.isSelected()) {
        Price += 53000;
        Meds += "Sertraline ";
    }
    if (chbDesv.isSelected()) {
        Price += 75000;
        Meds += "Desvenlafaxine ";
    }
    if (chbAmit.isSelected()) {
        Price += 30000;
        Meds += "Amitriptyline ";
    }
    if (chbFluv.isSelected()) {
        Price += 65000;
        Meds += "Fluvoxamine ";
    }
    if (chbParo.isSelected()) {
        Price += 80000;
        Meds += "Paroxetine ";
    }
    if (chbMit.isSelected()) {
        Price += 30000;
        Meds += "Mirtazapine ";
    }
    
    if(Symptomps.isEmpty() || Meds.isEmpty() || Name.isEmpty()){
    JOptionPane.showMessageDialog(this,"You haven't chose any medications nor filling the form correctly","WARNING !!!", JOptionPane.WARNING_MESSAGE);
    tfInvoice.setText(null);
    }else{
        tfInvoice.setText("Name = "+ tfName.getText() +" || Symptomps = "+ Symptomps + " || Medication =" + Meds + " ||Total Price : Rp. " + Price);
    }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    chbAlpra.setSelected(false);
    chbAmit.setSelected(false);
    chbDesv.setSelected(false);
    chbFluo.setSelected(false);
    chbFluv.setSelected(false);
    chbLora.setSelected(false);
    chbMela.setSelected(false);
    chbMit.setSelected(false);
    chbParo.setSelected(false);
    chbSert.setSelected(false);
    tfName.setText(null);
    cmbSymtomps.setSelectedIndex(0);
    tfInvoice.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbSymtompsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSymtompsActionPerformed
    String Symptomps =  String.valueOf(Pharmacy.cmbSymtomps.getSelectedItem());
    if(Symptomps.equals("Anxiety")){
        JOptionPane.showMessageDialog(this,"Ur medications are Alprazolam/Lorazepam, Melatonin, Sertraline","DISCLAIMER !!!", JOptionPane.INFORMATION_MESSAGE);
    }else if(Symptomps.equals("Depression")){
        JOptionPane.showMessageDialog(this,"Ur medications are Alprazolam/Lorazepam,\n Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.INFORMATION_MESSAGE);
    }else if(Symptomps.equals("ADHD ( Attention Deficit Hyperactivity Disorder )")){
        JOptionPane.showMessageDialog(this,"Ur medications are Lorazepam/Mitrazapine, Melatonin, Amitriptyline","DISCLAIMER !!!", JOptionPane.INFORMATION_MESSAGE);
    }else if(Symptomps.equals("OCD ( Obsessive Compulsive Disorder )")){
        JOptionPane.showMessageDialog(this,"Ur medications are Fluoxetine, Fluvoxamine","DISCLAIMER !!!", JOptionPane.INFORMATION_MESSAGE);
    }else if(Symptomps.equals("Schizophrenia")){
        JOptionPane.showMessageDialog(this,"Ur medications are Desvenlaxamine, Paroxetine","DISCLAIMER !!!", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_cmbSymtompsActionPerformed

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
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel COUNT;
    private javax.swing.JPanel DRUGS;
    private javax.swing.JPanel FORM;
    private javax.swing.JPanel TOP;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JCheckBox chbAlpra;
    private javax.swing.JCheckBox chbAmit;
    private javax.swing.JCheckBox chbDesv;
    private javax.swing.JCheckBox chbFluo;
    private javax.swing.JCheckBox chbFluv;
    private javax.swing.JCheckBox chbLora;
    private javax.swing.JCheckBox chbMela;
    private javax.swing.JCheckBox chbMit;
    private javax.swing.JCheckBox chbParo;
    private javax.swing.JCheckBox chbSert;
    private static javax.swing.JComboBox<String> cmbSymtomps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lInvoice;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPharm1;
    private javax.swing.JLabel lPharm2;
    private javax.swing.JLabel lSymtomps;
    private javax.swing.JLabel lTitle;
    private javax.swing.JTextField tfInvoice;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
