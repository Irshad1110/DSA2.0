package recursion;

public class PrintDecreasingIncreasing {
    public static void printIncreasingDecreasing(int n) {
        if(n==0){
            return;
        }

        System.out.println(n);
        printIncreasingDecreasing(n-1);
        System.out.println(n);
    }
}
