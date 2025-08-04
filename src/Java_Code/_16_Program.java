package Java_Code;

//Factorial of a number :

import java.util.Scanner;

public class _16_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number You Want to Factor : ");
        int num = scanner.nextInt();

        if(0==num){
            System.out.println("Factorial Of "+num+" is : "+1);
        } else if (1 == num) {
            System.out.println("Factorial Of "+num+" is : "+1);
        }else {
            int fact = 1;
            for(int i=1; i<=num; i++){
                fact = fact * i;
            }
            System.out.println("Factorial Of "+num+" is : "+fact);
        }
    }
}
