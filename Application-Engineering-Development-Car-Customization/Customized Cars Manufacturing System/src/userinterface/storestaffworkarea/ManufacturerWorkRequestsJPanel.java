/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.storestaffworkarea;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import business.workqueue.CustomerCustomizedWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutimehta
 */
public class ManufacturerWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkRequestsJPanel
     */
       private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;

    public ManufacturerWorkRequestsJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = (StoreOrganization) organization;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.business = business;
        
        populateManufacturerWorkRequestTable();
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }
    
     public void populateManufacturerWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) manufacturerWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerCustomizedWorkRequest) {
                Object[] row = new Object[5];
                CustomerCustomizedWorkRequest cw = (CustomerCustomizedWorkRequest) wr;
                row[0] = cw;
                row[1] = cw.getManufacturerSender()== null ? null : cw.getManufacturerSender().getEmployee().getName();
                row[2] = cw.getStoreReceiver() == null ? null : cw.getStoreReceiver().getEmployee().getName();
                row[3] = cw.getRequestDate();
                row[4] = cw.getStatus();
                model.addRow(row);
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

        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        manufacturerWorkRequestJTable = new javax.swing.JTable();
        assignJButton1 = new javax.swing.JButton();
        sendToCustomerJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(175, 238, 238));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 68, 61));

        enterpriseLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 85, 30));

        enterpriseLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel2.setText("Organization:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 96, -1, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 76, 106, 30));

        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 96, 106, 30));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mail.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 130, 98));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jLabel1.setText("Store Staff Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 118, 230, -1));

        enterpriseLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel3.setText("Manufacturer's Requests");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 169, 30));

        manufacturerWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manufacturerWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(manufacturerWorkRequestJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 890, 80));

        assignJButton1.setBackground(new java.awt.Color(51, 153, 255));
        assignJButton1.setText("Accept Request");
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });
        add(assignJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 157, 43));

        sendToCustomerJButton.setBackground(new java.awt.Color(51, 153, 255));
        sendToCustomerJButton.setText("<<Send to Customer");
        sendToCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCustomerJButtonActionPerformed(evt);
            }
        });
        add(sendToCustomerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 170, 43));

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 2, 91, 68));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        int selectedRow = manufacturerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) manufacturerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStoreReceiver(userAccount);
        request.setStatus("Order Completed");
        populateManufacturerWorkRequestTable();
    }//GEN-LAST:event_assignJButton1ActionPerformed

    private void sendToCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCustomerJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = manufacturerWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        //adding values to the customer customized work request
        CustomerCustomizedWorkRequest request = (CustomerCustomizedWorkRequest) manufacturerWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Order Ready");
        request.setStoreSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CustomerOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        populateManufacturerWorkRequestTable();
        JOptionPane.showMessageDialog(null, "Order sent to Customer", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sendToCustomerJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        
        populateManufacturerWorkRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable manufacturerWorkRequestJTable;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendToCustomerJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
