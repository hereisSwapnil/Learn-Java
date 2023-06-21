public class largest_of_three_numbers{
    public static void main(String argss[]){
        int a = 5;
        int b = 10;
        int c = 3;
        int max = a;
        if(b>max){
            max = b;
        }if(c>max){
            max = c;
        }
        System.out.println("Largest number out of three numbers is : "+ max);
    }
}