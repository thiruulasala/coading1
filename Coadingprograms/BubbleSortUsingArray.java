package Coadingprograms;

import java.util.Arrays;

public class BubbleSortUsingArray
{
    public static void main(String[]args)
    {
        int[] test1={32,39,43,12,24,4,3,18,15};
        bubbleSort(test1);
        int[] test2={5,3,2,1,8,7};
        bubbleSort(test2);
    }
    public static void  bubbleSort(int[] test1) {
        System.out.println("before sorting : " + Arrays.toString(test1));
        for (int i = 0; i < test1.length - 1; i++) {
            for (int j = 1; j < test1.length - i; j++) {
                if (test1[j - 1] > test1[j]) {
                    int temp = test1[j];
                    test1[j] = test1[j - 1];
                    test1[j - 1] = temp;
                }
            }
            System.out.printf("test1 array after %d pass %s: %n", i + 1, Arrays.toString(test1));

        }
    }

}
