/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import java.util.ArrayList;

/**
 *
 * @author sonalichaudhari
 */
public class MasterOrderList {

    ArrayList<CustomizedOrder> listOfCustomisedOrders;
    ArrayList<OrderAtStore> listOfStoreOrders;

    public MasterOrderList() {
        listOfCustomisedOrders = new ArrayList<>();
        listOfStoreOrders = new ArrayList<>();
    }

    public ArrayList<CustomizedOrder> getListOfCustomisedOrders() {
        return listOfCustomisedOrders;
    }

    public void setListOfCustomisedOrders(ArrayList<CustomizedOrder> listOfCustomisedOrders) {
        this.listOfCustomisedOrders = listOfCustomisedOrders;
    }

    public ArrayList<OrderAtStore> getListOfStoreOrders() {
        return listOfStoreOrders;
    }

    public void setListOfStoreOrders(ArrayList<OrderAtStore> listOfStoreOrders) {
        this.listOfStoreOrders = listOfStoreOrders;
    }

    public CustomizedOrder addOrder() {
        CustomizedOrder order = new CustomizedOrder();
        listOfCustomisedOrders.add(order);
        return order;
    }

    public void addOrderFromInput(CustomizedOrder order) {
        listOfCustomisedOrders.add(order);
    }

    public void removeCustomisedOrder(CustomizedOrder order) {
        listOfCustomisedOrders.remove(order);
    }

    public OrderAtStore addOrderAtStore() {
        OrderAtStore oas = new OrderAtStore();
        listOfStoreOrders.add(oas);
        return oas;
    }

    public void addStoreOrder(OrderAtStore oas) {
        listOfStoreOrders.add(oas);
    }

    public void removeOrderAtStore(OrderAtStore oas) {
        listOfStoreOrders.remove(oas);
    }

}
