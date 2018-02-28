/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.customer.CompanyCarCatalog;
import business.customer.MasterOrderList;
import business.role.Role;
import business.role.StoreStaffRole;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class StoreOrganization extends Organization {

    private MasterOrderList mod;
    private CompanyCarCatalog ccc;

    public StoreOrganization() {
        super(Organization.Type.Store.getValue());
        mod = new MasterOrderList();
        ccc = new CompanyCarCatalog();
    }

    public MasterOrderList getMod() {
        return mod;
    }

    public void setMod(MasterOrderList mod) {
        this.mod = mod;
    }

    public CompanyCarCatalog getCcc() {
        return ccc;
    }

    public void setCcc(CompanyCarCatalog ccc) {
        this.ccc = ccc;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreStaffRole());
        return roles;
    }
}
