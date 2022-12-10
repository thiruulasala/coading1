package Coadingprograms;

import java.util.Scanner;

public class LargestandSmallestofthreeIntegers
{
    public static void main(String[] args)
    {
        int First=6;
        int Second=3;
        int Third=5;
       /*Scanner sc=new Scanner(System.in);
        System.out.println("Find largest and smallest numbers");
        System.out.println("please enter the first number");
        int First=sc.nextInt();
        System.out.println("please enter the second number");
        int Second =sc.nextInt();
        System.out.println("please enter the third number");
        int Third=sc.nextInt();*/

        int largest=largest(First,Second,Third);
        int smallest=smallest(First,Second,Third);
        System.out.printf("largest of three numbers "
                 +First,Second,Third,largest);
        System.out.printf("smallest of three numbers "
                 + First,Second,Third,smallest);
       // sc.close();

    }
    public static int largest(int First,int Second,int Third)
    {
        int max=First;
        if(Second>max);
        {
            max=Second;
        }
        if(Third>max)
        {
            max=Third;
        }
        return max;
    }
    public static int smallest(int First, int Second,int Third)
    {
        int min=First;
        if(Second<min)
        {
            min=Second;
        }
        if(Third<min)
        {
            min=Third;
        }
        return min;
    }
}
