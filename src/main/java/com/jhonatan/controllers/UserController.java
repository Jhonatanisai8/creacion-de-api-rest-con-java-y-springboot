package com.jhonatan.controllers;

import com.jhonatan.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id) {
        User user = new User(1, "David", "Palacios", "David@gmail.com", "234234", new Date());
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user) {
        //todo: registrarlo en la base de datos 
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    User update(@RequestBody User user) {
        //todo: actualizarlo en la base de datos
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        //eliminarlo de la base de datos
        User user = new User(1, "David", "Palacios", "David@gmail.com", "234234", new Date());
    }
}
