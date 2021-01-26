package com.company;

public class Main {

    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 399, "ABC7384");
        Device device2 = new Device("Samsung", 399, "ABC7384");
        Device device3 = new Device("Aplle", 599, "ABC7384");
        Monitor lg = new Monitor("LG", 455, "DUDKP34832", 45, 96);
        EthernetAdapter cisco = new EthernetAdapter("Cisco", 480, "PGHY4949", 340, "dskfsdk");
        System.out.println(cisco.toString());
        System.out.println(cisco.equals(lg));
        System.out.println(device1.equals(device2));
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());
        System.out.println(device2.equals(device3));
    }
}
