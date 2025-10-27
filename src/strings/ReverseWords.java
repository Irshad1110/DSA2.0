package strings;

public class ReverseWords {


    //Example 1:
    //
    //Input: s = "the sky is blue"
    //Output: "blue is sky the"
    //Example 2:
    //
    //Input: s = "  hello world  "
    //Output: "world hello"
    //Explanation: Your reversed string should not contain leading or trailing spaces.
    //Example 3:
    //
    //Input: s = "a good   example"
    //Output: "example good a"

    //My Code
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int hi = s.length()-1;
        while(hi>=0){
            while(hi >=0 && s.charAt(hi) == ' '){
                hi--;
            }
            int lo = hi;
            while(lo>=0 && s.charAt(lo) != ' ') {
                lo--;
            }
            sb.append(s.substring(lo+1, hi+1));
            hi = lo;
            if(lo>=0){
                sb.append(' ');
            }
        }
        if(sb.charAt(sb.length()-1) == ' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }


    //Gurneet code
    public String reverseWordsGurneet(String s) {
        StringBuilder sb = new StringBuilder();
        int hi = s.length()-1;
        while(hi >=0 && s.charAt(hi) == ' '){
            hi--;
        }
        while(hi>=0){
//            while(hi >=0 && s.charAt(hi) == ' '){
//                hi--;
//            }
            int lo = hi-1;
            while(lo>=0 && s.charAt(lo) != ' ') {
                lo--;
            }
            sb.append(s.substring(lo+1, hi+1));

            while(lo >=0 && s.charAt(lo) == ' '){
                lo--;
            }
            hi = lo;
            if(lo>=0){
                sb.append(' ');
            }
        }
//        if(sb.charAt(sb.length()-1) == ' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

}
