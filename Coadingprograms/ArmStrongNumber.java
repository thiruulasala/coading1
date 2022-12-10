package Coadingprograms;

public class ArmStrongNumber
{
    public static void main(String[] args)
    {
        int n=1634,temp,armstrong=0;
        int num=n;
        while(n>0)
        {
            temp=n%10;
            temp= (int) Math.pow(temp,4);
            armstrong=armstrong+temp;
            n=n/10;
        }
        if(armstrong==num)
        {
            System.out.println("it's a armstrong number");
        }
        else
        {
            System.out.println("it's not armstrong number");
        }
    }
}
