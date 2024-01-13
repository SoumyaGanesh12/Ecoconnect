/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.PlaceNewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malini
 */

public class orderMedHospitalJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;

    private UserAccount user;
    private EcoSystem business;
    
    private String hospitalName;
    private String docname;
    private String timings;
    private Hospital hosObj;
    
    Patient pat;
    PharmacyCatalog catalog;
    ArrayList<PharmacyCatalog> ml;
    DefaultTableModel dtm;
    ArrayList<Patient> array1;
    List<PharmacyOrder> orderItemList = new ArrayList<PharmacyOrder>();
    WorkRequest workrequest;
    private String selectedPharmacy;
    private PharamacyAdmin pharObj;
    String patName;
    PlaceNewOrderWorkRequest placeworkRequest;
    /**
     * Creates new form orderMedJpanel
     */
    public orderMedHospitalJPanel(JPanel userProcessContainer,UserAccount user,EcoSystem business,String patName) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.patName = patName;
        this.user = user;
        System.out.println("Pat"+patName);
        // MSS check
//        System.out.println("Test phar"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList());
        System.out.println("Test phar"+business.getEnterpriseDirectory().getEnterpriseList());
        
        populateComboBox();
        System.out.println(selectedPharmacy);
        //System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        System.out.println("Receiver "+business.getEnterpriseDirectory().findEnterprise(selectedPharmacy));

        System.out.println("Sender "+user);
