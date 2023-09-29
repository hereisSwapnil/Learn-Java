public class inheritance{
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();
        a.breathe();
        Fish shark = new Fish();
        shark.breathe();
        shark.eat();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Fish extends Animal{
    int fin;
}