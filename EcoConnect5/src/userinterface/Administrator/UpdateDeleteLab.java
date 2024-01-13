/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Administrator;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise;
import static Business.Organization.Type.LabAdmin;
import static Business.Role.Role.RoleType.LabAdmin;
//import Business.Lab.Lab;
//import Business.Lab.LabDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malini
 */
public class UpdateDeleteLab extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDeleteLab
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount user;
    public UpdateDeleteLab(JPanel userProcessContainer, EcoSystem business, UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        populateTable();
//        if(system.getNetworkList().size()>0 ){
//            populateTable();
//        }else{
//             JOptionPane.showMessageDialog(null, "No Labs added");
//        }
//        

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
        labTable = new javax.swing.JTable();
        btnLabUpd = new javax.swing.JButton();
        btnLabDel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboUpdLabLoc = new javax.swing.JComboBox<>();
        btnBackUpdLab = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxtFieldLab = new javax.swing.JTextField();
        addrTxtFieldLab = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "UserName"
            }
        ));
        labTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        labTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(labTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 110));

        btnLabUpd.setBackground(new java.awt.Color(52, 7, 116));
        btnLabUpd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLabUpd.setForeground(new java.awt.Color(255, 255, 255));
        btnLabUpd.setText("UPDATE");
        btnLabUpd.setPreferredSize(new java.awt.Dimension(156, 43));
        btnLabUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabUpdActionPerformed(evt);
            }
        });
        add(btnLabUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 110, 30));

        btnLabDel.setBackground(new java.awt.Color(52, 7, 116));
        btnLabDel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLabDel.setForeground(new java.awt.Color(255, 255, 255));
        btnLabDel.setText("DELETE");
        btnLabDel.setPreferredSize(new java.awt.Dimension(156, 43));
        btnLabDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabDelActionPerformed(evt);
            }
        });
        add(btnLabDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 100, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 80, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-optical-microscope-64.png"))); // NOI18N
        jLabel5.setText("LAB DETAILS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 420, 70));

        comboUpdLabLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show All", "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboUpdLabLoc.setPreferredSize(new java.awt.Dimension(140, 30));
        comboUpdLabLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUpdLabLocActionPerformed(evt);
            }
        });
        add(comboUpdLabLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, -1));

        btnBackUpdLab.setBackground(new java.awt.Color(52, 7, 116));
        btnBackUpdLab.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        btnBackUpdLab.setForeground(new java.awt.Color(255, 255, 255));
        btnBackUpdLab.setText("<<");
        btnBackUpdLab.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackUpdLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpdLabActionPerformed(evt);
            }
        });
        add(btnBackUpdLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 50, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setText("Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 20));

        nameTxtFieldLab.setPreferredSize(new java.awt.Dimension(164, 30));
        add(nameTxtFieldLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 150, -1));

        addrTxtFieldLab.setPreferredSize(new java.awt.Dimension(164, 30));
        add(addrTxtFieldLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 150, -1));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab123.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(900, 600));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 600, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void labTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) labTable.getModel();

        String name = dtm.getValueAt(labTable.getSelectedRow(), 0).toString();
        String address = dtm.getValueAt(labTable.getSelectedRow(), 1).toString();
        nameTxtFieldLab.setText(name);
        addrTxtFieldLab.setText(address);
    }//GEN-LAST:event_labTableMouseClicked

    private void btnLabUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabUpdActionPerformed
        // TODO add your handling code here:

        int selectedRow = labTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            //            updateJPanel.setVisible(true);
            //            System.out.println("I am here");
            Object selectedItem = comboUpdLabLoc.getSelectedItem();
            String loc = selectedItem.toString();
            //    for(Enterprise lab: system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()){
                //        if lab.getName().equals(selectedItem)
                //    }
            Enterprise lab = (Enterprise) labTable.getValueAt(selectedRow, 0);
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(lab.getName());
            if (!nameTxtFieldLab.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                nameTxtFieldLab.setText("");
                return;
            }
            else if (strongUsername() == false) {

                addrTxtFieldLab.setText("");
                JOptionPane.showMessageDialog(null, "should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }else {
            }
            lab.setName(nameTxtFieldLab.getText());
            ua.getEmployee().setName(nameTxtFieldLab.getText());
            ua.setUsername(addrTxtFieldLab.getText());
            populateTable();
            nameTxtFieldLab.setText("");
            addrTxtFieldLab.setText("");
        }
    }//GEN-LAST:event_btnLabUpdActionPerformed

    private void btnLabDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabDelActionPerformed
        // TODO add your handling code here:

        Object selectedItem = comboUpdLabLoc.getSelectedItem();
        String loc = selectedItem.toString();
        int selectedRow = labTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Enterprise lab = (Enterprise) labTable.getValueAt(selectedRow, 0);
            business.getEnterpriseDirectory().getEnterpriseList().remove(lab);
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(lab.getName());
            business.getUserAccountDirectory().getUserAccountList().remove(ua);

            JOptionPane.showMessageDialog(null, "Lab " + nameTxtFieldLab.getText() + " deleted");
            populateTable();
            nameTxtFieldLab.setText("");
            addrTxtFieldLab.setText("");

        }
    }//GEN-LAST:event_btnLabDelActionPerformed

    private void comboUpdLabLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUpdLabLocActionPerformed
        // TODO add your handling code here:
        Object selectedItem = comboUpdLabLoc.getSelectedItem();
        String loc = selectedItem.toString();
        if(loc.equals("Show All")){
            populateTable();
        }else{
            populateTableByLoc();
        }
    }//GEN-LAST:event_comboUpdLabLocActionPerformed

    private void btnBackUpdLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpdLabActionPerformed
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
    }//GEN-LAST:event_btnBackUpdLabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrTxtFieldLab;
    private javax.swing.JButton btnBackUpdLab;
    private javax.swing.JButton btnLabDel;
    private javax.swing.JButton btnLabUpd;
    private javax.swing.JComboBox<String> comboUpdLabLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTable;
    private javax.swing.JTextField nameTxtFieldLab;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
        
        Object selectedItem = comboUpdLabLoc.getSelectedItem();
        String city = selectedItem.toString();
        DefaultTableModel model = (DefaultTableModel) labTable.getModel();
        model.setRowCount(0);
