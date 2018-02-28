/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

/**
 *
 * @author shrutimehta
 */
public class CarOrderItem {

    private CompanyCar companyCar;
    private int orderItemId;
    private static int count = 0;

    public CarOrderItem() {
        companyCar = new CompanyCar();
        count++;
        orderItemId = count;
    }

    public CompanyCar getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(CompanyCar companyCar) {
        this.companyCar = companyCar;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CarOrderItem.count = count;
    }

    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }
}
