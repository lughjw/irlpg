package edu.axolotl.irlpg.service;

import edu.axolotl.irlpg.model.User;

public interface UserService {
    User findByEmail(String email);
    Integer login(String email, String password);
    User findByName(String name);
    User findById(Integer id);
}
