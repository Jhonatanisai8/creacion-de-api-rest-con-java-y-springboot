package com.jhonatan.services;

import com.jhonatan.dao.UserDao;
import com.jhonatan.models.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired // permite la inyección de dependencias para clases Java
    UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User get(long id) {
        return userDao.get(id);
    }

    public User register(User user) {
        return userDao.register(user);
    }

    public User update(User user) {
        return userDao.update(user);
    }

    public void delete(long id) {
        userDao.delete(id);
    }
}
