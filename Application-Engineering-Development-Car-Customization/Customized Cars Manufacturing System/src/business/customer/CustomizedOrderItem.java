/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

/**
 *
 * @author SonaliChaudhari
 */
public class CustomizedOrderItem {

    private float Price;
    private CustomerCar customizeProduct;
    private int orderItemId;
    private static int count = 0;

    public CustomizedOrderItem() {
        customizeProduct = new CustomerCar();
        count++;
        orderItemId = count;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public CustomerCar getCustomizeProduct() {
        return customizeProduct;
    }

    public void setCustomizeProduct(CustomerCar customizeProduct) {
        this.customizeProduct = customizeProduct;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }
}
