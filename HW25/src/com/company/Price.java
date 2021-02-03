package com.company;

public class Price {
    private String name, shop;
    private int price;

    public Price(){

    }
    public Price(String name, String shop, int price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Название товара: '" + name + '\'' +
                ", Название магазина: '" + shop + '\'' +
                ", Цена: " + price;
    }
    public void soub(String shop){
        if(shop == this.shop){
            System.out.println(new Price(this.name, this.shop,this.price));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
