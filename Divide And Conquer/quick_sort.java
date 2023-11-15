public class quick_sort {

  public static int partition(int arr[], int lb, int ub) {
    int pivot = arr[lb];
    int start = lb;
    int end = ub;
    while (start < end) {
        while(arr[start] <= pivot){
            start++;
        }
        while(arr[end] > pivot){
            end--;
        }
        
    }
  }

  public static void quickSort(int arr[], int lb, int ub) {
    if (ub > lb) {
      int loc = partition(arr, lb, ub);
      quickSort(arr, lb, loc - 1);
      quickSort(arr, loc + 1, ub);
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 8, 2, 5 };

    printArr(arr);
  }
}
