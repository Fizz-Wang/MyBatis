package Dao;

import impl.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    //select user by id
    User getUserByID(int id);

    //insert user
    int insertUser(User user);

    //update user
    int updateUser(User user);

    // delete user
    int deleteUserByID(int id);
}
