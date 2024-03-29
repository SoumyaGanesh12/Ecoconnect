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
public class UpdateDeletePharmacy extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDeletePharmacy
     */
    JPanel userProcessContainer;
    EcoSystem business;
    UserAccount user;
    public UpdateDeletePharmacy(JPanel userProcessContainer, EcoSystem business, UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        populateTable();
//        if(system.getNetworkList().size()>0 ){
//            populateTable();
//        }else{
//             JOptionPane.showMessageDialog(null, "No Pharmacy added");
//        }
        
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
        phTable = new javax.swing.JTable();
        btnUpdPh = new javax.swing.JButton();
        btnDelPh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameTxtFieldPh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addrTxtFieldPh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdBackPhar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboLocUpdPh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        phTable.setModel(new javax.swing.table.DefaultTableModel(
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
        phTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        phTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(phTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 110));

        btnUpdPh.setBackground(new java.awt.Color(52, 7, 116));
        btnUpdPh.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdPh.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdPh.setText("UPDATE");
        btnUpdPh.setPreferredSize(new java.awt.Dimension(156, 43));
        btnUpdPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdPhActionPerformed(evt);
            }
        });
        add(btnUpdPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 110, 30));

        btnDelPh.setBackground(new java.awt.Color(52, 7, 116));
        btnDelPh.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDelPh.setForeground(new java.awt.Color(255, 255, 255));
        btnDelPh.setText("DELETE");
        btnDelPh.setPreferredSize(new java.awt.Dimension(156, 43));
        btnDelPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelPhActionPerformed(evt);
            }
        });
        add(btnDelPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 110, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 7, 116));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 70, -1));

        nameTxtFieldPh.setPreferredSize(new java.awt.Dimension(164, 30));
        add(nameTxtFieldPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 150, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 7, 116));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 80, -1));

        addrTxtFieldPh.setPreferredSize(new java.awt.Dimension(164, 30));
        add(addrTxtFieldPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 150, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(52, 7, 116));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Location");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 80, 20));

        btnUpdBackPhar.setBackground(new java.awt.Color(52, 7, 116));
        btnUpdBackPhar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdBackPhar.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdBackPhar.setText("<<");
        btnUpdBackPhar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnUpdBackPhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdBackPharActionPerformed(evt);
            }
        });
        add(btnUpdBackPhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pharmacy-shop-64.png"))); // NOI18N
        jLabel5.setText("PHARMACY DETAILS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 540, 70));

        comboLocUpdPh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show All", "Brigham", "Cambridge", "Brookline", "Longwood", "Fenway" }));
        comboLocUpdPh.setPreferredSize(new java.awt.Dimension(140, 30));
        comboLocUpdPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLocUpdPhActionPerformed(evt);
            }
        });
        add(comboLocUpdPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 170, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phar123.jpg"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 360, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void phTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) phTable.getModel();

        String name = dtm.getValueAt(phTable.getSelectedRow(), 0).toString();
        String address = dtm.getValueAt(phTable.getSelectedRow(), 1).toString();
        nameTxtFieldPh.setText(name);
        addrTxtFieldPh.setText(address);
    }//GEN-LAST:event_phTableMouseClicked

    private void btnUpdPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdPhActionPerformed
        // TODO add your handling code here:

        int selectedRow = phTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            //            updateJPanel.setVisible(true);
            //            System.out.println("I am here");
            Object selectedItem = comboLocUpdPh.getSelectedItem();
            String loc = selectedItem.toString();
            //    for(Enterprise lab: system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()){
                //        if lab.getName().equals(selectedItem)
                //    }
            Enterprise lab = (Enterprise) phTable.getValueAt(selectedRow, 0);
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(lab.getName());
            if (!nameTxtFieldPh.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                nameTxtFieldPh.setText("");
                return;
            }
            else if (strongUsername() == false) {

                addrTxtFieldPh.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }
            else {
            }
            lab.setName(nameTxtFieldPh.getText());
            ua.getEmployee().setName(nameTxtFieldPh.getText());
            ua.setUsername(addrTxtFieldPh.getText());
            populateTable();
            nameTxtFieldPh.setText("");
            addrTxtFieldPh.setText("");
        }
    }//GEN-LAST:event_btnUpdPhActionPerformed

    private void btnDelPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelPhActionPerformed
        // TODO add your handling code here:

        Object selectedItem = comboLocUpdPh.getSelectedItem();
        String loc = selectedItem.toString();
        int selectedRow = phTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Enterprise lab = (Enterprise) phTable.getValueAt(selectedRow, 0);
            business.getEnterpriseDirectory().getEnterpriseList().remove(lab);
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(lab.getName());
            business.getUserAccountDirectory().getUserAccountList().remove(ua);

            //            LabDirectory ld = system.getLabDirectory();
            //            ld.deleteLab(l);
            JOptionPane.showMessageDialog(null, "Pharmacy " + nameTxtFieldPh.getText() + " deleted");
            populateTable();
            nameTxtFieldPh.setText("");
            addrTxtFieldPh.setText("");

        }
    }//GEN-LAST:event_btnDelPhActionPerformed

    private void btnUpdBackPharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdBackPharActionPerformed
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
    }//GEN-LAST:event_btnUpdBackPharActionPerformed

    private void comboLocUpdPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLocUpdPhActionPerformed
        // TODO add your handling code here:
        Object selectedItem = comboLocUpdPh.getSelectedItem();
        String loc = selectedItem.toString();
        if(loc.equals("Show All")){
            populateTable();
        }else{
            populateTableByLoc();
        }
    }//GEN-LAST:event_comboLocUpdPhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrTxtFieldPh;
    private javax.swing.JButton btnDelPh;
    private javax.swing.JButton btnUpdBackPhar;
    private javax.swing.JButton btnUpdPh;
    private javax.swing.JComboBox<String> comboLocUpdPh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtFieldPh;
    private javax.swing.JTable phTable;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        
        Object selectedItem = comboLocUpdPh.getSelectedItem();
        String loc = selectedItem.toString();
        DefaultTableModel model = (DefaultTableModel) phTable.getModel();
        model.setRowCount(0);
