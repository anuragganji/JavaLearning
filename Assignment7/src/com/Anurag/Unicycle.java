package com.Anurag;

public class Unicycle extends Cycle implements Cycles{
    public void balance(){
        System.out.println("Unicycle's Balance");
    }

    @Override
    public void factory() {
        System.out.println("UniCycle's Factory");
    }
}
