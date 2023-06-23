public class Lexicographically_largest_string {
    public static void main(String args[]){
        String arr[] = {"banana", "mango", "apple"};
        String largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest.compareTo(arr[i])<0){
                largest = arr[i];
            }
        }
        // Also to ignore UPPER & lower case we use largest.compareToIgnoreCase(arr[i])
        System.out.println("The Lexicographically largest string is: "+largest);
    }
}
