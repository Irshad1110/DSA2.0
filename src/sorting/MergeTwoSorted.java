package sorting;

public class MergeTwoSorted {
    //using insertion sort

    public static int get(int a[], int b[], int i){
        if(i<a.length) return a[i];
        else return b[i-a.length];
    }

    public static void set(int a[], int b[], int i, int val){
        if(i<a.length) {
            a[i] = val;
        }else{
            b[i-a.length] = val;
        }
    }
    public static void swap(int a[], int b[], int i, int j) {
        int temp1 = get(a, b, i);
        int temp2 = get(a, b, j);
        set(a, b, i, temp2);
        set(a, b, j, temp1);
    }

    //will give TLE as its n square
    public static void mergeArrays(int a[], int b[]) {
        for(int i = a.length;i<a.length+b.length;i++){
            for(int j = i;j>0;j--){
                if(get(a, b, j) < get(a, b, j-1)){
                    swap(a, b, j, j-1);
                }
            }
        }

    }
}
