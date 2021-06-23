package com.Anurag;

import java.util.Arrays;

public class VampireNumber {
    public int countDigits(long num) {
        return Long.toString(Math.abs(num)).length();
    }

    public boolean check(long number, long num1, long num2) {
        int length = countDigits(number);
        if (countDigits(num1) != length / 2 || countDigits(num2) != length / 2) return false;
        if (Long.toString(num1).endsWith("0") && Long.toString(num2).endsWith("0")) return false;
        byte[] num = Long.toString(number).getBytes();
        byte[] mergedNum = (num1 + Long.toString(num2)).getBytes();
        Arrays.sort(num);
        Arrays.sort(mergedNum);
        return Arrays.equals(num, mergedNum);
    }

    public void printVampireNumbers() {
        int count = 0;
        for (long i = 1000; count < 100; i++) {
            if ((countDigits(i) % 2) != 0) {
                i = i * 10 - 1;
                continue;
            }
            for (long num1 = 10; num1 <= Math.sqrt(i); num1++) {
                if (i % num1 == 0) {
                    long num2 = i / num1;
                    if (check(i, num1, num2) && num1 <= num2) {
                        count++;
                        System.out.println("Vampire Number " + count + ":" + i);
                    }
                }
            }
        }
    }
}
