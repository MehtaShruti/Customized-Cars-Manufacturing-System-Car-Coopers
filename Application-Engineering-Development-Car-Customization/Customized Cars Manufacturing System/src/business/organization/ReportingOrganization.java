/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.barchartsample.Report;
import business.role.Role;
import business.role.ReportingStaffRole;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class ReportingOrganization extends Organization {

    public ReportingOrganization() {
        super(Organization.Type.Reporting.getValue());
    }

    private Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReportingStaffRole());
        return roles;
    }
}
