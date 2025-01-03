package com.jhonatan.dao.imp;

import com.jhonatan.dao.UserDao;
import com.jhonatan.models.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserImp
        implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User get(long id) {
        return entityManager.find(User.class, id);//mapea el usuario
    }

    @Override
    public User register(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
