package com.umutavci;

public class Main {
    public static void turn(String text){
        char[] textArray = text.toCharArray();
        String[] textArrayEmpty = new String[textArray.length];
        for(int i = 0; i < textArray.length; i++){
            textArrayEmpty[i] = Integer.toBinaryString(textArray[i]);
        }
        for(String i : textArrayEmpty){
            System.out.print(i);
        }
    }
}