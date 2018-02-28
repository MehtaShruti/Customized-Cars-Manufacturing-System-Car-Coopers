/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.carstaffworkarea;

import business.customer.CompanyCar;
import business.customer.CompanyCarCatalog;
import business.ecosystem.Ecosystem;
import business.enterprise.CarEnterprise;
import business.enterprise.CustomerSupportEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.CarCompanyStaffOrganization;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import business.workqueue.CarCompanyWorkRequest;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrutimehta
 */
public class CarStaffWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarStaffWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem business;

    public CarStaffWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (CarCompanyStaffOrganization) organization;
        this.account = account;
        this.enterprise = (CarEnterprise) enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        valueLabel1.setText(organization.getName());
        populateTable();

    }

    private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (enterprise instanceof CustomerSupportEnterprise) {
                    for (Organization storeOrganization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (storeOrganization instanceof StoreOrganization) {
                            CompanyCarCatalog ccc = ((StoreOrganization) storeOrganization).getCcc();

                            for (CompanyCar cc : ccc.getListOfCompanyCars()) {
                                Object[] row = new Object[5];
                                row[0] = cc.getCompanyCarId();
                                row[1] = cc.getBrand();
                                row[2] = cc.getModelNumber();
                                row[3] = cc.getQuantity();
                                row[4] = cc.getPrice();
                                dtm.addRow(row);

                            }
                        }
                    }
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

        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        createCarModelJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel2 = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        brandJComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        modelNumberJComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        valueLabel1 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        createCarModelJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(195, 238, 238));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        enterpriseLabel.setText("Management");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 161, 30));

        enterpriseLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        enterpriseLabel1.setText("Car Staff Work Area ");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 242, 30));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CarCompanyID", "Brand", "Model Number", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 537, 111));

        createCarModelJButton.setBackground(new java.awt.Color(102, 153, 255));
        createCarModelJButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        createCarModelJButton.setText("Create Car Model");
        createCarModelJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createCarModelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCarModelJButtonActionPerformed(evt);
            }
        });
        add(createCarModelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        valueLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, 26));

        enterpriseLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel2.setText("Enterprise :");
        add(enterpriseLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 30));

        refreshTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 69, 69));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 67, 65));

        brandJComboBox.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        brandJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tesla", "Volkswagon" }));
        brandJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        brandJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandJComboBoxActionPerformed(evt);
            }
        });
        add(brandJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 150, -1));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel1.setText("Brand");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel3.setText("Model Number");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        modelNumberJComboBox.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        modelNumberJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T78", "X67", "Y89", "E45", "T56", "Y67" }));
        modelNumberJComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        modelNumberJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNumberJComboBoxActionPerformed(evt);
            }
        });
        add(modelNumberJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 150, -1));

        jLabel4.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        quantityJTextField.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        quantityJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 150, -1));

        valueLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        valueLabel1.setText("<value>");
        add(valueLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 124, 180, -1));

        enterpriseLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        enterpriseLabel3.setText("Organization:");
        add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        createCarModelJButton1.setBackground(new java.awt.Color(102, 153, 255));
        createCarModelJButton1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        createCarModelJButton1.setText("Sell Car Request");
        createCarModelJButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        createCarModelJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCarModelJButton1ActionPerformed(evt);
            }
        });
        add(createCarModelJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createCarModelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCarModelJButtonActionPerformed

        CompanyCar companyCar = null;

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (enterprise instanceof CustomerSupportEnterprise) {
                    for (Organization storeOrganization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (storeOrganization instanceof StoreOrganization) {
                            CompanyCarCatalog ccc = ((StoreOrganization) storeOrganization).getCcc();

                            companyCar = ccc.addCompanyCar();

                        }

                        if (companyCar != null) {
                            float price = 0;

                            companyCar.setBrand(brandJComboBox.getSelectedItem().toString());
                            companyCar.setModelNumber((modelNumberJComboBox.getSelectedItem().toString()));
                            companyCar.setQuantity(Integer.parseInt(quantityJTextField.getText()));

                            if (companyCar.getBrand().equalsIgnoreCase("Tesla")) {
                                if (companyCar.getModelNumber().equalsIgnoreCase("T78")) {
                                    price = price + 24780;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("X67")) {
                                    price = price + 15700;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("Y89")) {
                                    price = price +43009;
                                }
                                 if (companyCar.getModelNumber().equalsIgnoreCase("T56")) {
                                    price = price + 22000;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("E45")) {
                                    price = price + 16150;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("Y67")) {
                                    price = price + 36000;
                                }
                                 if (companyCar.getModelNumber().equalsIgnoreCase("T78")) {
                                    price = price + 61600;
                                }
                            }
                            if (companyCar.getBrand().equalsIgnoreCase("Volkswagon")) {
                                if (companyCar.getModelNumber().equalsIgnoreCase("T56")) {
                                    price = price + 14000;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("E45")) {
                                    price = price + 23500;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("Y67")) {
                                    price = price + 36000;
                                }
                                 if (companyCar.getModelNumber().equalsIgnoreCase("T78")) {
                                    price = price + 15000;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("X67")) {
                                    price = price + 25000;
                                }
                                if (companyCar.getModelNumber().equalsIgnoreCase("Y89")) {
                                    price = price + 32000;
                                }
                            }

                            companyCar.setPrice(price);
                        }
                    }

                }
            }
        }

        populateTable();


    }//GEN-LAST:event_createCarModelJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateTable();


    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void brandJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandJComboBoxActionPerformed

        final DefaultComboBoxModel teslaModelNumberJComboBox = new DefaultComboBoxModel(new String[]{"T78", "E45", "Y89"});
        final DefaultComboBoxModel vwModelNumberJComboBox = new DefaultComboBoxModel(new String[]{"T56", "E45", "Y67"});

        brandJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (brandJComboBox.getSelectedItem().equals("Tesla")) {
                    modelNumberJComboBox.setModel(teslaModelNumberJComboBox);

                } else {
                    modelNumberJComboBox.setModel(vwModelNumberJComboBox);
                }

            }

        });
    }//GEN-LAST:event_brandJComboBoxActionPerformed

    private void modelNumberJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNumberJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNumberJComboBoxActionPerformed

    private void createCarModelJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCarModelJButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first ", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }

        int ccId = (int) workRequestJTable.getValueAt(selectedRow, 0);
        CompanyCar cc = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                if (enterprise instanceof CustomerSupportEnterprise) {
                    for (Organization storeOrganization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                        if (storeOrganization instanceof StoreOrganization) {
                            CompanyCarCatalog ccc = ((StoreOrganization) storeOrganization).getCcc();
                            for (CompanyCar c : ccc.getListOfCompanyCars()) {
                                if (c.getCompanyCarId() == ccId) {
                                    cc = c;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        CarCompanyWorkRequest ccswr = new CarCompanyWorkRequest();
        ccswr.setCompanyCar(cc);
        ccswr.setSender(account);
        ccswr.setStatus("Sent to Store");
        account.getWorkQueue().getWorkRequestList().add(ccswr);

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof CustomerSupportEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof StoreOrganization) {

                            organization.getWorkQueue().getWorkRequestList().add(ccswr);

                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Car sent to Store", "Information!!", JOptionPane.WARNING_MESSAGE);


    }//GEN-LAST:event_createCarModelJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> brandJComboBox;
    private javax.swing.JButton createCarModelJButton;
    private javax.swing.JButton createCarModelJButton1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> modelNumberJComboBox;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
