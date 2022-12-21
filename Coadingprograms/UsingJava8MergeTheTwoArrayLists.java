package Coadingprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingJava8MergeTheTwoArrayLists
{
    public static void main(String[]args)
    {
        List<Integer>list1=Arrays.asList(1,2,3,4,5,6);
        List<Integer>list2=Arrays.asList(4,5,6,7,8,9);
        Stream<Integer> allList=Stream.concat(list1.stream(),list2.stream());
        List<Integer>allElements=allList.collect(Collectors.toList());
        System.out.println(allElements);

        Set<Integer>unique=allElements.stream().collect(Collectors.toSet());
        System.out.println("unique elements");
        System.out.println(unique);

        Integer min=unique.stream().min((x1,x2)->x1-x2).get();
        System.out.println(min);
        Integer max=unique.stream().max((x1,x2)->x1-x2).get();
        System.out.println(max);
    }
}
