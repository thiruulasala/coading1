package Coadingprograms;

public class StringJoiner
{
    public static void main(String[] args)
    {
        java.util.StringJoiner s1=new java.util.StringJoiner(",","[","]");
        s1.add("A").add("B").add("C");
        System.out.println(s1);
        java.util.StringJoiner s2=new java.util.StringJoiner(":");
        s2.add("P").add("Q");

        System.out.println(s2);

        s1.merge(s2);
        System.out.println(s1);
    }
}
