package repository;

import dto.User;

public interface UserRepository {
    public User register(User user);
    public String findByName(String name);

}
