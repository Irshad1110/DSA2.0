package sorting.countSort;

import java.util.ArrayList;

public class FrequencySortString {

    public static String frequencySort(String s) {
        //Basically logical index and actual index are same in ascii value of the character
        int max=127, min = 0;
        int[] freq = new int[max-min+1];
        for(int i=0;i<s.length();i++){
            int ch = (int)s.charAt(i);
            freq[ch]++;
        }

        ArrayList<Character>[] buckets = new ArrayList[s.length()+1];
        for(int i = 0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i=0;i<freq.length;i++){
            int count = freq[i];
            char ch = (char)i;
            buckets[count].add(ch);
        }
        StringBuilder ans = new StringBuilder("");

        for(int i=buckets.length-1;i>0;i--){
            for(char ch : buckets[i]){
                for(int j=0;j<i;j++){
                    ans.append(ch);
                }
            }

        }
        return ans.toString();

    }
}
