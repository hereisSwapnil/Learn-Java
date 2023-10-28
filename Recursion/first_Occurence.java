public class first_Occurence {

  public static int firstOccurence(int arr[], int i, int key) {
    if (arr[i] == key) {
      return i;
    }
    if (i == arr.length - 1) {
      return -1;
    }
    return firstOccurence(arr, i + 1, key);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 4, 7, 3, 8, 9 };
    System.out.println(firstOccurence(arr, 0, 1));
  }
}