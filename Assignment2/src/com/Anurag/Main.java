package com.Anurag;

public class Main {

    //Time complexity is O(n)
    //Space complexity is O(n)
    public static void main(String[] args) {
	// write your code here
        AllAlphabetsValidation obj = new AllAlphabetsValidation();
        boolean result = obj.validateString("asdfghjklqwertyuio741!@#$>pzxcvbnm");
        System.out.println(result?"Contains all alphabets!!":"Does not contain:(");
    }
}
