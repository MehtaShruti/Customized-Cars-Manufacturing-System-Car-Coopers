/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.ManufacturerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class ManufactureOrganization extends Organization {

    public ManufactureOrganization() {
        super(Organization.Type.Manufacture.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerRole());
        return roles;
    }
}
