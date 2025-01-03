package com.jhonatan.dao.imp;

import com.jhonatan.dao.UserDao;
import com.jhonatan.models.User;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class UserImp implements UserDao {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<User> getAll() {
        return (List<User>) entityManager.createQuery("SELECT u FROM User u").getResultList();
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
        entityManager.merge(user);
        return user;
    }

    @Override
    public void delete(long id) {
        User userBuscado = get(id);
        entityManager.remove(userBuscado);
    }

}
