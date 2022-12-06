package trainingTasks;

class BoxIn {
    double width;
    double height;
    double depth;

    BoxIn(BoxIn jn) {
        width = jn.width;
        height = jn.height;
        depth = jn.depth;
    }

    BoxIn(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxIn() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxIn(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxInWeight extends BoxIn {
    double weight;

    BoxInWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class ASimpleInheritance2 {
    public static void main(String[] args) {
        BoxInWeight myBox1 = new BoxInWeight(10, 20, 15, 34.3);
        BoxInWeight myBox2 = new BoxInWeight(2, 3, 4, 0.076);

        double vol;

        vol = myBox1.volume();
        System.out.println("Area of mybox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Area of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
    }
}