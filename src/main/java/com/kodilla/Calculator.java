package com.kodilla;

public class Calculator {

    public int addAToB(int a, int b){
        return a+b;
    }
    public int subtractAFromB(int a, int b){
        return b-a;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int addResult = calculator.addAToB(1,2);
        System.out.println("Add result is: " + addResult);


        int subtractResult = calculator.subtractAFromB(5, 2);
        System.out.println("Subtract result is: " + subtractResult);
    }
}
