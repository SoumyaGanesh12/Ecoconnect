/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smithi
 */
public class DoctorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount user;
    String hospname;
    
    public DoctorAdminJPanel(JPanel userProcessContainer,EcoSystem business,UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        viewTable();
        jPanel1.setVisible(false);
    }
    
    
    
    public void viewTable(){

        DefaultTableModel dtm = (DefaultTableModel) tblDocDetails.getModel();
        dtm.setRowCount(0);
        
        if( business.getWorkQueue()!=null){
            for(WorkRequest wq :business.getWorkQueue().getWorkRequestList()) {
                if(wq instanceof BookAppointment){
                    if(wq.getReceiver().getUsername().equals(user.getUsername())){
                        Object row[] = new Object[4];
                        row[0] = wq;
                        row[1] = wq.getMessage();
                        row[2] = wq.getStatus();
                        row[3] = wq.getRequestDate();
                        dtm.addRow(row);
                    }
                }
            }
        }
    }
    
    
    public void viewTable1(String name){
        
        DefaultTableModel dtm = (DefaultTableModel) tblPresDetailsDoc.getModel();
        dtm.setRowCount(0);
//        if(wq.getReceiver().getUsername().equals(user.getUsername())){
        int row1 = tblDocDetails.getSelectedRow();
        int column = 0;
        String value = tblDocDetails.getModel().getValueAt(row1, column).toString();
        
        for(WorkRequest wq : business.getWorkQueue().getWorkRequestList()) {
            if(wq instanceof BookAppointment){
                System.out.println("reciever "+value);
                System.out.println("check --"+wq.getSender().getEmployee().getName());
        System.out.println("wq for table --"+wq);
//                if(wq.getSender().getEmployee().getName().equals(value)){
//                System.out.println("comm" + ((BookAppointment) wq).getComments());
if(wq.getReceiver().getUsername().equals(user.getUsername())){
           Object row[] = new Object[5];
            row[0] = wq.getSender().getEmployee().getName();
            System.out.println("meds are" +((BookAppointment) wq).getMeds().getMedicines());
            
                for(int i=1;i<=(((BookAppointment) wq).getMeds().getMedicines()).size();i++){
                    for(String m:((BookAppointment) wq).getMeds().getMedicines()){
                    System.out.println(((BookAppointment) wq).getMeds().getMedicines().size());
                    row[i] = m;
                    i++;
            }
            }
            row[4]=((BookAppointment) wq).getComments();
            dtm.addRow(row);
            }}}
           
        
         jPanel1.setVisible(true);
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
        tblDocDetails = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPresDetailsDoc = new javax.swing.JTable();
        btnDocCreatePres = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBackAD = new javax.swing.JButton();
        btnDocCheckPres = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDocDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient name", "Patient symtoms", "Patient Booking Status", "Booked Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDocDetails.setGridColor(new java.awt.Color(255, 255, 255));
        tblDocDetails.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblDocDetails);
        if (tblDocDetails.getColumnModel().getColumnCount() > 0) {
            tblDocDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDocDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDocDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDocDetails.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 690, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblPresDetailsDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "medicine 1", "medicine 2", "medicine 3", "comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPresDetailsDoc.setGridColor(new java.awt.Color(255, 255, 255));
        tblPresDetailsDoc.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tblPresDetailsDoc);
        if (tblPresDetailsDoc.getColumnModel().getColumnCount() > 0) {
            tblPresDetailsDoc.getColumnModel().getColumn(0).setResizable(false);
            tblPresDetailsDoc.getColumnModel().getColumn(1).setResizable(false);
            tblPresDetailsDoc.getColumnModel().getColumn(2).setResizable(false);
            tblPresDetailsDoc.getColumnModel().getColumn(3).setResizable(false);
            tblPresDetailsDoc.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 640, 170));

        btnDocCreatePres.setBackground(new java.awt.Color(52, 7, 116));
        btnDocCreatePres.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDocCreatePres.setForeground(new java.awt.Color(255, 255, 255));
        btnDocCreatePres.setText("Create a prescription");
        btnDocCreatePres.setPreferredSize(new java.awt.Dimension(156, 43));
        btnDocCreatePres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocCreatePresActionPerformed(evt);
            }
        });
        add(btnDocCreatePres, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 220, 30));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-doctor-40.png"))); // NOI18N
        enterpriseLabel.setText("DOCTOR DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 510, 40));

        btnBackAD.setBackground(new java.awt.Color(52, 7, 116));
        btnBackAD.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBackAD.setForeground(new java.awt.Color(255, 255, 255));
        btnBackAD.setText("<<");
        btnBackAD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackAD.setPreferredSize(new java.awt.Dimension(80, 30));
        add(btnBackAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        btnDocCheckPres.setBackground(new java.awt.Color(52, 7, 116));
        btnDocCheckPres.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDocCheckPres.setForeground(new java.awt.Color(255, 255, 255));
        btnDocCheckPres.setText("Check prescription");
        btnDocCheckPres.setPreferredSize(new java.awt.Dimension(156, 43));
        btnDocCheckPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocCheckPresActionPerformed(evt);
            }
        });
        add(btnDocCheckPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 220, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/docImg2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocCheckPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocCheckPresActionPerformed
        // TODO add your handling code here:
        int row = tblDocDetails.getSelectedRow();
        int column = 0;
        String value = tblDocDetails.getModel().getValueAt(row, column).toString();
        if(row < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println("value passed for table1 --"+value);
        viewTable1(value);

    }//GEN-LAST:event_btnDocCheckPresActionPerformed

    private void btnDocCreatePresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocCreatePresActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDocDetails.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        BookAppointment pa = (BookAppointment)tblDocDetails.getValueAt(selectedRow,0);
        PrescriptionJPanel prescriptionJPanel = new PrescriptionJPanel(userProcessContainer, business,pa);
        userProcessContainer.add("add Prescription", prescriptionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDocCreatePresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackAD;
    private javax.swing.JButton btnDocCheckPres;
    private javax.swing.JButton btnDocCreatePres;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDocDetails;
    private javax.swing.JTable tblPresDetailsDoc;
    // End of variables declaration//GEN-END:variables
}
