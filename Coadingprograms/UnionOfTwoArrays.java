package Coadingprograms;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays
{
    public static void main(String[] args)
    {
        int arr1[]={80,10,15,2,35,60};
        int arr2[]={35,80,60,20,75};

        PrintUnion(arr1,arr2);
    }
    static void PrintUnion(int arr1[],int arr2[])
    {
        Set<Integer> s1=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            s1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            s1.add(arr2[i]);
        }
        System.out.println("Union");
        System.out.println(s1);
    }
}
