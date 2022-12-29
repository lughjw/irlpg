package edu.axolotl.irlpg.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
//    private Integer value;
//    @ManyToOne
//    private Player player;
//    public Stat(String name) {
//        this.name = name;
//    }

//    public Integer getValue() {
//        return this.value;
//    }
//
//    public Integer increment() {
//        return ++this.value;
//    }
//
//    public Integer decrement() {
//        return --this.value;
//    }
}
