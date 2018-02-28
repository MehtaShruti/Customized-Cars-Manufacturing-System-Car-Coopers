/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.CarCooper) {
            enterprise = new CarCooperEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Car) {
            enterprise = new CarEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.CustomerSupport) {
            enterprise = new CustomerSupportEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Regulatory) {
            enterprise = new RegulatoryEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
