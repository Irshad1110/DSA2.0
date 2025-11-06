package sorting.partitioning;

public class SegregateWOExtraSpace {

    public void merge(int[] arr, int l, int mid, int r){
        int leftStart = mid;
        int rightEnd = mid+1;
        while(leftStart >=l && arr[leftStart] < 0) {
            leftStart--;
        }
        while(rightEnd <=r && arr[rightEnd] >=0){
            rightEnd++;
        }
        reverse(arr, leftStart+1, mid);
        reverse(arr, mid+1, rightEnd-1);
        reverse(arr, leftStart+1, rightEnd-1);

    }

    public void usingMergeSort(int[] arr, int l, int r){
        if(l==r){
            return;
        }
        int mid = (l+r)/2;
        usingMergeSort(arr, l, mid);
        usingMergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);

    }

    public void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }

    public void usingInsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            if(arr[j] >= 0){
                while(j>0 && arr[j-1] < 0) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }
            }

        }
    }

    public void segregateElements(int[] arr) {
        // usingInsertionSort(arr);
        usingMergeSort(arr, 0, arr.length-1);
    }
}
