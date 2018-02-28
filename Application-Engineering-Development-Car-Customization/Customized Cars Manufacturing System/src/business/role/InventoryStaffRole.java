/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CarCooperEnterprise;
import business.enterprise.Enterprise;
import business.organization.InventoryOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.inventoryrole.InventoryWorkAreaManagementJPanel;

/**
 *
 * @author shrutimehta
 */
public class InventoryStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new InventoryWorkAreaManagementJPanel(userProcessContainer, account, (InventoryOrganization) organization, (CarCooperEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Inventory Staff"; //To change body of generated methods, choose Tools | Templates.
    }
}
