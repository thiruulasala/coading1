package Coadingprograms;

import java.util.HashMap;
import java.util.Map;

public class ElementOccuredOnce
{
    static void OccuredOnce(int []arr,int n)
    {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],1+map.get(arr[i]));
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        for(Map.Entry entry: map.entrySet())
        {
            if(Integer.parseInt(String.valueOf(entry.getValue()))==1)
            {
                System.out.println(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[]args)
    {
        int arr[]={2,4,2,4,5,6,5,7,1,7,8,9};
        int n=arr.length;
        OccuredOnce(arr,n);
    }
}
