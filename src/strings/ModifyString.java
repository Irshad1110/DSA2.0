package strings;

public class ModifyString {

    String modify(String s) {

        //Given a string s, the task is to change the complete string to
        // uppercase or lowercase depending on the case of the first character.
        boolean isLower = false;
        if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') isLower = true;

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            if(isLower && ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else if(!isLower && ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            } else{
                sb.append(ch);
            }
        }
        return sb.toString();


    }
}
