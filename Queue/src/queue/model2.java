/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.text.DecimalFormat;

/**
 *
 * @author shamkh
 */
public class model2 extends javax.swing.JFrame {

    /**
     * Creates new form model2
     */
    double lmda, mue, L, Lq, W, Wq;

    public model2() {
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

        lamda_txt = new javax.swing.JTextField();
        muu_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        w_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Lq_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        l_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Wq_txt = new javax.swing.JTextField();
        calculate_btn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("M/M/1");

        lamda_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        lamda_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        muu_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        muu_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel1.setText("Arrival rate (λ)  :");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel2.setText("Service rate (μ) :");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel7.setText("Expected waiting time in the system(W) :");

        w_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel9.setText("Expected number of the customers in the queue(Lq) :");

        Lq_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel6.setText("Expected number of the customers in the system(L) :");

        l_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        jLabel8.setText("Expected waiting time in the queue(Wq) :");

        Wq_txt.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N

        calculate_btn.setFont(new java.awt.Font("Umpush", 1, 18)); // NOI18N
        calculate_btn.setText("Calculate ");
        calculate_btn.setAlignmentX(0.5F);
        calculate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_btnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        clearbtn.setForeground(java.awt.Color.red);
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lamda_txt)
                            .addComponent(muu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(480, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Wq_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lq_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(w_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(calculate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamda_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muu_txt))
                .addGap(28, 28, 28)
                .addComponent(calculate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lq_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Wq_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_btnActionPerformed
        // TODO add your handling code here:
        DecimalFormat dec = new DecimalFormat("#0.00");
        String s_l = lamda_txt.getText();
        String s_m = muu_txt.getText();
        

        if (!s_l.contains("/") && !s_l.contains(".")) {
            lmda = Double.parseDouble(s_l);
        }
        if (!s_m.contains("/") && !s_m.contains(".")) {
            mue = Double.parseDouble(s_m);
        } else {
            Inputs in = new Inputs();
            lmda = in.ConvertInput(s_l);
            mue = in.ConvertInput(s_m);
        }
        if ((lmda == 0 || lmda < 0) || (mue == 0 || mue < 0) || (lmda > mue)) {
            Invalid_Inputs n = new Invalid_Inputs();
            n.setVisible(true);
            n.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            n.setLocationRelativeTo(null);
        } else {
            L = (lmda / (mue - lmda));
            Lq = ((lmda * lmda) / (mue * (mue - lmda)));
            W = (1 / (mue - lmda));
            Wq = (lmda / (mue * (mue - lmda)));

            l_txt.setText("" + dec.format(L));
            Lq_txt.setText("" + dec.format(Lq));
            w_txt.setText("" + dec.format(W));
            Wq_txt.setText("" + dec.format(Wq));
        }

    }//GEN-LAST:event_calculate_btnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        lamda_txt.setText("");
        muu_txt.setText("");
        l_txt.setText("");
        Lq_txt.setText("");
        w_txt.setText("");
        Wq_txt.setText("");

    }//GEN-LAST:event_clearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(model2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(model2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(model2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(model2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new model2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Lq_txt;
    private javax.swing.JTextField Wq_txt;
    private javax.swing.JButton calculate_btn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField l_txt;
    private javax.swing.JTextField lamda_txt;
    private javax.swing.JTextField muu_txt;
    private javax.swing.JTextField w_txt;
    // End of variables declaration//GEN-END:variables
}
