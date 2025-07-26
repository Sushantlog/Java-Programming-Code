package Java_Code;

//Prime number within a given range:

import java.util.Scanner;

public class _09_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prime Number in your given range...!");
        System.out.println("First Enter The Lower Range : ");
        int lower = scanner.nextInt();
        System.out.println("Second Enter The Upper Range : ");
        int upper = scanner.nextInt();

        for(int i=Math.max(2,lower); i<=upper;i++){   //for(int i=lower; i<=upper;i++) this loop will take 0 and 1 also
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}


//Math.max(2, lower) = Math.max(2, 1) = 2
//So the loop will start from 2, and correctly ignore 1, which is not prime.