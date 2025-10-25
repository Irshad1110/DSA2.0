package twoDimensionalArray;

public class SearchInMatrix2 {

    //Search in row wise and column wise sorted matrix
    //Staircase search
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length-1;
        int i = 0;
        int j = col;
        while(i<row && j>=0){
            if(matrix[i][j] == target) return true;
            else if(target < matrix[i][j]) {
                j--;
            }else{
                i++;
            }
        }
        return false;

    }
}
