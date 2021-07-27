package model;

public class FelidaeFamily extends Animal {

    String sound;

    public FelidaeFamily(int age, int weight, int running, String eating) {
        super(age, weight, running, eating);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
