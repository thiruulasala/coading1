package Coadingprograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArray 
{
    static void countFrequency(int arr[],int n)
    {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1 );
            }
            else
            {
             mp.put(arr[i],1 );
            }
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet())
        {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
    public static void main(String[] args)
    {
        int arr[]={10,20,3,0,0,2,4,10,20,3,3};
        int n= arr.length;
        countFrequency(arr,n);
    }
}
