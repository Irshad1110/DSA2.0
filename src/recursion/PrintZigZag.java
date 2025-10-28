package recursion;

public class PrintZigZag {

    public static void printZigZag(int n) {
        if(n==1) {
            System.out.print(111);
            return;
        }
        System.out.print(n);
        printZigZag(n-1);
        System.out.print(n);
        printZigZag(n-1);
        System.out.print(n);
    }
}
