/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import java.util.Date;
import business.useraccount.UserAccount;

/**
 *
 * @author shrutimehta
 */
public abstract class WorkRequest {

    private String name;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private Date lastUpdatedDate;
    private String status;

    public enum WorkRequestType {
        CustomerCustomized("Customer Customized"),
        CarCompany("Car Company"),
        Inventory("Inventory"),
        OrderAtStore("OrderAtStore"),
        Regulatory("Regulatory");

        private String value;

        private WorkRequestType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public WorkRequest(String name) {
        this.name = name;
        requestDate = new Date();
        lastUpdatedDate = new Date();
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