//        System.out.println("Ap was here " +city);
//        System.out.println("ap here " +system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList());

        for(Enterprise lab: business.getEnterpriseDirectory().getEnterpriseList()){
//                     System.out.println);
                     System.out.println(lab.getUserAccountDirectory().getUserAccountList());
                     System.out.println(lab.getName());
                     System.out.println(lab.getUserAccountDirectory().findUserAccount(lab.getName()));
        if(lab.getEnterpriseType().getValue().equals("Lab")){
            Object[] row = new Object[2];
            row[0] = lab;
//            System.out.println("LISTING IT" +system.getUserAccountDirectory().getUserAccountList());
//            System.out.println(lab.getName());
                     for(UserAccount net : business.getUserAccountDirectory().getUserAccountList()){
                         System.out.println(net.getEmployee().getName());
         }
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(lab.getName());
            
            row[1] = ua.getUsername();
            model.addRow(row);
 
        }
        }
    }

    private void populateTableByLoc() {
        Object selectedItem = comboUpdLabLoc.getSelectedItem();
        String loc = selectedItem.toString();
        DefaultTableModel model = (DefaultTableModel) labTable.getModel();
        model.setRowCount(0);

        for (Enterprise ins : business.getEnterpriseDirectory().getEnterpriseList()) {
            if (ins.getEnterpriseType().getValue().equals("Lab") && business.getUserAccountDirectory().findUserAccount(ins.getName()).getEmployee().getLocation().equals(loc)) {
                Object[] row = new Object[2];
                row[0] = ins;

                UserAccount ua = business.getUserAccountDirectory().findUserAccount(ins.getName());
                row[1] = ua.getUsername();
                model.addRow(row);
            }
        }
    }

    private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(addrTxtFieldLab.getText());
        boolean boo = m.matches();
        return boo;
    }

    
}

