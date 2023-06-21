public class bubblesort{
    public static void main(String args[]){
        int arr[] = {6,2,5,8,4,1};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i; j++){
                if(j != arr.length-1){
                    if(arr [j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}