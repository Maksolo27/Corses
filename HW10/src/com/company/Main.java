package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractHandler xml = new XMLHandler();
        AbstractHandler txt = new TXTHandler();
        AbstractHandler doc = new DOCHandler();
        AbstractHandler[] abh = {xml, txt, doc};
        for(AbstractHandler an: abh){
            an.create();
            an.save();
            an.open();
            an.change();
        }
    }
}
