package Coadingprograms;



public class FibonacciNumber
{
    static void Fibonacci(int N)
    {
        int num1=0, num2=1;
        int count=0;

        while(count<N)
        {
            System.out.println(num1 + " ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            count=count+1;
        }
    }
    public static void main(String[]args)
    {
        int n=10;
        Fibonacci(n);
    }
}
