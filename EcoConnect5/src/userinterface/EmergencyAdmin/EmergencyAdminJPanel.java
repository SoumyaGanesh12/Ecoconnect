/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyAdmin;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Malini
 */
public class EmergencyAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyAdminJPanel
     */
        
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem business;
    
    public EmergencyAdminJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
        this.business=business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEACompleteHelp = new javax.swing.JButton();
        btnEAViewHist = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBackEmeReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEACompleteHelp.setBackground(new java.awt.Color(52, 7, 116));
        btnEACompleteHelp.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEACompleteHelp.setForeground(new java.awt.Color(255, 255, 255));
        btnEACompleteHelp.setText("COMPLETE HELP");
        btnEACompleteHelp.setPreferredSize(new java.awt.Dimension(156, 43));
        btnEACompleteHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEACompleteHelpActionPerformed(evt);
            }
        });
        add(btnEACompleteHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, -1));

        btnEAViewHist.setBackground(new java.awt.Color(52, 7, 116));
        btnEAViewHist.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEAViewHist.setForeground(new java.awt.Color(255, 255, 255));
        btnEAViewHist.setText("VIEW HISTORY");
        btnEAViewHist.setPreferredSize(new java.awt.Dimension(156, 43));
        btnEAViewHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEAViewHistActionPerformed(evt);
            }
        });
        add(btnEAViewHist, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 220, -1));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-admin-48.png"))); // NOI18N
        enterpriseLabel.setText("EMERGENCY ADMIN");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 270, 70));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emergencyImg.jpg"))); // NOI18N
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 440, 390));

        btnBackEmeReq.setBackground(new java.awt.Color(52, 7, 116));
        btnBackEmeReq.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBackEmeReq.setForeground(new java.awt.Color(255, 255, 255));
        btnBackEmeReq.setText("<<");
        btnBackEmeReq.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackEmeReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackEmeReqActionPerformed(evt);
            }
        });
        add(btnBackEmeReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEACompleteHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEACompleteHelpActionPerformed
        // TODO add your handling code here:
        ViewEmergencyRequestsJPanel viewRequest = new ViewEmergencyRequestsJPanel(userProcessContainer, ua, business);
        userProcessContainer.add("ViewEmergencyRequest", viewRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEACompleteHelpActionPerformed

    private void btnEAViewHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEAViewHistActionPerformed
        // TODO add your handling code here:
        
        EmergencyHistoryJPanel emergencyHistoryJPanel = new EmergencyHistoryJPanel(userProcessContainer, ua, business);
        userProcessContainer.add("ViewEmergencyHistory", emergencyHistoryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEAViewHistActionPerformed

    private void btnBackEmeReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackEmeReqActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackEmeReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackEmeReq;
    private javax.swing.JButton btnEACompleteHelp;
    private javax.swing.JButton btnEAViewHist;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
