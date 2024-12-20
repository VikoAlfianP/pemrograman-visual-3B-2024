

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Viko Alfian P
 */
public class uno extends javax.swing.JFrame {
    private boolean isRunning;
    private int targetNilai;
    private int percobaanCount;
    private int maxPercobaan = 10;
    private String playerName;
    private  List<Integer> scores = new ArrayList<>(); 
    private List<Integer> successfulGuesses = new ArrayList<>();    
    
    public uno() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ji1 = new javax.swing.JInternalFrame();
        jt1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        f1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        f2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        f3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nilai = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ji1.setBackground(new java.awt.Color(102, 102, 102));
        ji1.setVisible(true);

        jt1.setBackground(new java.awt.Color(0, 153, 153));
        jt1.setForeground(new java.awt.Color(255, 255, 255));
        jt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 235, 221));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tebak Angka");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Angka");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 19, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 30, 0, 43);
        jPanel3.add(f1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Clue");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 19, 0, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 30, 0, 43);
        jPanel3.add(f2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Score");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 19, 0, 0);
        jPanel3.add(jLabel4, gridBagConstraints);

        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 30, 23, 43);
        jPanel3.add(f3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        b1.setText("Guess");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel4.add(b1);

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Tebak Angka");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(119, 119, 119)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 230, Short.MAX_VALUE)))
        );

        jt1.addTab("Gameplay", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Score");

        jLabel9.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Score");

        nilai.setColumns(20);
        nilai.setRows(5);
        jScrollPane1.setViewportView(nilai);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(164, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(159, 159, 159)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );

        jt1.addTab("Score", jPanel2);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Permainan Tebak Angka");

        javax.swing.GroupLayout ji1Layout = new javax.swing.GroupLayout(ji1.getContentPane());
        ji1.getContentPane().setLayout(ji1Layout);
        ji1Layout.setHorizontalGroup(
            ji1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ji1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jt1)
                .addContainerGap())
            .addGroup(ji1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ji1Layout.setVerticalGroup(
            ji1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ji1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jt1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ji1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ji1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!isRunning) {
            jButton2.setText("Reset");
            isRunning = true;
            targetNilai = (int) (Math.random() * 100) + 1; // Generate angka antara 1 hingga 100
            percobaanCount = 0; // Reset percobaan count
            JOptionPane.showMessageDialog(this, "Permainan dimulai! Tebak angka antara 1 dan 100.");
        } else {
            jButton2.setText("Start");
            isRunning = false;
            f1.setText("");
            f2.setText("");
            f3.setText("");
            JOptionPane.showMessageDialog(this, "Permainan direset.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
if (!isRunning) {
            JOptionPane.showMessageDialog(this, "Harap mulai permainan terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int guessedValue = Integer.parseInt(f1.getText());
            percobaanCount++; // Increment attempt count

            if (guessedValue < targetNilai) {
                f2.setText("Nilai terlalu rendah! Coba lagi.");
            } else if (guessedValue > targetNilai) {
                f2.setText("Nilai terlalu tinggi! Coba lagi.");
            } else {
                // If the guess is correct
                successfulGuesses.add(guessedValue); // Add to successful guesses
                playerName = JOptionPane.showInputDialog(this, "Selamat! Anda telah menebak nilai dengan benar setelah " + percobaanCount + " percobaan. Masukkan nama Anda:");
                if (playerName != null && !playerName.trim().isEmpty()) {
                    // Calculate score based on remaining attempts
                    int score = (maxPercobaan - percobaanCount) * 10;
                    scores.add(score); // Save the score
                    // Display player's name and score in the JTextField
                    nilai.setText("Nama: " + playerName + ", Score: " + score);
                } else {
                    nilai.setText("Score: " + (maxPercobaan - percobaanCount) * 10);
                }
                isRunning = false; // End game
                jButton2.setText("Start"); // Reset button text

                // Update the JTextArea to show successful guesses
                updateSuccessfulGuesses();
            }

            // Update remaining attempts
            f3ActionPerformed(evt); 

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid! Harap masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        String input = JOptionPane.showInputDialog(this, "Masukkan nilai antara 1 hingga 100:");
        
        try {
            targetNilai = Integer.parseInt(input);
            if (targetNilai >= 1 && targetNilai <= 100) {
                JOptionPane.showMessageDialog(this, "Nilai yang dimasukkan: " + targetNilai);
                percobaanCount = 0; // Reset percobaan count saat nilai valid dimasukkan
            } else {
                JOptionPane.showMessageDialog(this, "Nilai harus antara 1 dan 100!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid! Harap masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_f1ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        if (targetNilai == 0) {
        JOptionPane.showMessageDialog(this, "Harap masukkan nilai terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String input = JOptionPane.showInputDialog(this, "Masukkan nilai untuk mendapatkan clue:");
    try {
        int nilai = Integer.parseInt(input);
        percobaanCount++; // Tambah percobaan count

        if (nilai < targetNilai) {
            JOptionPane.showMessageDialog(this, "Nilai terlalu rendah! Coba lagi.");
        } else if (nilai > targetNilai) {
            JOptionPane.showMessageDialog(this, "Nilai terlalu tinggi! Coba lagi.");
        } else {
            JOptionPane.showMessageDialog(this, "Selamat! Anda telah menebak nilai dengan benar setelah " + percobaanCount + " percobaan.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input tidak valid! Harap masukkan angka.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_f2ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        int percobaanTersisa = maxPercobaan - percobaanCount; 
        f3.setText("Sisa percobaan: " + percobaanTersisa); 
    }//GEN-LAST:event_f3ActionPerformed
    private void nilaiActionPerformed(java.awt.event.ActionEvent evt) {
        int percobaanTersisa = maxPercobaan - percobaanCount; // Calculate remaining attempts
        int score = percobaanTersisa * 10; // Calculate score
    }
 
    private void updateSuccessfulGuesses() {
        StringBuilder sb = new StringBuilder();
        int score = (maxPercobaan - percobaanCount) * 10;
        sb.append("Player Name: ").append(playerName).append("\n");
        sb.append("Score: ").append(score).append("\n");
    // Include the player's name and score
    if (playerName != null && !playerName.trim().isEmpty()) {
        sb.append("Player Name: ").append(playerName).append("\n");
        sb.append("Score: ").append(score).append("\n");
    } else {
        sb.append("Score: 0\n"); // Default score if no player name is provided
    }

    nilai.setText(sb.toString()); // Update the JTextArea with successful guesses
    }
    
    public static void main(String args[]) {
    SwingUtilities.invokeLater(() -> new uno().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JInternalFrame ji1;
    private javax.swing.JTabbedPane jt1;
    private javax.swing.JTextArea nilai;
    // End of variables declaration//GEN-END:variables
}
