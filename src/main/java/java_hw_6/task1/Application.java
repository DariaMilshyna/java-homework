package java_hw_6.task1;

public class Application {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();

        Fish fish = new Fish();
        fish.eat();
        fish.sleep();
        fish.swim();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}