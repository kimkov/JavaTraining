package trainingTasks;

class BoxIn2 {
    private final double width;
    private final double height;
    private final double depth;

    // сконструировать клон объекта
    BoxIn2(BoxIn2 br) { // передать объект конструктору
        width = br.width;
        height = br.height;
        depth = br.depth;
    }

    // конструктор, применяемый при указании всех размеров
    BoxIn2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствии размеров
    BoxIn2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применяемый при создании куба
    BoxIn2(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// Теперь в классе ВoxInWeight2 полностью реализованы все конструкторы
class BoxInWeight2 extends BoxIn2 {
    double weight;  // вес параллелепипеда

    // сконструировать клон объекта
    BoxInWeight2(BoxInWeight2 br) { // передать объект конструктору
        super(br);
        weight = br.weight;
    }

    // конструктор , применяемый при указании всех параметров
    BoxInWeight2(double w, double h, double d, double m) {
        super(w, h, d);     // вызвать конструктор из суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxInWeight2() {
        super();
        weight = -1;
    }

    // конструктор , применяемый при создании куба
    BoxInWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

public class ASimpleInheritanceSuper {
    public static void main(String[] args) {
        BoxInWeight2 myBox1 = new BoxInWeight2(10, 20, 15, 34.3);
        BoxInWeight2 myBox2 = new BoxInWeight2(2, 3, 4, 0.076);
        BoxInWeight2 myBox3 = new BoxInWeight2();
        BoxInWeight2 myCube = new BoxInWeight2(3, 2);
        BoxInWeight2 myClone = new BoxInWeight2(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Area of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Area of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Area of myBox3 is " + vol);
        System.out.println("Weight of myBox3 is " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Area of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Area of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();
    }
}
