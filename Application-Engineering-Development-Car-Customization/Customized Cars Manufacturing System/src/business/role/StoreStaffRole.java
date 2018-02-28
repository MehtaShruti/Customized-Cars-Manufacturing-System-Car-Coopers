/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CustomerSupportEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.StoreOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.storestaffworkarea.StoreStaffWorkAreaManagement;

/**
 *
 * @author shrutimehta
 */
public class StoreStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new StoreStaffWorkAreaManagement(userProcessContainer, account, (StoreOrganization) organization, (CustomerSupportEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Store"; //To change body of generated methods, choose Tools | Templates.
    }
}
