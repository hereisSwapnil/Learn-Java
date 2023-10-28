public class remove_duplicates {

  public static void removeDuplicates(
    String str,
    int index,
    StringBuilder newString,
    boolean map[]
  ) {
    if (index == str.length()) {
      System.out.println(newString);
      return;
    }
    char currentChar = str.charAt(index);
    if (currentChar == ' ') {
      removeDuplicates(str, index + 1, newString.append(currentChar), map);
    } else if (map[currentChar - 'a'] == true) {
      removeDuplicates(str, index + 1, newString, map);
    } else {
      map[currentChar - 'a'] = true;
      removeDuplicates(str, index + 1, newString.append(currentChar), map);
    }
  }

  public static void main(String[] args) {
    String str = "appnna college";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
  }
}
