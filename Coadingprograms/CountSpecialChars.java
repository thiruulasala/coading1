package Coadingprograms;

public class CountSpecialChars {
    public static void main(String[]args)
    {
        String s="thirumala@#$%!^*";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)));
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("there is no special character in string");
        }
        else {
            System.out.println("special character found : "+count);
        }
    }
}

