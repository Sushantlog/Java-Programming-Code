package Pattern_Program;

//Triangle Star Pattern

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to print Star : ");
        int num = scanner.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter the Number to print Star :
//5
//*
//**
//***
//****
//*****
