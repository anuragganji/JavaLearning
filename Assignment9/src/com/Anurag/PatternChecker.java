package com.Anurag;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecker {
    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence:");
        String input = sc.nextLine();
        String regex = "^[A-Z].*[.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Sentence begin with Capital and ends with Period.");
        }
        else{
            System.out.println("Sentence either does not begin with Capital or end with Period.");
        }
    }
}
