package FreezyAce.Spring_311.dao;

import org.springframework.stereotype.Repository;
import FreezyAce.Spring_311.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DaoUserImpl implements DaoUser {

    @PersistenceContext
    private EntityManager entityManager;

    public User userById(long id){
        return entityManager.find(User.class, id);
    }
    public List<User> getUser() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    public void save(User user) {
        entityManager.persist(user);
    }

    public void deleteUser(long id) {
       entityManager.remove(userById(id));
    }

    public void update(long id, User updateUser) {
        User userUpdated = userById(id);

        userUpdated.setName(updateUser.getName());
        userUpdated.setLastName(updateUser.getLastName());
        userUpdated.setEmail(updateUser.getEmail());
        userUpdated.setAge(updateUser.getAge());
    }

}
