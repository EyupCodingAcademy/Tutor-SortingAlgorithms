package MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSort {

    public static int[] mergesort(int[] a){
        if(a.length == 1) {
            return a;
        }
        int halfLength = (int)Math.ceil(a.length / 2);
        int[] l1 = Arrays.copyOfRange(a,0,halfLength);
        int[] l2 = Arrays.copyOfRange(a,halfLength,a.length);

        l1 = mergesort(l1);
        l2 = mergesort(l2);

        return merge(l1,l2);
    }

    public static int[] merge(int[] l1, int[] l2) {
        ArrayList<Integer> a = (ArrayList<Integer>)Arrays.stream(l1).boxed().collect(Collectors.toList());
        ArrayList<Integer> b = (ArrayList<Integer>)Arrays.stream(l2).boxed().collect(Collectors.toList());
        ArrayList<Integer> c= new ArrayList<Integer>();
        //System.out.println(a.get(0));
        while (!a.isEmpty() && !b.isEmpty()) {
            if( a.get(0) > b.get(0)){
                c.add( b.get(0));
                b.remove(0);
            }else {
                c.add( a.get(0));
                a.remove(0);
            }
        }
        while(!a.isEmpty()) {
            c.add(a.get(0));
            a.remove(0);
        }
        while(!b.isEmpty()) {
            c.add(b.get(0));
            b.remove(0);
        }


        return c.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] a = {9,5,4,15,3,8,11,2};


        a = mergesort(a);
        for(int v: a){
            System.out.println(v);
        }



        return;
    }
}
