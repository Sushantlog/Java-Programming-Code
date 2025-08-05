package Java_Code;

//Power of a number

import java.util.Scanner;

public class _17_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding The Power Of Number...");
        System.out.println("Enter The base : ");
        int base = scanner.nextInt();

        System.out.println("Enter The Exponent : ");
        int exponent = scanner.nextInt();

        int result = 1;
        for(int i = 1; i<=exponent; i++){
            result = result * base;
        }

        System.out.println("Base : "+base+", Exponent : "+exponent+", Power : "+result);
    }
}
