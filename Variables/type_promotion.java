public class type_promotion{
    public static void main(String args[]){
        /*
            Java promotes :
                1. byte
                2. short
                3. char 
            into int data type when evaluating
        */
        byte a = 3;
        short b = 5;
        char c = 'a';
        System.out.print(a+b+c);
        /*
            Java converts :
                1. long
                2. float
                3. double 
            into double data type when evaluating
        */ 
        long d = 30;
        float e = 23.5f;
        double f = 9.3;
        System.out.print(d+e+f);
    }
}