/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ecosystem;

import business.person.Person;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author shrutimehta
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system= Ecosystem.getInstance();
        
        Person employee=system.getEmployeeDirectory().createPerson("RRH");
        UserAccount ua=system.getUserAccountDirectory().createUserAccount("sysadmin","sysadmin",employee, new SystemAdminRole());
        return system;
    }
}
