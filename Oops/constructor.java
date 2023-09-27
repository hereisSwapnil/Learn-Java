public class constructor{
    public static void main(String args[]){
        Pen p1 = new Pen("Yellow", 9);
        System.out.println(p1.color + " " + p1.tip);
    }
}

class Pen{
    String color;
    int tip;

    Pen(String color, int tip){
        this.color = color;
        this.tip = tip;
    }
}