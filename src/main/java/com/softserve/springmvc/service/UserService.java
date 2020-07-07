package com.softserve.springmvc.service;

import java.util.List;
import com.softserve.springmvc.model.User;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

public interface UserService {

    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);
}
