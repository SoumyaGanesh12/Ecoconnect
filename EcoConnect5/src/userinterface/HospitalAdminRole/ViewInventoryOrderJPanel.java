/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderInventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malini
 */
public class ViewInventoryOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInventoryOrderJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    public ViewInventoryOrderJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.business=business;
        populateRequestTable();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventoryRequestHVO = new javax.swing.JTable();
        btnRefreshHViewOrderDB = new javax.swing.JButton();
        btnBackHVO = new javax.swing.JButton();
        NewOrderJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInventoryRequestHVO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Logistics Company", "Ordered on ", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInventoryRequestHVO.setGridColor(new java.awt.Color(255, 255, 255));
        tblInventoryRequestHVO.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblInventoryRequestHVO);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 550, 97));

        btnRefreshHViewOrderDB.setBackground(new java.awt.Color(52, 7, 116));
        btnRefreshHViewOrderDB.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnRefreshHViewOrderDB.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshHViewOrderDB.setText("Refresh");
        btnRefreshHViewOrderDB.setPreferredSize(new java.awt.Dimension(156, 43));
        btnRefreshHViewOrderDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshHViewOrderDBActionPerformed(evt);
            }
        });
        add(btnRefreshHViewOrderDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 110, 30));

        btnBackHVO.setBackground(new java.awt.Color(52, 7, 116));
        btnBackHVO.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBackHVO.setForeground(new java.awt.Color(255, 255, 255));
        btnBackHVO.setText("<<");
        btnBackHVO.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackHVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHVOActionPerformed(evt);
            }
        });
        add(btnBackHVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        NewOrderJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewOrderJLabel.setForeground(new java.awt.Color(52, 7, 116));
        NewOrderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-order-64.png"))); // NOI18N
        NewOrderJLabel.setText("HOSPITAL VIEW ORDER DASHBOARD");
        add(NewOrderJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 460, -1));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -60, 1190, 960));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshHViewOrderDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshHViewOrderDBActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_btnRefreshHViewOrderDBActionPerformed

    private void btnBackHVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHVOActionPerformed
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
    }//GEN-LAST:event_btnBackHVOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NewOrderJLabel;
    private javax.swing.JButton btnBackHVO;
    private javax.swing.JButton btnRefreshHViewOrderDB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventoryRequestHVO;
    // End of variables declaration//GEN-END:variables

private void populateRequestTable() {
         //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) tblInventoryRequestHVO.getModel();
        for (WorkRequest request :  business.getWorkQueue().getWorkRequestList()) {
            
        
            if (request.getSender().equals(userAccount)){
            model.setRowCount(0);
            Object[] row = new Object[3];
            row[0] = request.getReceiver().getEmployee().getName();
            row[1] = request.getRequestDate();
            row[2] = request.getStatus();


            model.addRow(row);
            }
        }
        
    }
}

