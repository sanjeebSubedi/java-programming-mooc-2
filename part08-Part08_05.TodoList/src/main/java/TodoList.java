/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeeb
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void add(String task) {
        this.todos.add(task);
    }

    public void remove(int number) {
        this.todos.remove(number - 1);
    }

    public void print() {
        for (int i = 1; i <= this.todos.size(); i++) {
            System.out.println(i + ": " + this.todos.get(i - 1));
        }
    }
}
