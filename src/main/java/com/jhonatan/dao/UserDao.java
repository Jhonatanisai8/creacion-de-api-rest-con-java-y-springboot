package com.jhonatan.dao;

import com.jhonatan.models.User;
import java.util.List;

public interface UserDao {

    //metodos a implementar
    List<User> getAll();

    User get(long id);

    User register(User user);

    User update(User user);

    void delete(long id);
}
