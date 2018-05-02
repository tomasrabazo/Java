package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // byte  --  8
        // short -- 16
        // int   -- 32
        // long  -- 64L
        // float -- 32F
        // double-- 64D

        // char  -- 32
        // boolean -- true - false

        String myString = "This is a String";
        System.out.println(myString);

        myString = myString + " another one.";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println(lastString);

        lastString = "10";
        double myDouble = 50.60D;
        lastString = lastString + myDouble;

        System.out.println(lastString);

    }
}
