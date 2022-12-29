package edu.axolotl.irlpg.service;

import edu.axolotl.irlpg.model.Stat;

import java.util.List;

public interface StatService {
    List<Stat> findBy(String name);
}
