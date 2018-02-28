/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ecosystem;

import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private ArrayList<Network> networkList;

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        super(null);
        networkList = new ArrayList<>();

    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

}
