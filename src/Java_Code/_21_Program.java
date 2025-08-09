package Java_Code;

//Perfect number

import java.util.Scanner;

public class _21_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number to find Perfect Number : ");
        int num = scanner.nextInt();

        int sum = 0;
//        int digit;
//        for(int i=1; i<=num; i++){  //this will include the number itself
//            if(num%i == 0){  //this will 1+2+3+6 =>12
//                digit = num/i;
//                System.out.println(i+" "+digit);
//                sum= sum+digit; // adding the Quotient  eg: if I take 6 => 6+3+2+1 =>12
//            }
//        }

        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println("Sum is : "+sum);
            System.out.println(num+" is Perfect Number.");
        }else {
            System.out.println("Sum is : "+sum);
            System.out.println(num+" is not perfect Number.");
        }
    }
}
