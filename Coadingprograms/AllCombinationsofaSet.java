package Coadingprograms;

public class AllCombinationsofaSet {
    public static void main(String[] args) {
        String []str1 = {"1", "2", "3"};
        String []str2 = {"a", "b", "c"};
        String []str3 = {"&", "$", "#"};
        String [] []sts = {str1, str2, str3};
        printcombinatons(sts, 0, " ");
    }
    public static void printcombinatons(String[][] sts,int n,String prefix)
    {
        if(n>=sts.length)
        {
            System.out.println("{"+prefix.substring(0,prefix.length()-1)+"}");
            return;
        }
        for(String s:sts[n])
        {
            printcombinatons(sts,n+1,prefix+s+" ");
        }
    }
}
