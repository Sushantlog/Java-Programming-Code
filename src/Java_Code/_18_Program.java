package Java_Code;

//Factor of a number

import java.util.Scanner;

public class _18_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find The Factor...");
        System.out.println("Enter the number to find its factors: ");
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
