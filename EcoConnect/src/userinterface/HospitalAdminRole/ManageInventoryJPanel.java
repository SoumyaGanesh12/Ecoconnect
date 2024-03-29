/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Soumya
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageInventoryJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    public ManageInventoryJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
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

        btnSAInv = new javax.swing.JButton();
        btnSAViewOrderHist = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBackSA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSAInv.setBackground(new java.awt.Color(52, 7, 116));
        btnSAInv.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSAInv.setForeground(new java.awt.Color(255, 255, 255));
        btnSAInv.setText("ORDER NEW INVENTORY ITEMS");
        btnSAInv.setPreferredSize(new java.awt.Dimension(156, 43));
        btnSAInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAInvActionPerformed(evt);
            }
        });
        add(btnSAInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 290, -1));

        btnSAViewOrderHist.setBackground(new java.awt.Color(52, 7, 116));
        btnSAViewOrderHist.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSAViewOrderHist.setForeground(new java.awt.Color(255, 255, 255));
        btnSAViewOrderHist.setText("VIEW ORDER HISTORY");
        btnSAViewOrderHist.setPreferredSize(new java.awt.Dimension(156, 43));
        btnSAViewOrderHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAViewOrderHistActionPerformed(evt);
            }
        });
        add(btnSAViewOrderHist, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 290, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-supplier-64.png"))); // NOI18N
        enterpriseLabel.setText("HOSPITAL SUPPLIER DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 410, 70));

        btnBackSA.setBackground(new java.awt.Color(52, 7, 116));
        btnBackSA.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackSA.setForeground(new java.awt.Color(255, 255, 255));
        btnBackSA.setText("<<");
        btnBackSA.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSAActionPerformed(evt);
            }
        });
        add(btnBackSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 220, 360));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 150, 1190, 960));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAInvActionPerformed
        // TODO add your handling code here:
        OrderNewInventoryItemJPanel orderInventory = new OrderNewInventoryItemJPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("OrderInventory", orderInventory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSAInvActionPerformed

    private void btnSAViewOrderHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAViewOrderHistActionPerformed
        // TODO add your handling code here:
        ViewInventoryOrderJPanel viewInventory = new ViewInventoryOrderJPanel(userProcessContainer, userAccount, business);
        userProcessContainer.add("OrderInventory", viewInventory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSAViewOrderHistActionPerformed

    private void btnBackSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSAActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_btnBackSAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSA;
    private javax.swing.JButton btnSAInv;
    private javax.swing.JButton btnSAViewOrderHist;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
