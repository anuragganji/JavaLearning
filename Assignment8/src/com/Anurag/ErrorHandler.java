package com.Anurag;

public class ErrorHandler {
    public static void method() throws Exception1, Exception2 {
//        throw new Exception1();
//        throw new Exception2();
//        throw new Exception3();
        throw new NullPointerException();
    }

    public static void main(String args[]) {
        ErrorHandler errorHandling = new ErrorHandler();
        try {
            errorHandling.method();
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Finally Block..");
        }
    }
}
