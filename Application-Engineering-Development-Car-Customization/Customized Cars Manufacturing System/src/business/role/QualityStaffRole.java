/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.ecosystem.Ecosystem;

import business.enterprise.Enterprise;
import business.enterprise.RegulatoryEnterprise;
import business.organization.Organization;
import business.organization.QualityCheckOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.qualitycheck.QualityCheckWorkAreaJPanel;

/**
 *
 * @author shrutimehta
 */
public class QualityStaffRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new QualityCheckWorkAreaJPanel(userProcessContainer, account, (QualityCheckOrganization) organization, (RegulatoryEnterprise) enterprise, business);
    }

    @Override
    public String toString() {
        return "QualityStaff"; //To change body of generated methods, choose Tools | Templates.
    }
}
