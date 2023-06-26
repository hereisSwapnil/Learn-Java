public class linear_search{
    public static int linear__search(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        int key = 10;
        System.out.println(linear__search(numbers, key));
    }
}