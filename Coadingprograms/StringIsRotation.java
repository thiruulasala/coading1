package Coadingprograms;

public class StringIsRotation
{
    public static boolean isRotation(String s1,String s2)
    {
        return(s1.length()==s2.length())&&((s1+s1).indexOf(s2)!=-1);
    }
    public static void main(String[] args)
    {
        String s1="thiru";
        String s2="iruth";
        if(isRotation(s1,s2))
        {
            System.out.println("Rotation of string is present");
        }
        else {
            System.out.println("rotation not found");
        }
    }
}
