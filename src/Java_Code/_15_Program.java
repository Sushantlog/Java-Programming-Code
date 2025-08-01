package Java_Code;

//Fibonacci Series upto nth term :

import java.util.Scanner;

public class _15_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding The Fibonacci Series Upto Nth Term.");
        System.out.println("Enter The Number : ");
        int num = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a+" , "+b+" , ");
        int NextTerm;
        for(int i=2; i<num; i++){
            NextTerm = a + b;
            a=b;
            b=NextTerm;
            System.out.print(NextTerm+" , ");
        }
    }
}
