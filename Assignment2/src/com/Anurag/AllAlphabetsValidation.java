package com.Anurag;

public class AllAlphabetsValidation {
    public boolean validateString(String string){
        int[] alphabets = new int[26];
        for(char ch: string.toCharArray()){
            if(Character.isAlphabetic(ch)) {
                ch = Character.toLowerCase(ch);
                alphabets[ch - 'a']++;
            }
        }
        for(int i:alphabets){
            if(i==0){
                return false;
            }
        }
        return true;
    }
}
