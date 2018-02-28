/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.customer.CompanyCar;

/**
 *
 * @author shrutimehta
 */
public class CarCompanyWorkRequest extends WorkRequest {

    public CarCompanyWorkRequest() {
        super(WorkRequest.WorkRequestType.CarCompany.getValue());

    }
    private CompanyCar companyCar;

    public CompanyCar getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(CompanyCar companyCar) {
        this.companyCar = companyCar;
    }

    @Override
    public String toString() {
        return this.companyCar.toString();
    }

}
