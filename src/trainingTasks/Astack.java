package trainingTasks;

class SStack {
    // создание стека в котором можно хранить до 10 целочисленных значений
    private int[] stck = new int[10];
    private int tos;

    // инициализировать вершину стека
    SStack(int i) {
        tos = -1;
    }

    // разместить вершину в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }
    // извлечение элемента из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

public class Astack {
    public static void main(String[] args) {
        SStack myStack1 = new SStack(10);
        SStack myStack2 = new SStack(20);

        // разместить эти числа в стека
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        
        System.out.println(" ");

        System.out.println("Содержимое стека myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
