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
import business.workqueue.OrderAtStoreWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutimehta
 */
public class StoreOrdersWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreOrdersWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private StoreOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;

    public StoreOrdersWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (StoreOrganization) organization;
        this.userAccount = account;
        this.business = business;
        
        populateStoreTable();
        
        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
    }

    public void populateStoreTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof OrderAtStoreWorkRequest) {
                    Object[] row = new Object[5];
                    OrderAtStoreWorkRequest oas = (OrderAtStoreWorkRequest) wr;
                    row[0] = oas;
                    row[1] = oas.getSender().getEmployee().getName();
                    row[2] = oas.getReceiver() == null ? null : oas.getReceiver().getEmployee().getName();
                    row[3] = oas.getRequestDate();
                    row[4] = oas.getStatus();
                    model.addRow(row);

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

        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        sendToCustomerJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        assignToMeJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(173, 238, 238));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 2, 91, 63));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 69, 63));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jLabel1.setText("Store Staff Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 230, -1));

        enterpriseLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 97, 127, 18));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 26));

        enterpriseLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel3.setText("Store Order Requests");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 268, 169, 30));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 820, 111));

        sendToCustomerJButton.setBackground(new java.awt.Color(51, 153, 255));
        sendToCustomerJButton.setText("Send Confirmation to Customer");
        sendToCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToCustomerJButtonActionPerformed(evt);
            }
        });
        add(sendToCustomerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, 43));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mail.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 8, -1, 98));

        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

        enterpriseLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 26));

        assignToMeJButton1.setBackground(new java.awt.Color(51, 153, 255));
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });
        add(assignToMeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateStoreTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sendToCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToCustomerJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderAtStoreWorkRequest request = (OrderAtStoreWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Order Processed");
        request.setSender(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CustomerOrganization) {
                organization.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        JOptionPane.showMessageDialog(null, "Order sent to Customer", "Info", JOptionPane.INFORMATION_MESSAGE);

        populateStoreTable();

    }//GEN-LAST:event_sendToCustomerJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        OrderAtStoreWorkRequest request = (OrderAtStoreWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setReceiver(userAccount);
        request.setStatus("Pending");

        populateStoreTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton sendToCustomerJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
