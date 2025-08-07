package Java_Code;

//Finding Prime Factors of a number

import java.util.Scanner;

class Demo
{
    int isPrime(int num){
        if (num <= 1) return 0;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return 0;
            }
        }
        return 1;
    }
}

public class _19_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number You Want To Find Prime Factors of: ");
        int num = scanner.nextInt();

        Demo demo = new Demo();
        System.out.print("Prime Factors of " + num + " are: ");
        for(int i=2; i<=num; i++){
            if(demo.isPrime(i)==1){
                int x = num;
                while (x%i == 0){
                    System.out.print(i+" ");
                    x= x/i;
                }
            }
        }
    }
}
