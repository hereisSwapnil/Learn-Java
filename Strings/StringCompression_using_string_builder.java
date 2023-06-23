public class StringCompression_using_string_builder {
    public static StringBuilder StrComp(StringBuilder str){
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(count == 0){
                sb.append(str.charAt(i));
                count++;
            }else{
                if((sb.toString().charAt(sb.length()-1)) != str.charAt(i)){
                    sb.append(count);
                    count = 0;
                    sb.append(str.charAt(i));
                }
                count++;
                if(i == str.length()-1){
                    sb.append(count);
                }
            }
        }
        return sb;
    }
    public static void main(String args[]){
        StringBuilder text = new StringBuilder("aaabbccc");
        System.out.println(StrComp(text));
    }
}
