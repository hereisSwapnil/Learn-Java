public class method_overriding{
    public static void main(String args[]){
        animal animal = new animal();
        dog dog_ = new dog();
        dog_.eat();
        animal.eat();
    }
}

class animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("Eats bone");
    }
}