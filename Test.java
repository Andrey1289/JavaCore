import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Test {
    public static void main(String[] args) {
        int[] colect1 = {6,4,6,8,1,100,-100};
        int[] colect2 = {3,8,76544, -42, 100,1};
         List <Integer> arrayList = new ArrayList<>();

             for(int a : colect1){
                for(int b : colect2){
            if(a ==b){
                arrayList.add(b);
            };}}
        Collections.sort(arrayList);
        System.out.println(arrayList);




    }
}
