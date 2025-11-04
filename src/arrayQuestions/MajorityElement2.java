package arrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {


    public List<Integer> majorityElement(int[] nums) {
        int maj1 = Integer.MIN_VALUE;
        int maj2 = Integer.MIN_VALUE;
        int lead1 = 0;
        int lead2 = 0;
        for(int val : nums) {
            if(val == maj1) {
                lead1++;
            } else if(val == maj2){
                lead2++;
            } else if(lead1 == 0){
                maj1 = val;
                lead1 = 1;
            } else if(lead2 == 0) {
                maj2 = val;
                lead2 = 1;
            } else {
                lead1--;
                lead2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int count = nums.length / 3;
        int freq1 = 0;
        int freq2 = 0;
        for(int val : nums){
            if(val == maj1) freq1++;
            else if(val == maj2) freq2++;
        }
        if(freq1 > count) ans.add(maj1);
        if(freq2 > count) ans.add(maj2);
        return ans;
    }
}
