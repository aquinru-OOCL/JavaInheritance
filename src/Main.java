import model.Animal;
import model.FelidaeFamily;
import model.Tiger;

public class Main {
    public static void main(String[] args) {

        Tiger tiger = new Tiger(5, 50, 120, "meat");
        tiger.setSound("meow");
        System.out.println("Age: " + tiger.getAge() + "yrs. old");
        System.out.println("Weight: " + tiger.getWeight() + "kgs.");
        System.out.println("Running: " + tiger.getRunning() + "mph");
        System.out.println("Eating: " + tiger.getEating());
        System.out.println("Sound: " + tiger.getSound());
    }
}
