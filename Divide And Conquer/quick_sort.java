public class quick_sort {

  public static int partition(int arr[], int lb, int ub) {
    int pivot = arr[lb];
    int start = lb;
    int end = ub;
    while (start < end) {
        while (start <= ub && arr[start] <= pivot) {
            start++;
        }
        while (arr[end] > pivot) {
            end--;
        }
        if (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
    arr[lb] = arr[end];
    arr[end] = pivot;
    return end;
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
    quickSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