//            System.out.println(pat.getMedicine().getMedicines().get(0));
//            txt1.setText(pat.getMedicine().getMedicines().get(0));
//            txt2.setText(pat.getMedicine().getMedicines().get(1));
//            txt3.setText(pat.getMedicine().getMedicines().get(2));
//            txt4.setText(pat.getComments());
            
    }      
            
    public void populateComboBox(){
        // MSS check
//         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
        for(Enterprise res: business.getEnterpriseDirectory().getEnterpriseList()){

            if(res.getEnterpriseType().getValue().equals("Pharmacy")){
            comboHPO.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
            public void getMenuItems(String pharName){
        dtm = (DefaultTableModel) tblmedTableHPO.getModel();
        dtm.setRowCount(0);
        // MSS check
//        pharObj = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(pharName).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharName);
        pharObj = business.getEnterpriseDirectory().findEnterprise(pharName).getOrganizationDirectory().getPharmacyAdminDirectory().findPharmacy(pharName);

        if(pharObj!=null && pharObj.getPharDir()!=null){
            for(PharmacyCatalog m : pharObj.getPharDir().getCatalog()) {
                Object row[] = new Object[2];
                row[0] = m;
                row[1] = m.getItemPrice();

                dtm.addRow(row);
            }
        }
    }

    private void populatetable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMedHPOrder.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
            if(request instanceof PlaceNewOrderWorkRequest){
        placeworkRequest = (PlaceNewOrderWorkRequest) request;
        for (PharmacyOrder orderItemTotal : placeworkRequest.getOrderTotal()){
             if(request.getSender().getUsername().equals(user.getUsername())){
                 
                System.out.println("Inside orderrrr");
                Object row[] = new Object[4];
                row[0] = placeworkRequest.getOrderId();
                row[1] = orderItemTotal.getCatalog().getItemName();
                row[2] = orderItemTotal.getCatalog().getItemPrice();
                row[3] = request.getStatus();
     

                dtm.addRow(row);
             }
             System.out.println("Request----"+request);
        }
        }
        }
    }      


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboHPO = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmedTableHPO = new javax.swing.JTable();
        btnaddcartHPO = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedHPOrder = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        btnBackHPO = new javax.swing.JButton();
        btnOrderPlace = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboHPO.setBackground(new java.awt.Color(52, 7, 116));
        comboHPO.setForeground(new java.awt.Color(255, 255, 255));
        comboHPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pharmacy" }));
        comboHPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHPOActionPerformed(evt);
            }
        });
        add(comboHPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setText("Select Pharmacy:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        tblmedTableHPO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmedTableHPO.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblmedTableHPO);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 410, 101));

        btnaddcartHPO.setBackground(new java.awt.Color(52, 7, 116));
        btnaddcartHPO.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnaddcartHPO.setForeground(new java.awt.Color(255, 255, 255));
        btnaddcartHPO.setText("ADD");
        btnaddcartHPO.setPreferredSize(new java.awt.Dimension(156, 43));
        btnaddcartHPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcartHPOActionPerformed(evt);
            }
        });
        add(btnaddcartHPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 140, 30));

        tblMedHPOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Medicine", "Price", "Status"
            }
        ));
        tblMedHPOrder.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(tblMedHPOrder);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 392, 115));

        enterpriseLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pharmacy-shop-64.png"))); // NOI18N
        enterpriseLabel.setText("HOSPITAL PHARMACY ORDER");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 510, -1));

        btnBackHPO.setBackground(new java.awt.Color(52, 7, 116));
        btnBackHPO.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackHPO.setForeground(new java.awt.Color(255, 255, 255));
        btnBackHPO.setText("<<");
        btnBackHPO.setPreferredSize(new java.awt.Dimension(80, 30));
        btnBackHPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHPOActionPerformed(evt);
            }
        });
        add(btnBackHPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        btnOrderPlace.setBackground(new java.awt.Color(52, 7, 116));
        btnOrderPlace.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnOrderPlace.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderPlace.setText("ORDER");
        btnOrderPlace.setPreferredSize(new java.awt.Dimension(156, 43));
        btnOrderPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderPlaceActionPerformed(evt);
            }
        });
        add(btnOrderPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 140, 30));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phar456.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 530, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void comboHPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHPOActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(comboHPO.getSelectedItem());
        getMenuItems(selectedPharmacy);

    }//GEN-LAST:event_comboHPOActionPerformed

    private void btnaddcartHPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcartHPOActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblmedTableHPO.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else
        {
            PharmacyCatalog item = (PharmacyCatalog) tblmedTableHPO.getValueAt(selectedRow, 0);
            boolean alreadyAdded = false;
            
            for(PharmacyOrder po : orderItemList)
            {
               if(po.getCatalog().equals(item))
               {
                alreadyAdded = true;
                break;
               }
            }
            
            if (alreadyAdded) {
                JOptionPane.showMessageDialog(null, "Medicine already added to cart!");
            } 
            else
            {
                 
                  PharmacyOrder orderItemTotal = new PharmacyOrder(item);
                  orderItemList.add(orderItemTotal);

                  System.out.println("Items");
                   for (PharmacyOrder p : orderItemList) {
                System.out.println(p.getCatalog().getItemName() + "  ");
                  }
            
            }
        }  
    }//GEN-LAST:event_btnaddcartHPOActionPerformed

    private void btnBackHPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHPOActionPerformed
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
    }//GEN-LAST:event_btnBackHPOActionPerformed

    private void btnOrderPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderPlaceActionPerformed
        // TODO add your handling code here:
        
         Boolean flag = true;
         System.out.println(selectedPharmacy); 
         // MSS check
         System.out.println("Receiver "+business.getEnterpriseDirectory().findEnterprise(selectedPharmacy));

        if (orderItemList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no medicines chosen!");
            flag = false;
        } else {
            PlaceNewOrderWorkRequest newWorkRequest = new PlaceNewOrderWorkRequest();
            newWorkRequest.setOrderTotal(new ArrayList<>(orderItemList));
            newWorkRequest.setSender(user);
            newWorkRequest.setReceiver(business.getUserAccountDirectory().findUserAccount(selectedPharmacy));
            newWorkRequest.setRequestDate(new Date());
            newWorkRequest.setStatus("Ordered");
            business.getWorkQueue().addWorkRequest(newWorkRequest);
            System.out.println("Work req size"+business.getWorkQueue().getWorkRequestList().size());
            System.out.println("Sender000"+newWorkRequest.getSender());
            System.out.println("Receiver000"+newWorkRequest.getReceiver());
            System.out.println(newWorkRequest.getRequestDate());
            System.out.println(newWorkRequest.getStatus());
            
            orderItemList.clear();
            //addcartBtnHPO.setVisible(false);
        }
        populatetable();
    }//GEN-LAST:event_btnOrderPlaceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackHPO;
    private javax.swing.JButton btnOrderPlace;
    private javax.swing.JButton btnaddcartHPO;
    private javax.swing.JComboBox<String> comboHPO;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMedHPOrder;
    private javax.swing.JTable tblmedTableHPO;
    // End of variables declaration//GEN-END:variables
}
