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
        String query = "FROM User as u "; // query en formato que usa hibernate
        return entityManager.createNamedQuery(query).getResultList();
    }

    @Override
    public User get(long id) {
        return entityManager.find(User.class, id);//mapea el usuario
    }

    @Override
    public User register(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public void delete(long id) {
        User userBuscado = get(id);
        entityManager.remove(userBuscado);
    }

}
