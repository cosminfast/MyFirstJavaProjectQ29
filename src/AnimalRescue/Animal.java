package AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void speak() ;

    public abstract void run() ;


}
