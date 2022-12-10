package Coadingprograms;

public class DividedStringEqualParts
{
    public static void main(String[] args)
    {
     String str="Thirumal";
     int n=4;
     int len=str.length();
     int stringpart=len/n;
        String[]stringparts=new String[n];
        int temp=0;
   if(len%n!=0)
     {
         System.out.println("string can not divided into"+n+"equal parts");
     }
     else
     {
     for(int i=0;i<len;i=i+stringpart)
     {
         String part=str.substring(i,i+stringpart);
         stringparts[temp]=part;
         temp++;
     }
     }
     for(int i=0;i<stringparts.length;i++)
     {
         System.out.println(stringparts[i]);
     }
    }
}
