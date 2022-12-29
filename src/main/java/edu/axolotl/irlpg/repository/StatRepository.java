package edu.axolotl.irlpg.repository;

import edu.axolotl.irlpg.model.Stat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StatRepository extends JpaRepository<Stat,Integer> {
    List<Stat> findAllByName(String name);
}
