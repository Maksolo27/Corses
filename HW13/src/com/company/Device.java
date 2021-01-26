package com.company;
public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if( o != null && o.getClass() == this.getClass()){
            Device device = (Device) o;
            boolean resM = this.manufacturer == device.manufacturer;
            boolean resP = this.price == device.price;
            boolean resS = this.serialNumber == device.serialNumber;
            return resM && resP && resS;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode():0);
        result = 37 * result + Float.floatToRawIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode():0);
        return result;
    }
}
