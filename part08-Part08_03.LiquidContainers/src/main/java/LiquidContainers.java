
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] words = input.split("\\s+");
            if (words[0].equals("add") && Integer.valueOf(words[1]) > 0) {
                firstContainer += Integer.valueOf(words[1]);
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }

            if (words[0].equals("move")) {
                int toMove = Integer.valueOf(words[1]);
                if (toMove < 0) {
                    continue;
                }
                if (toMove > firstContainer) {
                    toMove = firstContainer;
                }
                secondContainer += toMove;
                if (secondContainer > 100) {
                    secondContainer = 100;
                }
                firstContainer -= toMove;
            }

            if (words[0].equals("remove")) {
                int toRemove = Integer.valueOf(words[1]);
                if (toRemove < 0) {
                    continue;
                }
                if (toRemove > secondContainer) {
                    toRemove = secondContainer;
                }
                secondContainer -= toRemove;
            }

        }
    }

}
