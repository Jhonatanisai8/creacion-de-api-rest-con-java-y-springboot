package com.jhonatan.dao.imp;

import com.jhonatan.dao.UserDao;
import com.jhonatan.models.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserImp
        implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAll() {
        String query = "FROM User as u "; // query en formato que usa hibernate
        return entityManager.createNamedQuery(query).getResultList();
    }

    @Transactional
    @Override
    public User get(long id) {
        return entityManager.find(User.class, id);//mapea el usuario
    }

    @Transactional
    @Override
    public User register(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Transactional
    @Override
    public void delete(long id) {
        User userBuscado = get(id);
        entityManager.remove(userBuscado);
    }

}
