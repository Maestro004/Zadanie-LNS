public class Programmer extends Person {
    private String Elevator;
    private int height;

    public Programmer(String name, String surName, String elevator, int height) {
        super(name, surName);
        Elevator = elevator;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "Elevator='" + Elevator + '\'' +
                ", height=" + height +
                '}';
    }
}
