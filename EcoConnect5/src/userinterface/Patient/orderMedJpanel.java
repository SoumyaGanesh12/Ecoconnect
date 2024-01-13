/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.Enterprise;
import Business.HospitalAdmin.Hospital;
import Business.Patient.Patient;
import Business.Pharmacist.PharamacyAdmin;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.PharmacyOrder;
import Business.WorkQueue.PlaceNewOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
//import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Malini
 */
public class orderMedJpanel extends javax.swing.JPanel {
    
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
    
     public orderMedJpanel(JPanel userProcessContainer,UserAccount user,EcoSystem business,String patName) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.patName = patName;
        this.user = user;
        this.ml = new ArrayList<>();
        System.out.println("Pat"+patName);
        // MSS check
//        System.out.println("Test phar"+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList());
        System.out.println("Test phar"+business.getEnterpriseDirectory().getEnterpriseList());
        
populateComboBox();
        System.out.println(selectedPharmacy);
//        System.out.println("Receiver "+system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        System.out.println("Receiver "+business.getEnterpriseDirectory().findEnterprise(selectedPharmacy));
        
System.out.println("Sender "+user);
        //tableListener();
//            System.out.println(pat.getMedicine().getMedicines().get(0));
//            txt1.setText(pat.getMedicine().getMedicines().get(0));
//            txt2.setText(pat.getMedicine().getMedicines().get(1));
//            txt3.setText(pat.getMedicine().getMedicines().get(2));
//            txt4.setText(pat.getComments());
            
    }      
            
    public void populateComboBox(){
        // MSS check
                 for(Enterprise res: business.getEnterpriseDirectory().getEnterpriseList()){

//         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Pharmacy")){
            pharmacyCom.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
            public void getMenuItems(String pharName){
        dtm = (DefaultTableModel) tblmed.getModel();
        dtm.setRowCount(0);

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
        DefaultTableModel dtm = (DefaultTableModel) tblMedorder.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request : business.getWorkQueue().getWorkRequestList()){
            if(request instanceof PlaceNewOrderWorkRequest){
        placeworkRequest = (PlaceNewOrderWorkRequest) request;
        for (PharmacyOrder orderItemTotal : placeworkRequest.getOrderTotal()){
             if(request.getSender().getUsername().equals(user.getUsername())){
                Object row[] = new Object[5];
                row[0] = placeworkRequest.getOrderId();
                row[1] = orderItemTotal.getCatalog().getItemName();
                row[2] = orderItemTotal.getCatalog().getItemPrice();
                row[3] = request.getStatus();
     

                dtm.addRow(row);
             }
             System.out.println(request);
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

        orderBtn = new javax.swing.JButton();
        pharmacyCom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmed = new javax.swing.JTable();
        addcartBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedorder = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderBtn.setBackground(new java.awt.Color(52, 7, 116));
        orderBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("ORDER");
        orderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });
        add(orderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 140, 30));

        pharmacyCom.setForeground(new java.awt.Color(255, 255, 255));
        pharmacyCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pharmacy" }));
        pharmacyCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComActionPerformed(evt);
            }
        });
        add(pharmacyCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 147, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 7, 116));
        jLabel5.setText("Pharmacy:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, 20));

        tblmed.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmed.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblmed);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 325, 101));

        addcartBtn.setBackground(new java.awt.Color(52, 7, 116));
        addcartBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        addcartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addcartBtn.setText("ADD");
        addcartBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        addcartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartBtnActionPerformed(evt);
            }
        });
        add(addcartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 150, 30));

        tblMedorder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMedorder.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(tblMedorder);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 330, 100));

        enterpriseLabel.setBackground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(52, 7, 116));
        enterpriseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-order-64.png"))); // NOI18N
        enterpriseLabel.setText("PATIENT PHARMACY ORDER ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 380, 50));

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
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/docImg2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 1330, 1040));
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        // TODO add your handling code here:
        Boolean flag = true;
        System.out.println(selectedPharmacy);
        System.out.println("Receiver "+business.getEnterpriseDirectory().findEnterprise(selectedPharmacy));

        if (orderItemList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: There are no tests chosen!");
            flag = false;
        } else {
            PlaceNewOrderWorkRequest newWorkRequest = new PlaceNewOrderWorkRequest();
            newWorkRequest.setOrderTotal(new ArrayList<>(orderItemList));
            newWorkRequest.setSender(user);
            newWorkRequest.setReceiver(business.getUserAccountDirectory().findUserAccount(selectedPharmacy));
            newWorkRequest.setRequestDate(new Date());
            newWorkRequest.setStatus("Ordered");
            business.getWorkQueue().addWorkRequest(newWorkRequest);
            //            System.out.println("Work req size"+system.getWorkQueue().getWorkRequestList().size());
            //            System.out.println("Sender000"+newWorkRequest.getSender());
            //            System.out.println("Receiver000"+newWorkRequest.getReceiver());
            //            System.out.println(newWorkRequest.getRequestDate());
            //            System.out.println(newWorkRequest.getStatus());
            
           orderItemList.clear();
        }
        populatetable();
        
    }//GEN-LAST:event_orderBtnActionPerformed

    private void pharmacyComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComActionPerformed
        // TODO add your handling code here:
        selectedPharmacy = String.valueOf(pharmacyCom.getSelectedItem());
        getMenuItems(selectedPharmacy);

    }//GEN-LAST:event_pharmacyComActionPerformed

    private void addcartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartBtnActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblmed.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "You must select a row first!");
        } else {
            PharmacyCatalog item = (PharmacyCatalog) tblmed.getValueAt(selectedRow, 0);
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
    }//GEN-LAST:event_addcartBtnActionPerformed

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
    private javax.swing.JButton addcartBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton orderBtn;
    private javax.swing.JComboBox<String> pharmacyCom;
    private javax.swing.JTable tblMedorder;
    private javax.swing.JTable tblmed;
    // End of variables declaration//GEN-END:variables
}
