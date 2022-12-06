package trainingTasks;

import java.util.LinkedList;

class SquareArea {
    private final LinkedList<Integer> sa;

    SquareArea(LinkedList<Integer> sa) {
        this.sa = sa;
    }

    int GetArea() {
        int s = 0;
        for (int i : sa) {
            if ((i < sa.element()) || (i > 0)) {
                s = i;
            }
        }
        return (int) Math.sqrt(s / 3.14);
    }
}

public class task7_58 {
    public static void main(String[] args) {
        LinkedList<Integer> sa = new LinkedList<>();

        sa.add(23);
        sa.add(12);
        sa.add(34);
        sa.add(17);

        SquareArea sq = new SquareArea(sa);

        System.out.println(sq.GetArea());
    }
}
