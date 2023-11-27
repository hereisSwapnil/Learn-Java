import java.util.*;

public class reverseAStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index++));
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char c = s.pop();
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ABCDEFG";
        System.out.println(reverseString(str));
    }
}
