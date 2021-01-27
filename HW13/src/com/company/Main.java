package com.company;

public class Main {

    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 399, "ABC7384");
        Device device2 = new Device("Samsung", 399, "ABC7384");
        Device device3 = new Device("Apple", 599, "ABC7384");
        Monitor lg = new Monitor("LG", 455, "DUDKP34832", 45, 96);
        EthernetAdapter cisco = new EthernetAdapter("Cisco", 480, "PGHY4949", 340, "LKDH65743");
        Monitor sony = new Monitor("Sony", 755, "DUDKP34832", 45, 26);
        EthernetAdapter tplink = new EthernetAdapter("tp-llink", 233, "HFTD3949", 20, "KSA32");

        System.out.println(cisco.toString());
        System.out.println(cisco.equals(lg));
        System.out.println(device1.equals(device2));
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());
        System.out.println(device2.equals(device3));
        System.out.println(sony.equals(lg));
        System.out.println(cisco.equals(tplink));
        System.out.println(tplink.hashCode());
        System.out.println(sony.hashCode());
    }
}
