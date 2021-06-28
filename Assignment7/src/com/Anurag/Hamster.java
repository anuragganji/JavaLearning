package com.Anurag;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("I am Hamster");
    }
    @Override
    public void gnaw(){
        System.out.println("Hamster Gnaw");
    }
    @Override
    public void excavate(){
        System.out.println("Hamster Excavate");
    }
    @Override
    public void defend(){
        System.out.println("Hamster Defend");
    }
}
