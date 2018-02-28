/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CarEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.CarCompanyStaffOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.carstaffworkarea.CarStaffWorkAreaManagementJPanel;

/**
 *
 * @author shrutimehta
 */
public class CarCompanyStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {

        return new CarStaffWorkAreaManagementJPanel(userProcessContainer, account, (CarCompanyStaffOrganization) organization, (CarEnterprise) enterprise, business);

    }

    @Override
    public String toString() {
        return "Car Company Staff"; //To change body of generated methods, choose Tools | Templates.
    }
}
