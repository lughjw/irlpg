package edu.axolotl.irlpg.model;

import java.util.Set;

public class Skill implements Resetable, Levelable {
    private static int MAX_EXPERIENCE = 12000;
    Set<Stat> associatedStats;
    String name;
    String description;
    int experience;
    int prestigeLevel;

    public Skill(String name, String description, Set<Stat> stats) {
        this.experience = 0;
        this.prestigeLevel = 0;
        this.name = name;
        this.description = description;
        this.associatedStats = stats;
    }

    @Override
    public void reset() {
        this.experience = 0;
        this.prestigeLevel = 0;
    }

    @Override
    public void levelUp() {
        this.prestigeLevel+=1;
        this.experience -= MAX_EXPERIENCE;
    }
}