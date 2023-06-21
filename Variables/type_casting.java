public class type_casting{
    public static void main(String args[]){
        // include f so that java does not take 4.2 as default double instead take it as float
        float a = 4.2f;
        // forcefully converting float to int by lossy conversions
        int b = (int) a;
        System.out.println(b);
        // narrowing conversion , explicit conversion
        // also
        // converting characters into numbers
        char ch = 'a';
        int c = ch;
        System.out.print(c); 
        // a - 97
        // b - 98
        // c - 99.....
    }
}