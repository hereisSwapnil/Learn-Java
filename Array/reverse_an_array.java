import java.util.*;
public class reverse_an_array{
    public static void reverse(int numbers[]){
        int temp;
        int first = 0;
        int last = numbers.length - 1;
        while(first < last){
            temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        reverse(numbers);
        for(int i = 0; i<= numbers.length - 1; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}