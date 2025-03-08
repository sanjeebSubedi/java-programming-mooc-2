/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanjeeb
 */
public class Container {

    private int level;
    private int maxLevel;

    public Container() {
        this.level = 0;
        this.maxLevel = 100;
    }

    public int contains() {
        return level;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.level += amount;
        if (this.level > maxLevel) {
            this.level = maxLevel;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.level -= amount;
        if (this.level < 0) {
            this.level = 0;
        }
    }

    public String toString() {
        return this.level + "/100";
    }
}
