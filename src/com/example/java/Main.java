package com.example.java;

public class Main {

    public static void main(String[] args) {
        //create variable for the equations to use
        int valueOne = 1;
        int valueTwo = 7;
        int valueThree = 9;
        int valueFour = 17;
        int valueFive = 3;
        int valueSix = 5;
        int valueSeven = 987;
        float valueEight = 6;
        double valueNine = 6.5;
        int valueTen = 9;
        int valueEleven = 71;
        int valueTwelve = 8;

        //display to user the type of operator being used, the equation and the result
        System.out.println("Operator: Addition");
        System.out.println(valueOne + " + " + valueTwo + " = " + (valueOne + valueTwo));

        System.out.println("\nOperator: Subtraction");
        System.out.println(valueThree + " - " + valueFour + " = " + (valueThree - valueFour));

        System.out.println("\nOperator: Multiplication");
        System.out.println(valueFive + " * " + valueSix + " = " + (valueFive * valueSix));

        System.out.println("\nOperator: Division");
        System.out.println(valueSeven + " / " + valueEight + " = " + (valueSeven / valueEight));

        System.out.println("\nOperator: Exponential");
        System.out.println(valueNine + " * √" + valueTen + " = " + (valueNine * Math.pow(valueTen,0.5)));

        System.out.println("\nOperator: Modulus");
        System.out.println(valueEleven + " % " + valueTwelve + " = " + (valueEleven % valueTwelve));
    }
}