package arrayQuestions;

import java.util.ArrayList;

public class Sum2Arrays {

    ArrayList<Integer> findSum(int arr1[], int arr2[]) {
        // code here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int maxLen = Math.max(n1, n2);
        int len = maxLen+1;
        int[] ans = new int[len];
        int carry = 0;
        while(n1>0 || n2>0 || carry>0){
            int d1 = n1>0 ? arr1[n1-1] : 0;
            int d2 = n2>0 ? arr2[n2-1]: 0;
            if(d1+d2+carry > 9){
                ans[len-1] = (d1+d2+carry)%10;
                carry = (d1+d2+carry)/10;
            }else{
                ans[len-1] = d1+d2+carry;
                carry=0;
            }
            n1--;n2--;len--;
        }
        ArrayList<Integer> finalAns = new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            if(i==0 && ans[i] ==0 ) continue;
            finalAns.add(ans[i]);
        }
        return finalAns;

    }
}
