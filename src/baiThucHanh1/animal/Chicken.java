package baiThucHanh1.animal;

import baiThucHanh1.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck - cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
