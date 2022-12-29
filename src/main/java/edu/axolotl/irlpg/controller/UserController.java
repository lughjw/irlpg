package edu.axolotl.irlpg.controller;

import edu.axolotl.irlpg.model.User;
import edu.axolotl.irlpg.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("home")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("I'm home!",HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity<Integer> login(@Valid @RequestBody LoginUser loginUser) {
        return new ResponseEntity<>(userService.login(loginUser.getEmail(),loginUser.getPassword()),HttpStatus.OK);
    }

    @GetMapping("user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }
}
