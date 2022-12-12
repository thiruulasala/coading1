package Coadingprograms;

public class OccurrenceOfCharInArray
{
    public static void main(String[]args)
    {
        String thiru="today is my birthday";
        int totalcount= thiru.length();
        int afterreplacement=thiru.replace("a"," ").length();
        int count=totalcount-afterreplacement;
        System.out.println("number occurence of a is : "+count);
    }
}
