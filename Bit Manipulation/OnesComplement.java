public class OnesComplement {
    public static void main(String args[]){
        // Binary OR - ~
        // ~ 0 - 1
        // ~ 1 - 0
        
        // But in computers 1 is stored as 
        // 00001
        // ones complement - 11110
        // due to MSB be 1 means number to be negative
        // Takes twos complement and add 1 to it
        // 00001
        //    +1
        // ------
        // 00010 to decimal = -2
        System.out.println(~0);
        System.out.println(~1);
    }    
}
