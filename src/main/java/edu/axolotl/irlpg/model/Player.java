package edu.axolotl.irlpg.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Player {
    private String name;
    private SkillTree skillTree;
    private RewardTree rewardTree;
    private Map<String,Stat> stats;

    public Player(String name) {
        this.name = name;
        this.skillTree = new SkillTree();
        this.rewardTree = new RewardTree();
        this.stats = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }
}
