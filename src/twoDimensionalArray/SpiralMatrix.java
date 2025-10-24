package twoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int fr = 0;
        int fc = 0;
        int lr = matrix.length - 1;
        int lc = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        int len = 0;
        int num = matrix.length * matrix[0].length;
        while (len != num) {
            int i = fc;
            while (i <= lc) {
                ans.add(matrix[fr][i]);
                len++;
                i++;
            }
            fr++;
            if (len == num) break;
            int j = fr;
            while (j <= lr) {
                ans.add(matrix[j][lc]);
                len++;
                j++;
            }
            lc--;
            if (len == num) break;
            int k = lc;
            while (k >= fc) {
                ans.add(matrix[lr][k]);
                len++;
                k--;
            }
            lr--;
            if (len == num) break;
            int p = lr;
            while (p >= fr) {
                ans.add(matrix[p][fc]);
                p--;
                len++;
            }
            fc++;

        }
        return ans;

    }
}
