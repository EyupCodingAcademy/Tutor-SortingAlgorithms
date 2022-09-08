package InsertSort;

public class InsertSort {
    public static void main(String[] args) {

        int[] a = {9,5,4,15,3,8,11,2};

        for(int i=0;i<a.length;i++) {
            int key = a[i];
            int j = i -1;
            while( j >=0 && a[j] > key){
                a[j+1] = a[j];
                j = j -1;
            }
            a[j+1] = key;
        }

        for(int v: a){
            System.out.println(v);
        }
        return;
    }
}
