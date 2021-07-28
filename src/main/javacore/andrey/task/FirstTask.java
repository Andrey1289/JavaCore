package main.javacore.andrey.task;


import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        int[] f =  {6,4,6,8,1,100,-100};
        int[] s = {3,8,76544, -42, 100,1};
        sortArray(f,s);
    }
       public static Set<Integer>  sortArray(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            if (set.add(i) == false)
                set2.add(i);
        }
                return set2;
    }
}


