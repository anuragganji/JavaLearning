package com.Anurag.Main;

import com.Anurag.Data.Data;
import com.Anurag.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data=new Data();
        Singleton singleton=new Singleton();
        data.printVariables();
        data.printLocalVariables();
        // Singleton.initialize("IamString");
        singleton.printString();
    }
}
