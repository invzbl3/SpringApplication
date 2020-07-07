package com.softserve.springmvc.dao;

import java.util.List;
import com.softserve.springmvc.model.User;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();
}