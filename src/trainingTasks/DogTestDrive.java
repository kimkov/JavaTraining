package trainingTasks;

class Dog1 {
    int size;
    String breed;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("BARK! BARK!");
        } else if (size > 14) {
            System.out.println("Bark! Bark!");
        } else {
            System.out.println("bark bark");
        }
    }
}

public class DogTestDrive {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.size = 70;
        Dog1 s = new Dog1();
        s.size = 8;
        Dog1 r = new Dog1();
        r.size = 35;

        d.bark();
        s.bark();
        r.bark();
    }
}
