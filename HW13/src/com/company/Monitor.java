package com.company;
public class Monitor extends Device{
    int resolutionX, resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", X=" + resolutionX +
                ", Y=" + resolutionY +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if( o != null && o.getClass() == this.getClass()){
            Monitor device = (Monitor) o;
            boolean resM = this.manufacturer == device.manufacturer;
            boolean resP = this.price == device.price;
            boolean resS = this.serialNumber == device.serialNumber;
            boolean resX = this.resolutionX == device.resolutionX;
            boolean resY = this.resolutionY == device.resolutionY;
            return resM && resP && resS && resX && resY;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode():0);
        result = 37 * result + Float.floatToRawIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode():0);
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }
}
