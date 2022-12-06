package trainingTasks;

class Dist {
    int distance;

    int result() {
        return distance / 100;
    }
}

public class task2_1 {

    public static void main(String[] args) {
       Dist x = new Dist();

       x.distance = 299;


       System.out.println(x.distance);
       System.out.println(x.result());
    }
}
