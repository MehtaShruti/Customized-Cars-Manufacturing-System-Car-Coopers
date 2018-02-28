/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.customer.OrderAtStore;

/**
 *
 * @author shrutimehta
 */
public class OrderAtStoreWorkRequest extends WorkRequest {

    public OrderAtStoreWorkRequest() {
        super(WorkRequest.WorkRequestType.OrderAtStore.getValue());
    }
    private OrderAtStore orderAtStore;

    public OrderAtStore getOrderAtStore() {
        return orderAtStore;
    }

    public void setOrderAtStore(OrderAtStore orderAtStore) {
        this.orderAtStore = orderAtStore;
    }

    @Override
    public String toString() {
        return Integer.toString(orderAtStore.getOrderNumber());
    }

}
