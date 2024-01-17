package com.example._14_thymeleaf;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    private UserService userService;

    @Autowired
    public HomeRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<?> getSearchResultViaAjax( UserForm userForm, BindingResult bindingResult) {
          if (bindingResult.hasErrors()) {
              //log
              System.out.println("Error");

                return ResponseEntity.badRequest().body(bindingResult.getFieldErrors());
          }
          return ResponseEntity.ok(userService.getUser(userForm));
    }
}
