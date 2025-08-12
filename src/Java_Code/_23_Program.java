package Java_Code;

//Automorphic number
//An Automorphic Number (also called a Curious Number or Circular Number) is a
// number whose square ends with the same digits as the number itself.

import java.util.Scanner;

class FindAutomorphic
{
    int isAutomorphic(int num){
        int square = num * num;
        while(num != 0){
            if(num%10 != square%10){
                return 0;
            }
            num = num / 10;
            square = square / 10;
        }
        return 1;
    }
}

public class _23_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num = scanner.nextInt();

        FindAutomorphic findAutomorphic = new FindAutomorphic();

        int square = num * num;

        if(findAutomorphic.isAutomorphic(num) == 1){
            System.out.println("Num: "+num+", Square: "+square+" - is Automorphic");
        }else{
            System.out.println("Num: "+num+", Square: "+square+" - is not Automorphic");
        }

    }
}

//"Sorry, I won’t be able to make it tomorrow due to other commitments.
// But I’m very interested in working with [Company Name] in a technical role like
// software development, so I’d love to stay in touch for future openings."