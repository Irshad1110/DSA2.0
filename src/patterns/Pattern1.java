package patterns;

public class Pattern1 {
    static void printPattern(int n) {
        // Input:
        //N = 5
        //Output:
        //* ** *** **** *****
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.print(" ");
        }
    }
}
