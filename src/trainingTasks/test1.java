package trainingTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dog {
    int size, x;
    String breed;
    String name;

    void bark() {

        System.out.println("Bark");
    }
}
public class test1 {

    public static void main(String[] args) throws IOException {
        BufferedReader myNum = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the dog: ");

        Dog d = new Dog();
        d.size = Integer.parseInt(myNum.readLine());
//        d.size = 40;
        d.name = "Chack";
        d.bark();

        System.out.println("The size of your dog is - " + d.size);
        System.out.println("Its name is - " + d.name);
    }
}