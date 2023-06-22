public class search_a_sorted_array {
    public static void main(String args[]) {
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 530;
        int i = 0;
        int j = arr.length-1;
        boolean found = false;
        while(!found && (i<arr.length && j<arr.length)){
            if(arr[i][j]>key){
                j--;
            }
            else if(arr[i][j]<key){
                i++;
            }
            else{
                found = true;
            }
        }
        if(found){
            System.out.println("Index found at "+i+" "+j);
        }else{
            System.out.println("Key not found");
        }
    }  
}
