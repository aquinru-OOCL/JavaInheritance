package model;

public class Animal {
    int age;
    int weight;
    int running;
    String eating;

    public Animal(int age, int weight, int running, String eating) {
        this.age = age;
        this.weight = weight;
        this.running = running;
        this.eating = eating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public String getEating() {
        return eating;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }

}
