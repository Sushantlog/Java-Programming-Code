package Java_Code;

//Abundant number

import java.util.Scanner;

public class _26_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = scanner.nextInt();

        int sum = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum > num){
            System.out.println(num+" is the abundant Number.");
            System.out.println("abundant by : "+(sum-num));
        }else {
            System.out.println("Not an abundant Number.");
        }
    }
}
