public class countingsort{
    public static void main(String args[]){
        int arr[] = {1,6,7,4,3,2};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
            System.out.println(largest);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}