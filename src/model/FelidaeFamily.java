package model;

public class FelidaeFamily extends Animal {

    static String sound = "meow";

    public FelidaeFamily(int age, int weight, int running, String eating) {
        super(age, weight, running, eating);
    }

    public String getSound() {
        return sound;
    }

}
