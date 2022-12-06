package trainingTasks;

class Pet {
    private final String name;
    private final String type;
    private final Double weight;
    private final Double height;
    private final Integer age;

    Pet(Pet nm) {
        name = nm.name;
        weight = nm.weight;
        height = nm.height;
        type = nm.type;
        age = nm.age;
    }

    Pet(String n, Double w, Double h, String t, int a) {
        name = n;
        weight = w;
        height = h;
        type = t;
        age = a;
    }

    int Ages() {
        return age * 12;
    }

    String BigOrNot() {
        if (height < 30) {
            return "This is small dog";
        }
        return "This is a big dog";
    }
}

class DogRotW extends Pet {
    String sex;

    DogRotW(DogRotW rt) {
        super(rt);
        sex = rt.sex;
    }

    DogRotW(String n, Double w, Double h, String t, int a, String s) {
        super(n, w, h, t, a);
        sex = s;
    }
}

public class AInheritanceExample {
    public static void main(String[] args) {
        DogRotW dt = new DogRotW("Red", 40.4, 15.7, "Dog", 4, "Male");

        System.out.println("Age of the dog is " + dt.Ages());
        System.out.println("sex of this dog is " + dt.sex);
        System.out.println("Height of the dog is " + dt.BigOrNot());
    }
}
