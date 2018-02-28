/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class CompanyCarCatalog {

    private ArrayList<CompanyCar> listOfCompanyCars;

    public CompanyCarCatalog() {
        listOfCompanyCars = new ArrayList<>();
    }

    public ArrayList<CompanyCar> getListOfCompanyCars() {
        return listOfCompanyCars;
    }

    public void setListOfCompanyCars(ArrayList<CompanyCar> listOfCompanyCars) {
        this.listOfCompanyCars = listOfCompanyCars;
    }

    public CompanyCar addCompanyCar() {
        CompanyCar cc = new CompanyCar();
        listOfCompanyCars.add(cc);
        return cc;
    }

    public void removeCompanyCar(CompanyCar companyCar) {
        listOfCompanyCars.remove(companyCar);
    }

}
