/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization;
import Business.Patient.Patient;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Soumya
 */
public class AddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount user;
    public AddPatientJPanel(JPanel userProcessContainer,EcoSystem business,UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPatientsName = new javax.swing.JTextField();
        txtPatientsAge = new javax.swing.JTextField();
        txtPatientsUname = new javax.swing.JTextField();
        txtPatientsPwd = new javax.swing.JTextField();
        btnAddPatients = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comboPatLoc = new javax.swing.JComboBox<>();
        enterpriseLabel = new javax.swing.JLabel();
        btnBackPat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPatientsEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPatientsNum = new javax.swing.JTextField();
        txtPatientsAddr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setText("Patient Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 80, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, -1));

        txtPatientsName.setPreferredSize(new java.awt.Dimension(164, 30));
        txtPatientsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientsNameActionPerformed(evt);
            }
        });
        add(txtPatientsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        txtPatientsAge.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtPatientsAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        txtPatientsUname.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtPatientsUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        txtPatientsPwd.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtPatientsPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btnAddPatients.setBackground(new java.awt.Color(52, 7, 116));
        btnAddPatients.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAddPatients.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatients.setText("Add patient");
        btnAddPatients.setPreferredSize(new java.awt.Dimension(156, 43));
        btnAddPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientsActionPerformed(evt);
            }
        });
        add(btnAddPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 140, 40));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setText("Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 200, 80, -1));

        comboPatLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboPatLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPatLocActionPerformed(evt);
            }
        });
        add(comboPatLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, -1));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-heart-plus-48.png"))); // NOI18N
        enterpriseLabel.setText("ADD PATIENT");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, -1));

        btnBackPat.setBackground(new java.awt.Color(52, 7, 116));
        btnBackPat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBackPat.setForeground(new java.awt.Color(255, 255, 255));
        btnBackPat.setText("<<");
        btnBackPat.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPatActionPerformed(evt);
            }
        });
        add(btnBackPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 7, 116));
        jLabel10.setText("Email");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 60, -1));

        txtPatientsEmail.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtPatientsEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 164, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(52, 7, 116));
        jLabel11.setText("Phone");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, -1));

        txtPatientsNum.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtPatientsNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 164, -1));

        txtPatientsAddr.setPreferredSize(new java.awt.Dimension(164, 30));
        txtPatientsAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientsAddrActionPerformed(evt);
            }
        });
        add(txtPatientsAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(52, 7, 116));
        jLabel8.setText("Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Patient567.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 700));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 610, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientsActionPerformed
        // TODO add your handling code here:
        if (txtPatientsUname.getText().isEmpty() || txtPatientsPwd.getText().isEmpty() || txtPatientsName.getText().isEmpty() || txtPatientsAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {

            if (!txtPatientsName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                txtPatientsName.setText("");
                return;
            }
            else if(!txtPatientsAge.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Enter proper age in years");
                txtPatientsAge.setText("");
                return;
            }
            else if(!txtPatientsEmail.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                txtPatientsEmail.setText("");
                return;
            }
            else if(!txtPatientsNum.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                txtPatientsNum.setText("");
                return;
            }
            else if(!txtPatientsAddr.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                txtPatientsAddr.setText("");
                return;
            }
            if (strongUsername() == false) {
                txtPatientsUname.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
                String userName = txtPatientsUname.getText();
            }
            if (strongPassword() == false) {
                txtPatientsPwd.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
            String name = txtPatientsName.getText();
            String age = txtPatientsAge.getText();
            String username = txtPatientsUname.getText();
            String pass = txtPatientsPwd.getText();
            Object selectedItem = comboPatLoc.getSelectedItem();

            String loc = selectedItem.toString();
            Employee emp = business.getEmployeeDirectory().createEmployee(name);
            emp.setLocation(loc);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(username, pass, emp, new CustomerRole());

            if(business.getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getOrganizationList()==null ||business.getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().findOrganization(name)==null ){
                business.getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().createOrganization(name, Organization.Type.Patient,"test");
                //            system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.Patient, "Test");
                JOptionPane.showMessageDialog(this," Patient created");
                txtPatientsName.setText("");
                txtPatientsAge.setText("");
                txtPatientsAddr.setText("");
                txtPatientsEmail.setText("");
                txtPatientsNum.setText("");
                txtPatientsUname.setText("");
                txtPatientsPwd.setText("");
            }else{
                System.out.println("Already exists");
                JOptionPane.showMessageDialog(this," Patient Already exists");
                //            Patient patient = new Patient();
                //            patient.setName(name);
                //            patient.setAge(age);
                //            ArrayList<Patient> patientlist = new ArrayList<>();
                //            patientlist.add(patient);
                // system.getPatientDirectory().setPatientList(patientlist);

            }
        }
    }//GEN-LAST:event_btnAddPatientsActionPerformed

    private void comboPatLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPatLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPatLocActionPerformed

    private void btnBackPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPatActionPerformed
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
    }//GEN-LAST:event_btnBackPatActionPerformed

    private void txtPatientsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientsNameActionPerformed

    private void txtPatientsAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientsAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientsAddrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatients;
    private javax.swing.JButton btnBackPat;
    private javax.swing.JComboBox<String> comboPatLoc;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtPatientsAddr;
    private javax.swing.JTextField txtPatientsAge;
    private javax.swing.JTextField txtPatientsEmail;
    private javax.swing.JTextField txtPatientsName;
    private javax.swing.JTextField txtPatientsNum;
    private javax.swing.JTextField txtPatientsPwd;
    private javax.swing.JTextField txtPatientsUname;
    // End of variables declaration//GEN-END:variables


 private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(txtPatientsUname.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(txtPatientsPwd.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
}
