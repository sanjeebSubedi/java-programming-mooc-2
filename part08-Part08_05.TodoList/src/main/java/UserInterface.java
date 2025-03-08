/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeeb
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            }
            if (command.equals("list")) {
                this.todoList.print();
            }
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(toRemove);
            }
            if (command.equals("stop")) {
                break;
            }
        }
    }
}
