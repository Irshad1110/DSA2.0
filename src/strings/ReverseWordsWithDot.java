package strings;

public class ReverseWordsWithDot {

    //Input: s = "i.like.this.program.very.much"
    //Output: "much.very.program.this.like.i"
    //Explanation: The words in the input string are reversed while maintaining the
    //dots as separators, resulting in "much.very.program.this.like.i".
    //Input: s = "..geeks..for.geeks."
    //Output: "geeks.for.geeks"
    //Explanation: After removing extra dots and reversing the whole string, the input string
    // becomes "geeks.for.geeks".
    //2830013014072
    public String reverseWords(String s) {
        // Code here
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i) == '.') {
                i--;
            }
            int j = i;
            while(j>=0 && s.charAt(j)!='.'){
                j--;
            }
            sb.append(s.substring(j+1, i+1));
            i=j;
            if(i>=0) sb.append('.');
        }
        if(sb.charAt(sb.length()-1) == '.') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
