/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class CarEnterprise extends Enterprise{
 
    public CarEnterprise(String name)
    {
        super(name,Enterprise.EnterpriseType.Car);     
    }
    @Override
     public ArrayList<Role> getSupportedRole()
    {
        return null;
    }
}
