public class pen_object {

  public static void main(String args[]) {
    pen pen_1 = new pen();
    pen_1.setColor("green");
    pen_1.setTip(5);
    // pen_1.color = "green";
    // pen_1.tip = 7;
    System.out.println(pen_1.color);
  }
}

class pen {

  String color;
  int tip;

  void setColor(String newColor) {
    color = newColor;
  }

  void setTip(int newTip) {
    tip = newTip;
  }
}