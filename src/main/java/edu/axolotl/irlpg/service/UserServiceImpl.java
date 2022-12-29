package edu.axolotl.irlpg.service;

import edu.axolotl.irlpg.model.User;
import edu.axolotl.irlpg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public Integer login(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password).orElseThrow().getId();
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name).orElseThrow();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow();
    }
}
