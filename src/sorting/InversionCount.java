package sorting;

public class InversionCount {
    static int merge(int arr[], int l, int mid, int r){
        int ans[] = new int[r-l+1];
        int j = mid+1;
        int k=0;
        int i = l;
        int count=0;
        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                ans[k++] = arr[i++];
            }else{
                ans[k++] = arr[j++];
                count = count + (mid- i + 1); // because for a merge, if for example we are merging
                // 30, 50, 60, 80 and 10, 20 , 40, then if we see, when we compare 30 and 10, we will insert 10
                //in resultant array, but its not just one inversion pair, if 10 is less than 30 then it will be
                // less than all elements after 30 also as arrays are sorted. so we take the count from the index
                //of 30 till last i.e mid.
            }
        }
        while(i<=mid){
            ans[k++] = arr[i++];
        }
        while(j<=r){
            ans[k++] = arr[j++];
        }
        for(int x = 0;x<ans.length;x++){
            arr[l++] = ans[x];
        }
        return count;
    }
    static int mergeSort(int arr[], int l, int r) {
        if(l==r) {
            return 0;
        }
        int mid = (l+r)/2;
        int a = mergeSort(arr, l, mid);
        int b = mergeSort(arr, mid+1, r);
        int c = merge(arr, l, mid, r);
        return a+b+c;

    }
    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length-1);

    }
}
