package sorting.arrange;

public class ArrangeMinMax {

    //quotient-remainder method
    public void rearrange(long arr[]) {
        long max = arr[arr.length-1]+1;
        int left=0, right=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[right--] % max)*max;
            }else{
                arr[i] = arr[i] + (arr[left++] % max)*max;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/max;
        }

    }
}
