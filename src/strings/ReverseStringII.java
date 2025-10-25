package strings;

public class ReverseStringII {

    //Given a string s and an integer k, reverse the first k characters for every 2k
    // characters counting from the start of the string.
    //If there are fewer than k characters left, reverse all of them. If there are
    // less than 2k but greater than or equal to k characters, then reverse the first k
    // characters and leave the other as original.

    public StringBuilder reverse(StringBuilder sb, int start, int end) {
        while(start<end){
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;end--;
        }
        return sb;
    }

    public String reverseStr(String s, int k) {
        int i = 0;
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        while(i<len){
            int j = i;
            int num = 0;
            while(j<len && num < k){
                j++;
                num++;
            }
            sb = reverse(sb, i, j-1);
            i = j+k;
        }
        return sb.toString();
    }
}
