package Pattern_Program;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Row Size : ");
        int num = scanner.nextInt();

        for(int i =0 ; i<num; i++){
            for(int j=0; j<num; j++){
                if(i == 0 || i == num-1){
                    System.out.print("*");
                }
                else if( j == 0 || j == num-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//Enter The Row Size :
//6
//        ******
//        *    *
//        *    *
//        *    *
//        *    *
//        ******