package com.Anurag;

public class Main {

    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[1]=new Gerbil();
        rodents[2]=new Hamster();
        for(int i=0;i<3;i++){
            rodents[i].gnaw();
            rodents[i].excavate();
            rodents[i].defend();}
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();
        for(int i=0;i<3;i++)
            cycles[i].balance();
        Cycle cycle=new Tricycle();
        Tricycle tricycle=(Tricycle)cycle;
        tricycle.balance();
        ImplementedClass implementedClass=new ImplementedClass();
        implementedClass.methodOne(implementedClass);
        implementedClass.methodTwo(implementedClass);
        implementedClass.methodThree(implementedClass);
        implementedClass.methodFour(implementedClass);
        OuterClass outerClass=new OuterClass();

    }
}
