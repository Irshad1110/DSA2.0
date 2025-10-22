package twoDimensionalArray;

public class MatrixMultiplication {

    public static void multiply(int A[][], int B[][], int C[][], int N) {
        // add code here.
        int cd = A[0].length;
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                for(int k = 0;k<cd;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
    }
}
