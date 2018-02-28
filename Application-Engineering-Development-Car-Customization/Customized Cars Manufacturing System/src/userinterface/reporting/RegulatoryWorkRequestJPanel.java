/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.reporting;

import business.ecosystem.Ecosystem;
import business.enterprise.CarCooperEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.RegulatoryEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.QualityCheckOrganization;
import business.organization.ReportingOrganization;
import business.useraccount.UserAccount;
import business.workqueue.OrderAtStoreWorkRequest;
import business.workqueue.RegulatoryWorkRequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutimehta
 */
public class RegulatoryWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegulatoryWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Ecosystem business;
    private Organization organization;
    
    public RegulatoryWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (ReportingOrganization) organization;
        this.account = account;
        this.enterprise = (CarCooperEnterprise) enterprise;
        this.business = business;

        valueLabel.setText(enterprise.getName());
        orgValueLabel.setText(organization.getName());
       
        populateRegulatoryTable();
    }

    public void populateRegulatoryTable() {
        DefaultTableModel model = (DefaultTableModel) regulatoryWorkRequestJTable.getModel();

        model.setRowCount(0);
        {
            for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                if (wr instanceof RegulatoryWorkRequest) {
                    Object[] row = new Object[5];
                    RegulatoryWorkRequest rwr = (RegulatoryWorkRequest) wr;
                    row[0] = rwr;
                    row[1] = rwr.getSender().getEmployee().getName();
                    row[2] = rwr.getReceiver() == null ? null : rwr.getReceiver().getEmployee().getName();
                    row[3] = rwr.getRequestDate();
                    row[4] = rwr.getStatus();
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

        backJButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        regulatoryWorkRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        orgValueLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        sendToRegulatoryJButton = new javax.swing.JButton();
        assignToMeJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(174, 238, 238));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton7ActionPerformed(evt);
            }
        });
        add(backJButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        regulatoryWorkRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        regulatoryWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestType", "Sender", "Receiver", "RequestDate", "Status"
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
        jScrollPane2.setViewportView(regulatoryWorkRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 890, 80));

        enterpriseLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 85, 30));

        enterpriseLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel2.setText("Organization:");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 26));

        orgValueLabel.setText("<value>");
        add(orgValueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 106, 26));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 106, 26));

        enterpriseLabel4.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel4.setText("Regulatory Work Requests");
        add(enterpriseLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 169, 30));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jLabel1.setText("Reporting Staff Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 118, 230, -1));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mail.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 130, 98));

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 2, 91, 68));

        sendToRegulatoryJButton.setBackground(new java.awt.Color(51, 153, 255));
        sendToRegulatoryJButton.setText("Send Report to Regulatory");
        sendToRegulatoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToRegulatoryJButtonActionPerformed(evt);
            }
        });
        add(sendToRegulatoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, 43));

        assignToMeJButton1.setBackground(new java.awt.Color(51, 153, 255));
        assignToMeJButton1.setText("Accept Request");
        assignToMeJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButton1ActionPerformed(evt);
            }
        });
        add(assignToMeJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton7ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton7ActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRegulatoryTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void sendToRegulatoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToRegulatoryJButtonActionPerformed

        int selectedRow = regulatoryWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //sending regulatory work request to regulatory with report
        RegulatoryWorkRequest request = (RegulatoryWorkRequest) regulatoryWorkRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Report Dispatched");

        account.getWorkQueue().getWorkRequestList().add(request);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof RegulatoryEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof QualityCheckOrganization) {
                            organization.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Report sent to Quality Check", "Info", JOptionPane.INFORMATION_MESSAGE);

        populateRegulatoryTable();
    }//GEN-LAST:event_sendToRegulatoryJButtonActionPerformed

    private void assignToMeJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButton1ActionPerformed
        int selectedRow = regulatoryWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        RegulatoryWorkRequest request = (RegulatoryWorkRequest) regulatoryWorkRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");

        populateRegulatoryTable();

        // TODO add your handling code here:
    }//GEN-LAST:event_assignToMeJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton1;
    private javax.swing.JButton backJButton7;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orgValueLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable regulatoryWorkRequestJTable;
    private javax.swing.JButton sendToRegulatoryJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