//        System.out.println("Ap was here " +city);
//        System.out.println("ap here " +system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList());
                for(Enterprise phar: business.getEnterpriseDirectory().getEnterpriseList()){
                     System.out.println(phar.getEnterpriseType().getValue().equals("Pharmacy"));
                     System.out.println(phar.getUserAccountDirectory().getUserAccountList());
                     System.out.println(phar.getName());
                     System.out.println(phar.getUserAccountDirectory().findUserAccount(phar.getName()));
                if(phar.getEnterpriseType().getValue().equals("Pharmacy")){
            Object[] row = new Object[2];
            row[0] = phar;
//            System.out.println("LISTING IT" +system.getUserAccountDirectory().getUserAccountList());
//            System.out.println(phar.getName());
                     for(UserAccount ua : business.getUserAccountDirectory().getUserAccountList()){
                         System.out.println(ua.getEmployee().getName());
         }
            UserAccount ua = business.getUserAccountDirectory().findUserAccount(phar.getName());
            
            row[1] = ua.getUsername();
            model.addRow(row);
 
        }
                }
    }

    private void populateTableByLoc() {
        Object selectedItem = comboLocUpdPh.getSelectedItem();
        String loc = selectedItem.toString();
        DefaultTableModel model = (DefaultTableModel) phTable.getModel();
        model.setRowCount(0);

        for (Enterprise ins : business.getEnterpriseDirectory().getEnterpriseList()) {
            if (ins.getEnterpriseType().getValue().equals("Pharmacy") && business.getUserAccountDirectory().findUserAccount(ins.getName()).getEmployee().getLocation().equals(loc)) {
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
        Matcher m = pat.matcher(addrTxtFieldPh.getText());
        boolean boo = m.matches();
        return boo;
    }

   
}
