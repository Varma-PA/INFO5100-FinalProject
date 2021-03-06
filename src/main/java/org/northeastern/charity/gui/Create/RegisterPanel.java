/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.northeastern.charity.gui.Create;

/**
 *
 * @author sairammantravadi
 */
public class RegisterPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterPanel
     */
    public RegisterPanel() {
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

        jLabel5 = new javax.swing.JLabel();
        UserBtn = new javax.swing.JButton();
        FoundationBtn = new javax.swing.JButton();
        NGObtn = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Register Foundation");

        setBackground(new java.awt.Color(36, 35, 39));

        UserBtn.setBackground(new java.awt.Color(0, 204, 255));
        UserBtn.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        UserBtn.setForeground(new java.awt.Color(255, 255, 255));
        UserBtn.setText("User");
        UserBtn.setBorder(null);
        UserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserBtnActionPerformed(evt);
            }
        });

        FoundationBtn.setBackground(new java.awt.Color(255, 255, 255));
        FoundationBtn.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        FoundationBtn.setForeground(new java.awt.Color(0, 0, 0));
        FoundationBtn.setText("Foundation");
        FoundationBtn.setBorder(null);
        FoundationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoundationBtnActionPerformed(evt);
            }
        });

        NGObtn.setBackground(new java.awt.Color(0, 182, 94));
        NGObtn.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        NGObtn.setForeground(new java.awt.Color(255, 255, 255));
        NGObtn.setText("NGO");
        NGObtn.setBorder(null);
        NGObtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NGObtnActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Register");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FoundationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NGObtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(Title)))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FoundationBtn, NGObtn, UserBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(UserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NGObtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FoundationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserBtnActionPerformed

    private void FoundationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoundationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoundationBtnActionPerformed

    private void NGObtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NGObtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NGObtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FoundationBtn;
    private javax.swing.JButton NGObtn;
    private javax.swing.JLabel Title;
    private javax.swing.JButton UserBtn;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
