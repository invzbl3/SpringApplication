package com.softserve.springmvc.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.softserve.springmvc.model.UserProfile;
import com.softserve.springmvc.service.UserProfileService;

/**
 * @author invzbl3 on 07.07.2020.
 * @project SpringApplication
 */

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile>{

    static final Logger logger = LoggerFactory.getLogger(RoleToUserProfileConverter.class);

    final UserProfileService userProfileService;

    public RoleToUserProfileConverter(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    /**
     * Gets UserProfile by Id
     */
    public UserProfile convert(Object element) {
        int id = Integer.parseInt((String)element);
        UserProfile profile= userProfileService.findById(id);
        logger.info("Profile : {}",profile);
        return profile;
    }
}