package edu.axolotl.irlpg.model;

import jakarta.persistence.Entity;

import java.util.*;

public class Player {
    private String name;
    private SkillTree skillTree;
    private RewardTree rewardTree;
    private List<Stat> stats;

    public Player(String name) {
        this.name = name;
        this.skillTree = new SkillTree();
        this.rewardTree = new RewardTree();
        this.stats = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
}
