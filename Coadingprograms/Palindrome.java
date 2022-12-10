package Coadingprograms;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        int palindrome=new Scanner(System.in).nextInt();
        if(ispalindrome(palindrome))
        {
            System.out.println("number is : "+palindrome+" polindrome");
        }
        else
        {
            System.out.println("number : "+palindrome+ "is not palindrome");
        }
    }
    public static boolean ispalindrome(int num)
    {
        int palindrome=num;
        int reverse=0;

        while(palindrome !=0)
        {
            int reminder=palindrome%10;
             reverse=reverse*10+reminder;
             palindrome=palindrome/10;
        }
        if(num==reverse)
        {
            return true;
        }
        return false;
    }
}
