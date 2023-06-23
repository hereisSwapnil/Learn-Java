public class substring {
    public static String subString(String str, int start, int end){
        String subStr = "";
        for(int i = start; i<=end; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println("The Sub String is: "+ subString(str, 3, 4));
    }
}
