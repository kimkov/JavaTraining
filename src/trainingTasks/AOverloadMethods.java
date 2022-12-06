package trainingTasks;

/* В этой версии класса Box1 один объект допускается инициализировать другим объектом*/

class Box1 {
    double width;
    double height;
    double depth;

    // обратите внимание на этот конструктор. В качестве параметра в нем используется объект типа Box1
    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class AOverloadMethods {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myBox3 = new Box1(7);

        Box1 myClone = new Box1(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);

        vol = myBox3.volume();
        System.out.println(vol);

        vol = myClone.volume();
        System.out.println(vol);


    }
}
