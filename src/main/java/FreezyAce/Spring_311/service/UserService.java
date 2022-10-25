package FreezyAce.Spring_311.service;

import FreezyAce.Spring_311.model.User;

import java.util.List;

public interface UserService {
    User userById(long id);

    List<User> getUser();

    void save(User user);

    void deleteUser(long id);

    void update(long id, User updateUser);
}
