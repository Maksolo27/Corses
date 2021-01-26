package com.company;
public class EthernetAdapter extends Device{
    int speed;
    String mac;
    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }
    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if( o != null && o.getClass() == this.getClass()){
            EthernetAdapter device = (EthernetAdapter) o;
            boolean resM = this.manufacturer == device.manufacturer;
            boolean resP = this.price == device.price;
            boolean resS = this.serialNumber == device.serialNumber;
            boolean resSp = this.speed == device.speed;
            boolean resMc = this.mac.equals(device.mac);
            return resM && resP && resS && resSp && resMc;
        }
        return false;
    }
    @Override
    public int hashCode() {
        int result = 37;
        result = 37 * result + (manufacturer != null ? manufacturer.hashCode():0);
        result = 37 * result + Float.floatToRawIntBits(price);
        result = 37 * result + (serialNumber != null ? serialNumber.hashCode():0);
        result = 37 * result + speed;
        result = 37 * result + (mac != null ? mac.hashCode():0);
        return result;
    }
}
