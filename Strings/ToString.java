public class ToString {
    public static void main(String args[]){
        int a = 10;
        Integer b = 10;
        // a cannot be converted into string
        // System.out.println(a.toString());

        // b can be converted into string
        System.out.println(b.toString());

        // Every object can be converted into String if it is an Object
        // Like Integer not int
    }
}
