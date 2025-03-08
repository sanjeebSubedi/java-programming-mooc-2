
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] words = input.split("\\s+");
            if (words[0].equals("add")) {
                firstContainer.add(Integer.valueOf(words[1]));
            }

            if (words[0].equals("move")) {
                int toMove = Integer.valueOf(words[1]);
                if (toMove > firstContainer.contains()) {
                    toMove = firstContainer.contains();
                }
                secondContainer.add(toMove);

                firstContainer.remove(toMove);
            }

            if (words[0].equals("remove")) {
                int toRemove = Integer.valueOf(words[1]);
                secondContainer.remove(toRemove);
            }

        }
    }

}
