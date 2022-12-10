package Coadingprograms;

public class InArrayEvenAndOddNumbers
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 4, 5, 3, 6, 2, 8, 12, 14, 16};
        ArrayEvenOdd(arr1);

    }
    public static void ArrayEvenOdd(int [] arr)
    {
        int[] a=new int[arr.length];
        int index=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]%2==0)
        {
            a[index]=arr[i];
            index++;
        }
       }
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]%2!=0)
           {
               a[index]=arr[i];
               index++;
           }
       }
       for (int i=0;i<a.length;i++)
       {
           System.out.print
                   (a[i]+" , ");
       }
    }

}
