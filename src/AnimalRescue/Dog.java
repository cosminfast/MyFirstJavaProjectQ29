package AnimalRescue;

public class Dog extends Animal {


    public void tailWagging() {
        System.out.println("Wagging the tail");
    }

    public void bite() {
        System.out.println("they bite bad ppl");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }

    @Override
    public void run() {

    }
}
