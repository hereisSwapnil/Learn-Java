public class Equalling_Strings {
    public static void main(String args[]){
        // declaring string 1
        String a = "Tony";
        // String b = "Tony";
        String c = new String("Tony");
        // String  a and b will have same architecture
        // but c will have different
        if(a.equals(c)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }

    }
}
