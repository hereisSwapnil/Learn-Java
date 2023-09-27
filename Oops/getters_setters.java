public class getters_setters {

  public static void main(String args[]) {
    Pen swapnilPen = new Pen();
    swapnilPen.setColor("green");
    swapnilPen.setTip(7);
    System.out.println(swapnilPen.getColor());
    System.out.println(swapnilPen.getTip());
  }
}

class Pen {

  private String color;
  private int tip;

  // getter
  public String getColor() {
    return color;
  }

  public int getTip() {
    return tip;
  }

  // setter
  public void setColor(String newColor) {
    color = newColor;
  }

  public void setTip(int newTip) {
    tip = newTip;
  }
}
