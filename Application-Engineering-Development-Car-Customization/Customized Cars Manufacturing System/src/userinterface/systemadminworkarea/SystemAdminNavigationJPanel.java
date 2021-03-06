/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadminworkarea;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author shrutimehta
 */
public class SystemAdminNavigationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminNavigationJPanel
     */
    JPanel userProcessContainer;
    Ecosystem system;

    public SystemAdminNavigationJPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTree();
    }

    public void populateTree() {

        DefaultTreeModel model = (DefaultTreeModel) JTree.getModel();

        ArrayList<Network> networkList = system.getNetworkList();
        System.out.println("userinterface" + networkList.size());
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            // if(network.getEnterpriseDirectory() != null)
            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                //   if(enterprise.getOrganizationDirectory() != null)
                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageNetworkJButton = new javax.swing.JButton();
        enterpriseAdminJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();
        selectedNodeJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        manageEnterpriseJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkJButton.setBackground(new java.awt.Color(102, 204, 255));
        manageNetworkJButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        manageNetworkJButton.setText("Network");
        manageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkJButtonActionPerformed(evt);
            }
        });
        add(manageNetworkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 115, 148));

        enterpriseAdminJButton.setBackground(new java.awt.Color(0, 204, 204));
        enterpriseAdminJButton.setFont(new java.awt.Font("ITF Devanagari", 1, 14)); // NOI18N
        enterpriseAdminJButton.setText("Enterprise Admin");
        enterpriseAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseAdminJButtonActionPerformed(evt);
            }
        });
        add(enterpriseAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 229, 86));

        jLabel1.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jLabel1.setText("System Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 212, -1));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 18)); // NOI18N
        jLabel2.setText("Management");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        JTree.setBackground(new java.awt.Color(163, 228, 244));
        JTree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTreevalueChangedAction(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 155, 333));

        selectedNodeJLabel.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        selectedNodeJLabel.setText("<view_selected_node>");
        add(selectedNodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        jLabel3.setText("Selected Node:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        manageEnterpriseJButton.setBackground(new java.awt.Color(51, 153, 255));
        manageEnterpriseJButton.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 14)); // NOI18N
        manageEnterpriseJButton.setText("Enterprise");
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });
        add(manageEnterpriseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 108, 148));
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseAdminJButtonActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enterpriseAdminJButtonActionPerformed

    private void manageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkJButtonActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkJButtonActionPerformed

    private void JTreevalueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTreevalueChangedAction
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) JTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_JTreevalueChangedAction

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JButton enterpriseAdminJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JButton manageNetworkJButton;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
