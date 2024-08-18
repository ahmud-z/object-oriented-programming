package com.mycompany.testprogram;

class DemoClass {

    int addTwoNum(int num1, int num2) {
        return num1 + num2;
    }
}

public class TestProgram {

    public static void main(String[] args) {

        DemoClass ob = new DemoClass();

        System.out.println("Result: " + ob.addTwoNum(17, 5));
    }
}
