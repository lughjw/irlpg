package edu.axolotl.irlpg.service;

import edu.axolotl.irlpg.model.Stat;
import edu.axolotl.irlpg.repository.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatServiceImpl implements StatService {

    @Autowired
    private StatRepository statRepository;

    @Override
    public List<Stat> findBy(String name) {
        return statRepository.findAllByName(name);
    }
}
