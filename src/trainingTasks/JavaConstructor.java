package trainingTasks;

class BoxConstructor {
    double width;
    double height;
    double depth;

    // Коструктор класса. Использование служебного слова This тут избыточно
    BoxConstructor(double w, double h, double d) {
        this.width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class JavaConstructor {
    public static void main(String[] args) {
        BoxConstructor myBox1 = new BoxConstructor(10, 20, 15);
        BoxConstructor myBox2 = new BoxConstructor(3, 6, 9);

        double vol;

        vol = myBox1.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);
    }
}
