package com.softserve.springmvc.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.springmvc.dao.UserProfileDao;
import com.softserve.springmvc.model.UserProfile;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{

    final UserProfileDao dao;

    public UserProfileServiceImpl(UserProfileDao dao) {
        this.dao = dao;
    }

    public UserProfile findById(int id) {
        return dao.findById(id);
    }

    public UserProfile findByType(String type){
        return dao.findByType(type);
    }

    public List<UserProfile> findAll() {
        return dao.findAll();
    }
}