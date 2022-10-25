package FreezyAce.Spring_311.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import FreezyAce.Spring_311.dao.DaoUser;
import FreezyAce.Spring_311.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final DaoUser daoUser;

    @Autowired
    public UserServiceImpl(DaoUser daoUser) {
        this.daoUser = daoUser;
    }

    @Transactional
    public User userById(long id){
        return daoUser.userById(id);
    }

    public List<User> getUser() {
        return daoUser.getUser();
    }

    @Transactional
    public void save(User user) {
        daoUser.save(user);
    }

    @Transactional
    public void deleteUser(long id) {
        daoUser.deleteUser(id);
    }

    @Transactional
    public void update(long id, User user) {
        daoUser.update(id, user);
    }

}
