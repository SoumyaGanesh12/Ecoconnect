/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;


import Business.EcoSystem;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Organization;
import Business.Patient.Patient;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.EmergencyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malini
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaJPanel
     */
    
    
    private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem business;
    private String hospitalName;
    private String docname;
    private String timings;
    private Hospital resObj;
    ArrayList<Patient> array1;
    
    
    
 public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount user,EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        array1 = new ArrayList<>();
//        jPanel1.setVisible(false);
        //valueLabel.setText(enterprise.getName());
        populateComboBox();
    }

     public void populateRequestTable(){
        
    }

    public void populateComboBox(){
        // MSS check
//         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
                      for(Enterprise res: business.getEnterpriseDirectory().getEnterpriseList()){

if(res.getEnterpriseType().getValue().equals("Hospital")){
            restList.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    public void populateComboBox1(String hospname){
        // MSS check
//         for(Organization org: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getOrganizationList()){
         for(Organization org: business.getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getOrganizationList()){
             
if(org.getEnterpriseType1().getValue().equals("Doctor")){
            restList1.addItem(org.getName());
             }
        }
        
          
            
    }
    public void populateComboBox2(String docs){
        System.out.println(hospitalName+docs +" asasas");
       // MSS check
//         for(String timings: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).getTimings()){
         for(String timings: business.getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).getTimings()){
         
restList2.addItem(timings);
         
        }
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        restList = new javax.swing.JComboBox<>();
        restList1 = new javax.swing.JComboBox<>();
        restList2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        InsuranceJButton = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-medical-id-64.png"))); // NOI18N
        enterpriseLabel.setText("PATIENT DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 340, 70));

        restList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restListActionPerformed(evt);
            }
        });
        add(restList, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 293, -1));

        restList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList1ActionPerformed(evt);
            }
        });
        add(restList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 293, -1));

        restList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList2ActionPerformed(evt);
            }
        });
        add(restList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 293, -1));

        jButton1.setBackground(new java.awt.Color(52, 7, 116));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit Appointment");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 190, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 290, -1));

        jButton2.setBackground(new java.awt.Color(52, 7, 116));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check prescription");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 180, -1, -1));

        InsuranceJButton.setBackground(new java.awt.Color(52, 7, 116));
        InsuranceJButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        InsuranceJButton.setForeground(new java.awt.Color(255, 255, 255));
        InsuranceJButton.setText("Insurance");
        InsuranceJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        InsuranceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceJButtonActionPerformed(evt);
            }
        });
        add(InsuranceJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 60, -1, -1));

        OrderBtn.setBackground(new java.awt.Color(52, 7, 116));
        OrderBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        OrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        OrderBtn.setText("Order Medicine");
        OrderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        OrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtnActionPerformed(evt);
            }
        });
        add(OrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 220, -1, -1));

        jButton4.setBackground(new java.awt.Color(52, 7, 116));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Test ");
        jButton4.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 100, -1, -1));

        jButton5.setBackground(new java.awt.Color(52, 7, 116));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SOS");
        jButton5.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 140, -1, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 410, 310));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setText("Select Time");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setText("Select Hospital");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setText("Select Doctor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setText("DATE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patImg.jpeg"))); // NOI18N
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 710, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setText("Symptoms");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void restListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restListActionPerformed
        restList1.removeAllItems();
        restList2.removeAllItems();
        hospitalName = String.valueOf(restList.getSelectedItem());
        populateComboBox1(hospitalName);
    }//GEN-LAST:event_restListActionPerformed

    private void restList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList1ActionPerformed
        // TODO add your handling code here:
        restList2.removeAllItems();
        docname = String.valueOf(restList1.getSelectedItem());
        System.out.println(docname + " asasas");
        populateComboBox2(docname);

    }//GEN-LAST:event_restList1ActionPerformed

    private void restList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_restList2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        timings = String.valueOf(restList2.getSelectedItem());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date d = jDateChooser2.getDate();
        BookAppointment appointment = new BookAppointment();
        appointment.setSender(user);
        System.out.println("ajcjac       "+business.getUserAccountDirectory().findUserAccount(docname));
        appointment.setReceiver( business.getUserAccountDirectory().findUserAccount(docname));
        appointment.setStatus("Appointment Booked");
        appointment.setMessage(jTextArea1.getText());

        appointment.setRequestDate(d);
        business.getWorkQueue().addWorkRequest(appointment);
        business.getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).updateTimings(timings);
        
