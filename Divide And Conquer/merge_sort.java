public class merge_sort {

  public static void merge(int arr[], int start, int mid, int end) {
    int temp[] = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= end) {
      if (arr[i] <= arr[j]) {
        temp[k] = arr[i];
        k++;
        i++;
      } else {
        temp[k] = arr[j];
        k++;
        j++;
      }
    }

    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }
    while (j <= end) {
      temp[k] = arr[j];
      j++;
      k++;
    }

    for (j = 0; j < temp.length; j++) {
      arr[start + j] = temp[j];
    }
  }

  public static void mergeSort(int arr[], int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 8 };
    mergeSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
