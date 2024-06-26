package com.example.bigstarcollectibles.controllers;

import com.example.bigstarcollectibles.beans.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

  @GetMapping("/newUser")
  public String displayRegistrationForm(Model model) {
    model.addAttribute("user", new User());
    return "register-user";
  }

  @PostMapping("/saveUser")
  public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
    return "register-user";
  }
}