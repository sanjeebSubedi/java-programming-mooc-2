
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        System.out.println("Hello");
        list.print();
        list.remove(2);

        System.out.println();
        list.print();

        // Here you can try out the combined functionality of your classes
//        TodoList list = new TodoList();
//        Scanner scanner = new Scanner(System.in);
//
//        UserInterface ui = new UserInterface(list, scanner);
//        ui.start();
    }
}
