package com.jhonatan.controllers;

import com.jhonatan.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //trae todos los usuarios
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll() {
        List<User> listaUsuarios = new ArrayList<>();
        User user = new User(1, "David", "Palacios", "David@gmail.com", "234234", new Date());
        listaUsuarios.add(user);
        return listaUsuarios;
    }

}
