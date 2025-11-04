package arrayQuestions;

public class MajorityElement {


    //Boyer Moore algorithm
    public int majorityElement(int[] nums) {
        int majorityElem = Integer.MIN_VALUE;
        int lead = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == majorityElem) {
                lead++;
            }else{
                if(lead == 0 ) {
                    majorityElem = nums[i];
                    lead=1;
                }else{
                    lead--;
                }

            }
        }
        return majorityElem;
    }
}
