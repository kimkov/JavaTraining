package trainingTasks;

class BooksFunc {
    String title;
    String author;
}

public class booksTest {
    public static void main(String[] args) {

        BooksFunc[] myBooks = new BooksFunc[3];
        int x = 0;
        myBooks[0] = new BooksFunc();
        myBooks[1] = new BooksFunc();
        myBooks[2] = new BooksFunc();
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов по Java";
        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Yan";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x += 1;
        }
    }
}
