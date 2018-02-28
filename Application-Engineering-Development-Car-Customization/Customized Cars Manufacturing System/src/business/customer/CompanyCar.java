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
public class CompanyCar {
    private String brand;
    private String modelNumber;
    private int quantity;
    private static int count=0;
    private int companyCarId;
    private float price;
    
    
    public CompanyCar()
    {
        count++;
        companyCarId=count;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CompanyCar.count = count;
    }

    public int getCompanyCarId() {
        return companyCarId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString()
    {
        return Integer.toString(companyCarId);
    }
}
