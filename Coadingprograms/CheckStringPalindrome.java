package Coadingprograms;

public class CheckStringPalindrome
{
    public static void main(String[] args)
    {
        System.out.println("is thimo is palindrome : "+ispalindrome("thiru"));
    }
    public static boolean ispalindrome(String text)
    {
        String reverse=reverse(text);
        if(text.equals(reverse))
        {
            return true;
        }
        return false;
    }
    public static String reverse(String input)
    {
        if(input==null||input.isEmpty())
        {
            return input;
        }
        return input.charAt(input.length()-1)+reverse(input.substring(0,input.length()-1));
    }
}

