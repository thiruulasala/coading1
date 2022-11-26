package Coadingprograms;

import jdk.jshell.Snippet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingChars
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine().toLowerCase();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        boolean Status = false;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.get(ch)==null)
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.get(ch)==1)
            {
                System.out.println("First non repeaterd value of the string is: "+ch);
                 Status = true;
                break;
            }
        }

    }
}
