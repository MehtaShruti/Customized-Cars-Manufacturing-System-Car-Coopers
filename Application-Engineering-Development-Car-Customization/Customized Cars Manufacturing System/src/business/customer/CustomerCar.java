/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

/**
 *
 * @author sonalichaudhari
 */
public class CustomerCar {

    private int customizeProductId;
    private String carType;
    private String engineType;
    private String airFilters;
    private String carBody;
    private String carColor;
    private String wheelType;
    private String batteryType;
    private String interiorType;
    private String fuelType;
    private float price;
    private static int count = 0;

    public CustomerCar() {
        count++;
        customizeProductId = count;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CustomerCar.count = count;
    }

    public int getCustomizeProductId() {
        return customizeProductId;
    }

    public void setCustomizeProductId(int customizeProductId) {
        this.customizeProductId = customizeProductId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getAirFilters() {
        return airFilters;
    }

    public void setAirFilters(String airFilters) {
        this.airFilters = airFilters;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    @Override
    public String toString() {
        return Integer.toString(customizeProductId);

    }

}
