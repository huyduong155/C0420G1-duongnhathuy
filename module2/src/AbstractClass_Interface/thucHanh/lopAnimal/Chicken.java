package AbstractClass_Interface.thucHanh.lopAnimal;

public class Chicken extends Animal {

    @Override
    public String makeSound() {
        return  "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "hấp lên rồi ăn";
    }
}
