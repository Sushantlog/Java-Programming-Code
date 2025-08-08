package Java_Code;

//Strong Number Program in Java

import java.util.Scanner;

class Factorial
{
    int facter(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
}

class StrongNumber
{
//    int facter(int num){
//        int fact = 1;
//        for(int i=1; i<=num; i++){
//            fact = fact * i;
//        }
//        return fact;
//    }


    Factorial factorial = new Factorial();
    //this will be used for access outside Factorial class so that I will Create an object
    // of the Factorial class inside StrongNumber

    boolean findStrongNumber(int num){
        int temp = num;
        int sum = 0;
        int digit;

        while (temp != 0){
            digit = temp % 10;
            sum = sum + factorial.facter(digit);
            temp = temp /10;
        }

//        if(sum == num){
//            return true;
//        }else{
//            return false;
//        }
        return sum == num;
    }
}

public class _20_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To Check Number is Strong Number or Not :");
        int num = scanner.nextInt();

        StrongNumber strongNumber = new StrongNumber();
        if(strongNumber.findStrongNumber(num)){
            System.out.println(num+" is strong number.");
        }else{
            System.out.println(num+" is not strong number.");
        }
    }
}
