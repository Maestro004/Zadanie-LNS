public class Dancer extends Person {
    private int age;
    private String color;

    public Dancer(String name, String surName, int age, String color) {
        super(name, surName);
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
