package com.softserve.springmvc.service;

import java.util.List;
import com.softserve.springmvc.model.UserProfile;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();
}