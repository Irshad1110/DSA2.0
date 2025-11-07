package sorting.arrange;

public class WaveArray {

    //GFG-Wave array

    public void sortInWave(int arr[]) {
        // code here
        for(int i=0;i<arr.length-1;i=i+2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

}
