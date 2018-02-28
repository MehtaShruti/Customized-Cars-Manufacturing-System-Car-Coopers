/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;
import business.enterprise.CarCooperEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.ReportingOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.reporting.ReportingWorkAreaManagementJPanel;

/**
 *
 * @author shrutimehta
 */
public class ReportingStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ReportingWorkAreaManagementJPanel(userProcessContainer, account, (ReportingOrganization) organization, (CarCooperEnterprise) enterprise, business);

    }

    @Override
    public String toString() {
        return "Reporting Staff"; //To change body of generated methods, choose Tools | Templates.
    }

}
