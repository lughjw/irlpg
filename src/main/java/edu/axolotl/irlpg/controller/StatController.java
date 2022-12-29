package edu.axolotl.irlpg.controller;

import edu.axolotl.irlpg.model.Stat;
import edu.axolotl.irlpg.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stat")
public class StatController {

    @Autowired
    private StatService statService;

    @GetMapping("{name}")
    public ResponseEntity<List<Stat>> findBy(@PathVariable String name) {
        return new ResponseEntity<>(statService.findBy(name), HttpStatus.OK);
    }
}
