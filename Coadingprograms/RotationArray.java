package Coadingprograms;

public class RotationArray
{
    public static void main(String[]args)
    {
        int arr[]={1,3,4,5,3,6,7,8};
        int n=2;
        for(int i=0;i<n;i++)
        {
            int last;
            last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
