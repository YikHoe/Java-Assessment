package com.project.service;

import com.project.common.constants.UserRoleType;
import com.project.pojo.UserAccount;
import com.project.pojo.UserAuthentication;

public interface UserAccountService {

    /**
     * Login Authentication
     * @param account
     * @param password
     * @return boolean result
     */
    public UserRoleType loginAuthentication(String account, String password);

    /**
     * Login Authentication
     * @param userAccount
     * @return boolean result
     */
    boolean updateProfile(UserAccount userAccount);

}
