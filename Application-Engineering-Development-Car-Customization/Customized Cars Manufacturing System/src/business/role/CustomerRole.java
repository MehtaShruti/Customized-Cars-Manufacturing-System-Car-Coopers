/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CustomerSupportEnterprise;
import business.enterprise.Enterprise;
import business.organization.CustomerOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.customer.CustomerMainJPanel;

/**
 *
 * @author shrutimehta
 */
public class CustomerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {

        return new CustomerMainJPanel(userProcessContainer, account, (CustomerOrganization) organization, (CustomerSupportEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Customer"; //To change body of generated methods, choose Tools | Templates.
    }
}
