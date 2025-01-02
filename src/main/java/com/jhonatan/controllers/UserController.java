package com.jhonatan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/holaMundo", method = RequestMethod.GET)
    String holaMundo() {
        return "hola Mundo desde Spring";
    }
}
