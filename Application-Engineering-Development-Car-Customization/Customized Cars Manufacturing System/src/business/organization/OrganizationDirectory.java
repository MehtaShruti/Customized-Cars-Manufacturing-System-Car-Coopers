/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Design.getValue())) {
            organization = new DesignOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Manufacture.getValue())) {
            organization = new ManufactureOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Reporting.getValue())) {
            organization = new ReportingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Inventory.getValue())) {
            organization = new InventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Store.getValue())) {
            organization = new StoreOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CarCompanyStaff.getValue())) {
            organization = new CarCompanyStaffOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.QualityCheck.getValue())) {
            organization = new QualityCheckOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
