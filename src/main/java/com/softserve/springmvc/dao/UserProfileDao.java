package com.softserve.springmvc.dao;

import java.util.List;
import com.softserve.springmvc.model.UserProfile;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}