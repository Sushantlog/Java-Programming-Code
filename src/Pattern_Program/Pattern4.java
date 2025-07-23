package Pattern_Program;

import java.util.Scanner;

//Mirrored Rhombus Star Pattern

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num = scanner.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-1-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter The Number:
//4
//   ****
//  ****
// ****
//****