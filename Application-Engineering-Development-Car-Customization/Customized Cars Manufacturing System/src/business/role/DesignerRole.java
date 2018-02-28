/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CarCooperEnterprise;
import business.enterprise.Enterprise;
import business.organization.DesignOrganization;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.designerole.DesignerWorkAreaManagementJPanel;

/**
 *
 * @author shrutimehta
 */
public class DesignerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new DesignerWorkAreaManagementJPanel(userProcessContainer, account, (DesignOrganization) organization, (CarCooperEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "Designer"; //To change body of generated methods, choose Tools | Templates.
    }
}
