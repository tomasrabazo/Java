package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now:" + result);
        result++;
        System.out.println("Result is now:" + result);

        result--;
        System.out.println("Result is now:" + result);

        result += 2;
        System.out.println("Result is now:" + result);

        result *= 10;
        System.out.println("Result is now:" + result);

        result -= 10;
        System.out.println("Result is now:" + result);

        result /= 10;
        System.out.println("Result is now:" + result);

        int numero1 = 3, numero2 = 2;
        int value = numero1-- + numero2;
        System.out.println("Value:" + value);

        value = --numero1 + numero2;
        System.out.println("Value:" + value);

        value = numero1-- + numero1 + numero2;
        System.out.println("Value:" + value);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println(" > secondTopScore < 100");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true:false;
        if (wasCar)
            System.out.println("Was Car is True");

        //----- Chagenge 1.
        double value1 = 20d;
        double value2 = 80d;
        double valueR1 = (value1 + value2) * 25;
        double valueR2 = (value1 + value2) % 40;

        if (valueR2 <= 20d)
            System.out.println("Total was over the limit.");


    }
}
