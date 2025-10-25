package strings;

public class CompressCharArray {

    public static void compress(char[] chars) {
        if (chars.length<2) return ;
        int i=0;
        int idx = 0;
        while(i<chars.length){
            char ch = chars[i];
            int count = 1;
            int j = i+1;
            while(j< chars.length && chars[j] == ch) {
                count++;
                j++;
            }
            chars[idx++] = chars[i];
            if(count>1) {
                String counts = "" + count;
                for(int k = 0;k<counts.length();k++){
                    chars[idx++] = counts.charAt(k);
                }
            }
            i = j;
        }
    }
}
