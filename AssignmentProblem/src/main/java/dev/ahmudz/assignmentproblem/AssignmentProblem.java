package dev.ahmudz.assignmentproblem;

import java.util.Scanner;

interface CustomizedInterface {

    int factorSum(int n);
}

class MyFactor implements CustomizedInterface {

    public int factorSum(int n) {
        int sum = 0;

        if (n > 1000) {
            return -1;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class AssignmentProblem {

    public static void main(String[] args) {
        MyFactor obj = new MyFactor();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = input.nextInt();

        System.out.println("Result: " + obj.factorSum(value));
    }
}
