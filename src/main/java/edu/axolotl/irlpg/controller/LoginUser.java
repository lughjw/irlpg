package edu.axolotl.irlpg.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginUser {
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
