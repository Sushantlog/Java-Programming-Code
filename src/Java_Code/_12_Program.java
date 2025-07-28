package Java_Code;

import java.util.Scanner;

//Palindrome number
class Palindrome
{
    boolean isPalindrome(String str){
        int left = 0;
        int right  = str.length() - 1;
        str = str.toLowerCase();

        while (left < right){
            if(!Character.isLetterOrDigit(str.charAt(left))){
                System.out.println(Character.isLetterOrDigit(str.charAt(left)));
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }else {
                if(str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

public class _12_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String input = scanner.nextLine();

        Palindrome palindrome = new Palindrome();
        if(palindrome.isPalindrome(input)){
            System.out.println("It is a Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
        scanner.close();
    }
}
