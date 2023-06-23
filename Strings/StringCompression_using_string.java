public class StringCompression_using_string {
    public static String strComp(String str){
        int count = 0;
        String temp = "";
        for(int i = 0; i<str.length(); i++){
            if(count == 0){
                char a = str.charAt(i);
                temp += a;
                count++;
            }else{
                if(temp.charAt(temp.length()-1) != str.charAt(i)){
                    temp += count;
                    count = 0;
                    char a = str.charAt(i);
                    temp += a;
                }
                count++;
                if(i == str.length()-1){
                    temp += count;
                }
            }
        }
        return temp;
    }
    public static void main(String args[]){
        String text = "aaabbccc";
        System.out.println(strComp(text));
    }
}
