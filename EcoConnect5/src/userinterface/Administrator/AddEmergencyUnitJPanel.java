/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Administrator;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import Business.Organization;
import Business.Role.EmergencyAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Smithi
 */
public class AddEmergencyUnitJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEmergencyUnitJPanel
     */
    JPanel userProcessContainer;
    EcoSystem business;
    public AddEmergencyUnitJPanel(JPanel userProcessContainer,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmerName = new javax.swing.JTextField();
        txtEmerAddr = new javax.swing.JTextField();
        txtEmerUname = new javax.swing.JTextField();
        txtEmerPwd = new javax.swing.JTextField();
        addEmer = new javax.swing.JButton();
        comboLocEmer = new javax.swing.JComboBox<>();
        btnBackEmer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmailEmer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmerNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmerName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtEmerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txtEmerAddr.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtEmerAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txtEmerUname.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtEmerUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        txtEmerPwd.setPreferredSize(new java.awt.Dimension(164, 30));
        add(txtEmerPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        addEmer.setBackground(new java.awt.Color(52, 7, 116));
        addEmer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addEmer.setForeground(new java.awt.Color(255, 255, 255));
        addEmer.setText("Add Emergency Unit");
        addEmer.setPreferredSize(new java.awt.Dimension(164, 43));
        addEmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmerActionPerformed(evt);
            }
        });
        add(addEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 220, 40));

        comboLocEmer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboLocEmer.setPreferredSize(new java.awt.Dimension(140, 30));
        comboLocEmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocEmerActionPerformed(evt);
            }
        });
        add(comboLocEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, -1));

        btnBackEmer.setBackground(new java.awt.Color(52, 7, 116));
        btnBackEmer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBackEmer.setForeground(new java.awt.Color(255, 255, 255));
        btnBackEmer.setText("<<");
        btnBackEmer.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackEmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackEmerActionPerformed(evt);
            }
        });
        add(btnBackEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(52, 7, 116));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-hospital-48.png"))); // NOI18N
        jLabel8.setText("Add Emergency Unit");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 390, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Emergency Unit Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 7, 116));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 20));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 100, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Location:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, 20));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 7, 116));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 80, 20));

        txtEmailEmer.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtEmailEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 164, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(52, 7, 116));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Phone:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, 20));

        txtEmerNum.setPreferredSize(new java.awt.Dimension(15, 30));
        add(txtEmerNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 164, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a2.jpg"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 470, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void addEmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmerActionPerformed
        // TODO add your handling code here:
        if (txtEmerUname.getText().isEmpty() || txtEmerPwd.getText().isEmpty() || txtEmerName.getText().isEmpty() || txtEmerAddr.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {
            if (!txtEmerName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                txtEmerName.setText("");
                return;
            }
            else if(!txtEmerAddr.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                txtEmerAddr.setText("");
                return;
            }
            else if(!txtEmailEmer.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                txtEmailEmer.setText("");
                return;
            }
            else if(!txtEmerNum.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                txtEmerNum.setText("");
                return;
            }
            else if (strongUsername() == false) {
                txtEmerUname.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }
            else if (strongPassword() == false) {
                txtEmerPwd.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
            String name = txtEmerName.getText();
            //        String address = labAddr.getText();
            //        String phoneNumber = labPhone.getText();
            String userName = txtEmerUname.getText();
            String pwd= txtEmerPwd.getText();
            Object selectedItem = comboLocEmer.getSelectedItem();
            String location = selectedItem.toString();
            Employee emp = business.getEmployeeDirectory().createEmployee(name);

            emp.setLocation(location);
            UserAccount account = business.getUserAccountDirectory().createUserAccount(userName, pwd, emp, new EmergencyAdminRole());
            
            if (business.getEnterpriseDirectory().findEnterprise(name) == null) {
                business.getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Emergency );
                business.getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.EmergencyAdmin, "Test");
                JOptionPane.showMessageDialog(this," Emergency Unit created");
                txtEmerName.setText("");
                txtEmerAddr.setText("");
                txtEmailEmer.setText("");
                txtEmerNum.setText("");
                txtEmerUname.setText("");
                txtEmerPwd.setText("");
            }else{
                JOptionPane.showMessageDialog(this," Emergency Unit already exist");
            }

        }
    }//GEN-LAST:event_addEmerActionPerformed

    private void btnBackEmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackEmerActionPerformed
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
    }//GEN-LAST:event_btnBackEmerActionPerformed

    private void comboLocEmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocEmerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLocEmerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmer;
    private javax.swing.JButton btnBackEmer;
    private javax.swing.JComboBox<String> comboLocEmer;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEmailEmer;
    private javax.swing.JTextField txtEmerAddr;
    private javax.swing.JTextField txtEmerName;
    private javax.swing.JTextField txtEmerNum;
    private javax.swing.JTextField txtEmerPwd;
    private javax.swing.JTextField txtEmerUname;
    // End of variables declaration//GEN-END:variables


 private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(txtEmerUname.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(txtEmerPwd.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
}

