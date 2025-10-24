package twoDimensionalArray;

public class ExitPointOfMatrix {

    public int[] FindExitPoint(int n, int m, int[][] arr) {
        // code here
        int rowAns = 0;
        int colAns = 0;
        int dir = 0;
        while(rowAns >=0 && rowAns < n && colAns >=0 && colAns < m){
            if(arr[rowAns][colAns] == 1) {
                arr[rowAns][colAns] = 0;
                dir = (dir + 1)%4;
            }
            if(dir == 0){
                colAns++;
            }else if(dir == 1){
                rowAns++;
            }else if(dir == 2){
                colAns--;
            }else{
                rowAns--;
            }
        }
        if(rowAns <0) rowAns++;
        if(colAns<0) colAns++;
        if(rowAns>=n) rowAns--;
        if(colAns>=m) colAns--;
        return new int[]{rowAns, colAns};
    }
}
