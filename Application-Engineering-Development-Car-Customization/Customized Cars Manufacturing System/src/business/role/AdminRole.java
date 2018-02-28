/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.administrativerole.AdminWorkAreaJPanel;

/**
 *
 * @author shrutimehta
 */
public class AdminRole extends Role {

    /**
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param enterprise
     * @param business
     * @return
     */
    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public String toString() {
        return "Admin"; //To change body of generated methods, choose Tools | Templates.
    }

}
