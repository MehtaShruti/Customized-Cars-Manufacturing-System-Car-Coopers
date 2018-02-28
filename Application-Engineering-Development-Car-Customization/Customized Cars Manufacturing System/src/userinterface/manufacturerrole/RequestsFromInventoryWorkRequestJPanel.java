/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.manufacturerrole;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.ManufactureOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.workqueue.InventoryWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutimehta
 */
public class RequestsFromInventoryWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ManufactureOrganization organization;
    private UserAccount userAccount;
    private Ecosystem business;

    public RequestsFromInventoryWorkRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = (ManufactureOrganization) organization;
        this.userAccount = userAccount;
        this.business = business;

        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
        populateInventoryWorkRequestTable();
    }

    public void populateInventoryWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) inventoryWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof InventoryWorkRequest) {
                Object[] row = new Object[6];
                InventoryWorkRequest iwr = (InventoryWorkRequest) wr;
                row[0] = iwr;
                row[1] = iwr.getItemCount();
                row[2] = iwr.getInventorySenderInv() == null ? null : iwr.getInventorySenderInv().getEmployee().getName();
                row[3] = iwr.getManufacturerReceiverInv() == null ? null : iwr.getManufacturerReceiverInv().getEmployee().getName();
                row[4] = iwr.getRequestDate();
                row[5] = iwr.getStatus();
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
        enterpriseLabel1 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryWorkRequestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        assignToMeJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(180, 238, 238));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 69, 65));

        enterpriseLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        enterpriseLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel1.setText("Organization:");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 26));

        orgValueLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 87, 26));

        valueLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 87, 26));

        inventoryWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemName", "ItemCount", "Sender", "Receiver", "RequestDate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryWorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 631, 97));

        jLabel4.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel4.setText("Management");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 144, 44));

        jLabel5.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel5.setText("Manufacturer Work Area ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 330, -1));

        assignToMeJButton.setBackground(new java.awt.Color(102, 153, 255));
        assignToMeJButton.setText("Accept Request");
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
            }
        });
        add(assignToMeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, 49));

        jLabel6.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel6.setText("Inventory Work Queue");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 157, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = inventoryWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        InventoryWorkRequest request = (InventoryWorkRequest) inventoryWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setManufacturerReceiverInv(userAccount);
        request.setStatus("Accepted");
        populateInventoryWorkRequestTable();
    }//GEN-LAST:event_assignToMeJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JTable inventoryWorkRequestJTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
