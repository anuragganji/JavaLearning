package com.Anurag;

public class Main {

    public static void main(String[] args) {
        // write your code here
        VampireNumber vampireNumber = new VampireNumber();
        vampireNumber.printVampireNumbers();
        DoubleConstructorClass overloadedClass = new DoubleConstructorClass();
        ParameterPrinter[] arr = new ParameterPrinter[5];
        for (int i = 0; i < 5; i++)
            arr[i] = new ParameterPrinter("Constructor Object");
    }
}