JOptionPane.showMessageDialog(this, "Appointment fixed");
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//          DefaultTableModel dtm = (DefaultTableModel) doctorDetails1.getModel();
//        dtm.setRowCount(0);
//       
//        for(WorkRequest wq : business.getWorkQueue().findWorkRequestByRec(user)) {
//            if(wq instanceof BookAppointment){
//                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
//                System.out.println("comm" + ((BookAppointment) wq).getComments());
//           Object row[] = new Object[5];
//            row[0] = wq.getSender().getEmployee().getName();
//            row[1] = ((BookAppointment) wq).getMeds().getMedicines().get(0);
//            row[2] = ((BookAppointment) wq).getMeds().getMedicines().get(1);
//            row[3] = ((BookAppointment) wq).getMeds().getMedicines().get(2);
//            row[4]=((BookAppointment) wq).getComments();
//            dtm.addRow(row);
//            }}}
//           
//        
//
//         jPanel1.setVisible(true);
         
        String docname = String.valueOf(restList1.getSelectedItem());
         
        ViewPresJPanel viewPres = new ViewPresJPanel(userProcessContainer, user, business, docname);
        userProcessContainer.add("View Prescription", viewPres);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InsuranceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceJButtonActionPerformed
        // TODO add your handling code here:
        if(this.user.getEmployee().isHasInsurance()){

            ViewCurrentPlans viewCurrentPlans = new ViewCurrentPlans(userProcessContainer, user, business);
            userProcessContainer.add("viewCurentPlans", viewCurrentPlans);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
        else {
            ViewInsurancePlans viewInsurance = new ViewInsurancePlans(userProcessContainer, user, business);
            userProcessContainer.add("viewInsurance", viewInsurance);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_InsuranceJButtonActionPerformed

    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed
        // TODO add your handling code here:
        orderMedJpanel orderJPanel = new orderMedJpanel(userProcessContainer, user, business, user.getEmployee().getName());
        userProcessContainer.add("CreateSupport", orderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BookTestJPanel bookTest = new BookTestJPanel(userProcessContainer, user, business);
        userProcessContainer.add("BookTest", bookTest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Random random_method = new Random();
// MSS check
//        ArrayList<Enterprise> e = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList();
        ArrayList<Enterprise> e = business.getEnterpriseDirectory().getEnterpriseList();

        int index = 0;
        UserAccount name3 = null;
        for (Enterprise res:e)
        {
            System.out.println("sss1" + e);
            System.out.println("sss1" + res.getEnterpriseType().getValue());
            if(res.getEnterpriseType().getValue().equals("Emergency")){
                System.out.println("sss" + res.getName());
                ArrayList<Enterprise> array1 =new ArrayList<>();
                array1.add(res);
                index = random_method.nextInt(array1.size());
                name3 = business.getUserAccountDirectory().findUserAccount(array1.get(index).getName());

            }

        }
        EmergencyWorkRequest emergencyWorkRequest = new EmergencyWorkRequest();

        emergencyWorkRequest.setSender(this.user);

        //            System.out.println("getting sender uname "+name3.getEmployee().getName());
        emergencyWorkRequest.setReceiver(name3);

        System.out.println("asasqqqq555 " + emergencyWorkRequest.getReceiver());
        emergencyWorkRequest.setStatus("emergency assistance needed");

        business.getWorkQueue().addWorkRequest(emergencyWorkRequest);
        System.out.println("wooook" + business.getWorkQueue().getWorkRequestList());
        JOptionPane.showMessageDialog(this, "Help is on the way!");
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsuranceJButton;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> restList;
    private javax.swing.JComboBox<String> restList1;
    private javax.swing.JComboBox<String> restList2;
    // End of variables declaration//GEN-END:variables
}
