package twoDimensionalArray;

public class SearchInSortedMatrix {

    //search in sorted matrix
    //can do with staircase seach also but that would be O(n*logm)
    //this is log(m*n)
    //trick is to convert it into 1-d array logically, not actually.
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int lo = 0;
        int hi = row*col-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int rowMid = mid/col;
            int colMid = mid%col;
            if(target == matrix[rowMid][colMid]) return true;
            else if(target < matrix[rowMid][colMid]) hi = mid-1;
            else lo = mid + 1;
        }
        return false;
    }
}
