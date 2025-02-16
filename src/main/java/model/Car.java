package model;

public class Car {
    private static final int MOVE_FORWARD_STANDARD = 4;
    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        if(randomNumber >= MOVE_FORWARD_STANDARD) position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
