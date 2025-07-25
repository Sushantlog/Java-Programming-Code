package Java_Code;

import java.util.Scanner;

//Prime number
public class _08_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to check Prime or Not Prime : ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if(num < 2){
            isPrime = false;
        }else {
            for(int i =2 ; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "Prime Number" : "Not Prime Number ";
        System.out.println("The Number "+num+" is "+result);

        scanner.close();
    }
}
