package strings;

public class ReverseStringII {

    //Given a string s and an integer k, reverse the first k characters for every 2k
    // characters counting from the start of the string.
    //If there are fewer than k characters left, reverse all of them. If there are
    // less than 2k but greater than or equal to k characters, then reverse the first k
    // characters and leave the other as original.

    public String reverseStr(String s, int k) {
        int i = 0;
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        while(i<len){
            int hi = Math.min(i + k, len) - 1;
            int lo = i ;
            while(lo<hi){
                char temp = sb.charAt(lo);
                sb.setCharAt(lo, sb.charAt(hi));
                sb.setCharAt(hi, temp);
                lo++;hi--;
            }
            i = i+2*k;
        }
        return sb.toString();
    }
}
