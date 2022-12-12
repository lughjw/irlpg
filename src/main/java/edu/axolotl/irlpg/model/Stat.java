package edu.axolotl.irlpg.model;

public class Stat {
    private String name;
    private Integer value;
    public Stat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getValue() {
        return this.value;
    }

    public Integer increment() {
        return ++this.value;
    }

    public Integer decrement() {
        return --this.value;
    }
}
