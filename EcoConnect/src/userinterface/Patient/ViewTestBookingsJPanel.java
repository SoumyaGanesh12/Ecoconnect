/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;
import Business.EcoSystem;
import Business.LabAdmin.Lab;
import Business.LabAdmin.LabDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Malini
 */
public class ViewTestBookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTestBookingJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount userAccount;
    LabDirectory labDirectory;
    Lab lab;
    
    public ViewTestBookingsJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem business ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.business=business;
        populateTable();
    }
    public ViewTestBookingsJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        testsBookedTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        testsBookedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lab Name", "Request Date", "Date of test booked", "Status"
            }
        ));
        testsBookedTable.setGridColor(new java.awt.Color(255, 255, 255));
        testsBookedTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(testsBookedTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 680, 113));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-test-48.png"))); // NOI18N
        enterpriseLabel.setText("VIEW TEST BOOKINGS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 290, 50));

        jButton6.setBackground(new java.awt.Color(52, 7, 116));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("<<");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 199, 410, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P15.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable testsBookedTable;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) testsBookedTable.getModel();

        model.setRowCount(0);
//        System.out.println("R is");
        for (WorkRequest request : business.getWorkQueue().getWorkRequestList()) {
//            System.out.println("Receiver would be");
//            System.out.println(request.getReceiver());
            if (request.getSender().getUsername().equals(userAccount.getUsername())) {
                if(request instanceof BookTestWorkRequest)
                {                BookTestWorkRequest testRequest = (BookTestWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = request.getReceiver();
            row[1] = request.getRequestDate();
            row[2] = testRequest.getDateBooked();
            row[3] = request.getStatus();


            model.addRow(row);
            }
            }
        }
    }
}
