package trainingTasks;

class Stack {
    // создание стека в котором можно хранить до 10 целочисленных значений
    private int[] stck = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
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
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // разместить эти числа в стека
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("Содержимое стека myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
