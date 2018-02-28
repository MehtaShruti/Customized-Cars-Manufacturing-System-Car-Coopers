/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.DesignerRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class DesignOrganization extends Organization {

    public DesignOrganization() {
        super(Organization.Type.Design.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DesignerRole());
        return roles;
    }
}
