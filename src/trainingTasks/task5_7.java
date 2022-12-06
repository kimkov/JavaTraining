package trainingTasks;

public class task5_7 {

    public static void costItems() {
        int i;
        double cost;
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        for (i = 1; i <= 20; i++) {
            cost = i * 20.4;

            System.out.println("The cost of " + i + " Items is - " + df.format(cost));
        }
    }

    public static void main(String[] args) {
        costItems();
    }
}
