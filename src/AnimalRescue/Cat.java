package AnimalRescue;

public abstract class Cat extends Animal{

    private String name;
    private int age;

//    Cat(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    Cat() {
//        System.out.println("Created!");
//    }

    public void tailWagging() {
        System.out.println("Wagging the tail");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("eats dry and wet food");
    }




    @Override
    public void run() {

    }

    public abstract void purr();


    public void setAge(int age) {
        this.age = age;
    }
}
