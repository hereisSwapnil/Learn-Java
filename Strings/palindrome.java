public class palindrome {
    public static void main(String args[]){
        String text = "naman";
        boolean isPalindrome = true;
        for(int i = 0; i<text.length()/2; i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
