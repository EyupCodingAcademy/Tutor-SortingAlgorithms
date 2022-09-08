package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {9,5,4,15,3,8,11,2};

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for(int j=0;j < a.length-1;j++){
                if(a[j] > a[j+1]) {

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
        }
        for(int v: a){
            System.out.println(v);
        }
        return;
    }
}
