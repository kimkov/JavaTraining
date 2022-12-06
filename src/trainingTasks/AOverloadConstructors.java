package trainingTasks;

class BoxCons {
    double width;
    double height;
    double depth;

    BoxCons(BoxCons ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxCons(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxCons() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxCons(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class AOverloadConstructors {
    public static void main(String[] args) {
        BoxCons myBox1 = new BoxCons(10, 20, 15);
        BoxCons myBox2 = new BoxCons();
        BoxCons myCube = new BoxCons(7);
        BoxCons myClone = new BoxCons(myBox1);

        double vol;

        // получить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);

        // получить объем куба
        vol = myCube.volume();
        System.out.println("Объем куба = " + vol);

        // объем клона
        vol = myClone.volume();
        System.out.println("Объем клона = " + vol);
    }
}
