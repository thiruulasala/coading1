package Coadingprograms;

import java.util.Scanner;

public class GreatestCommonDivisoroftwonumbersinJava
{
  public static void main(String[] args)
  {
    /*{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2= sc.nextInt();
        System.out.println("GCD of two numbers " +num1+ "and" +num2+" is "+findGCD(num1,num2));

    }
    public static int findGCD(int num1,int num2)
    {
        if(num2==0)
        {
            return num1;
        }
        return findGCD(num2,num1%num2);
    }*/
      /* int x=33,y=54,GCD=1;
       for(int i=1;i<=x&&i<=y;i++)
       {
           if(x%i==0&&y%i==0)
           {
               GCD=1;
           }
       }
       System.out.println("GVD of : "+GCD);

   }*/
    int x=33,y=55;
   while(x!=y)
   {
       if(x>y)
       {
           x=x-y;
       }
       else
       {
           y=y-x;
       }
   }
   System.out.println("gcd of x& y is : "+y);
  }
}
