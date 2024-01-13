/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookAppointment;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewPresJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPresJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount user;
    private EcoSystem business;
    String docName;
    
    public ViewPresJPanel(JPanel userProcessContainer,UserAccount user,EcoSystem business, String docName) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.user = user;
        this.docName = docName;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViewPres = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 7, 116));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-medical-history-64.png"))); // NOI18N
        jLabel1.setText("Prescription");

        tblViewPres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Doctor", "Medicine 1", "Medicine 2", "Medicine 3", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblViewPres.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tblViewPres);
        if (tblViewPres.getColumnModel().getColumnCount() > 0) {
            tblViewPres.getColumnModel().getColumn(0).setResizable(false);
            tblViewPres.getColumnModel().getColumn(1).setResizable(false);
            tblViewPres.getColumnModel().getColumn(2).setResizable(false);
            tblViewPres.getColumnModel().getColumn(3).setResizable(false);
            tblViewPres.getColumnModel().getColumn(4).setResizable(false);
            tblViewPres.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/patImg.jpeg"))); // NOI18N
        jLabel5.setOpaque(true);

        jButton6.setBackground(new java.awt.Color(52, 7, 116));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("<<");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 554, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(113, Short.MAX_VALUE))
        );
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
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblViewPres;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
//        DefaultTableModel dtm = (DefaultTableModel) tblViewPres.getModel();
//        dtm.setRowCount(0);
//       
//        for(WorkRequest wq : business.getWorkQueue().findWorkRequestByRec(user)) {
//            if(wq instanceof BookAppointment){
//                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
//                System.out.println("comments --" + ((BookAppointment) wq).getComments());
//                System.out.println("check med for pat -- "+((BookAppointment) wq).getMeds().getMedicines().get(0));
//           Object row[] = new Object[5];
//            row[0] = docName;
//            row[1] = ((BookAppointment) wq).getMeds().getMedicines().get(0);
//            row[2] = ((BookAppointment) wq).getMeds().getMedicines().get(1);
//            row[3] = ((BookAppointment) wq).getMeds().getMedicines().get(2);
//            row[4]=((BookAppointment) wq).getComments();
//            dtm.addRow(row);
//            }}}
    
//        for(WorkRequest wq : business.getWorkQueue().findWorkRequestByRec(user)) {
//            if(wq instanceof BookAppointment){
//                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
//                    System.out.println("comm" + ((BookAppointment) wq).getComments());
//                    lblDocName.setText(docName);
//                    lblPatNamePres.setText(wq.getSender().getEmployee().getName());
//                    lblPatm1Pres.setText(((BookAppointment) wq).getMeds().getMedicines().get(0));
//                    lblPatm2Pres.setText(((BookAppointment) wq).getMeds().getMedicines().get(1));
//                    lblPatm3Pres.setText(((BookAppointment) wq).getMeds().getMedicines().get(2));
//                    txtAreaPatCPres.setText(((BookAppointment) wq).getComments());
//                }
//            }
//        }
        

DefaultTableModel dtm = (DefaultTableModel) tblViewPres.getModel();
    dtm.setRowCount(0);

    for (WorkRequest wq : business.getWorkQueue().findWorkRequestByRec(user)) {
        if (wq instanceof BookAppointment) {
            if (wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())) {
                
                List<String> medicines = ((BookAppointment) wq).getMeds().getMedicines();

                Object row[] = new Object[5];
                row[0] = ((BookAppointment) wq).getReceiver().getEmployee().getName();
                
                // Check if medicines list has at least 3 elements before accessing them
                if (medicines.size() > 0) {
                    row[1] = medicines.get(0);
                } else {
                    row[1] = "";
                }
                if (medicines.size() > 1) {
                    row[2] = medicines.get(1);
                } else {
                    row[2] = "";
                }
                if (medicines.size() > 2) {
                    row[3] = medicines.get(2);
                } else {
                    row[3] = "";
                }

                row[4] = ((BookAppointment) wq).getComments();
                dtm.addRow(row);
            }
        }
    }
    }
}
