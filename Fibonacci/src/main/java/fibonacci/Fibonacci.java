package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input Max Sequence Number :");
        int number = input.nextInt();
        long fibPrevious = 0, fibonacci = 1, sum = 0;
        for (int i=1; i<= number; i++){
            System.out.println(fibPrevious + " ");
            sum = fibPrevious + fibonacci;
            fibPrevious = fibonacci;
            fibonacci = sum;
        }

    }
}
