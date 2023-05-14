public class selectionsort{
    public static void main(String args[]){
        int arr[] = {4,7,9,1,3,0};
        for(int i = 0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}