package main.javacore.andrey.task;

import java.awt.image.AreaAveragingScaleFilter;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        String in = "[({})]";
        String in2 = "(])]";
        String in3 = "[[[{[]}]]]";
        String in4 = "[[[{[}]]]]";
        AnalisString(in);
        AnalisString(in2);
        AnalisString(in3);
        AnalisString(in4);
        int[] f =  {6,4,6,8,1,100,-100};
        int[] s = {3,8,76544, -42, 100,1};
        sortArray(f,s);

    }
    public static void AnalisString(String a) {
   boolean res = true;
       byte[] b = a.getBytes();
        ArrayDeque<Byte> arrayDeque = new ArrayDeque<Byte>();
        for (Byte c : b) {
            arrayDeque.push(c);
        }
          if(arrayDeque.size() % 2 == 0) {
              while (arrayDeque.peek() != null) {
                  if (arrayDeque.pollFirst() - arrayDeque.pollLast() > 5) {
                      res = false;
                      break;
                  }
              }
              if (res == true) {
                  System.out.println("Коректно");
              }else
              System.out.println("Не коректно");
         }else System.out.println("Не коректно");


        }
         public static void  sortArray(int[] a, int[] b){
             Set<Integer> set = new HashSet<>();
             SortedSet<Integer> set2 = new TreeSet<>();
             for (int i : a) {
                 set.add(i);
             }
             for (int i : b) {
                 if (set.add(i) == false)
                     set2.add(i);
             }
             System.out.println(set2);


         }


    }


