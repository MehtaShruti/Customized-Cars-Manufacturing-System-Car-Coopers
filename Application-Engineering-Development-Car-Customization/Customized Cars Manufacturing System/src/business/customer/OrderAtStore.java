/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import business.person.Person;
import java.util.ArrayList;

/**
 *
 * @author shrutimehta
 */
public class OrderAtStore {

    private ArrayList<CarOrderItem> listOfCarOrders;
    private Person customer;
    private int orderNumber;
    private static int count = 0;

    public OrderAtStore() {
        count++;
        orderNumber = count;
        listOfCarOrders = new ArrayList<>();
    }

    public ArrayList<CarOrderItem> getListOfCarOrders() {
        return listOfCarOrders;
    }

    public void setListOfCarOrders(ArrayList<CarOrderItem> listOfCarOrders) {
        this.listOfCarOrders = listOfCarOrders;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        OrderAtStore.count = count;
    }

    public CarOrderItem addCarOrderItem() {
        CarOrderItem coi = new CarOrderItem();
        listOfCarOrders.add(coi);
        return coi;
    }

    public void removeCarOrderItem(CarOrderItem coi) {
        listOfCarOrders.remove(coi);
    }

    public String toString() {
        return Integer.toString(this.orderNumber);
    }
}
