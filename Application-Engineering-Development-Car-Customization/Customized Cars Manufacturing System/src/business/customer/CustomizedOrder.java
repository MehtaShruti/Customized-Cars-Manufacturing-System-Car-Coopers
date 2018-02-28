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
 * @author SonaliChaudhari
 */
public class CustomizedOrder {

    private ArrayList<CustomizedOrderItem> orderItemList;
    private Person customer;
    private int orderNumber;
    private static int count;

    public CustomizedOrder() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }

    public ArrayList<CustomizedOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<CustomizedOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNmuber() {
        return orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CustomizedOrder.count = count;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public CustomizedOrderItem addCustomizedOrderItem() {
        CustomizedOrderItem co = new CustomizedOrderItem();
        orderItemList.add(co);
        return co;
    }

    public void removeOrderItem(CustomizedOrderItem coi) {
        orderItemList.remove(coi);
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    
    @Override
    public String toString() {
        return Integer.toString(orderNumber);
    }
}
