package com.project.dao;

import com.project.common.utils.DateTimeUtils;
import com.project.common.utils.PropertiesReader;
import com.project.common.utils.JsonHandler;
import com.project.pojo.UserAccount;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class UserAccountDAO {

    private static final String USER_ACCOUNT = PropertiesReader.getProperty("UserFile");
    private static List<UserAccount> users = new ArrayList<>();

    static {
        loadUserData();
    }

    // test run
    public static void main(String[] args) {
        System.out.println(users.get(0));
    }

    /**
     * Get user account by username / email
     * @param account
     * @return user account
     */
    public UserAccount getUserAccount(String account) {
        for (UserAccount user:users) {
            if (user.getUsername().equals(account) || user.getEmail().equals(account)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Verify account and password
     * @param account
     * @param password
     * @return boolean
     */
    public Boolean verifyPassword(String account, String password) {
        for (UserAccount user: users) {
            if ((user.getUsername().equals(account) || user.getEmail().equals(account)) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    // Load user data
    private static void loadUserData() {

        JsonHandler userData = new JsonHandler();
        userData.encode(readFile(USER_ACCOUNT));

        for (int i=0; i<(userData.getAll().size()); i++) {
            JsonHandler obj = new JsonHandler();
            obj.setObject(userData.getObject(i));

            UserAccount ua = new UserAccount();
            ua.setUserId(obj.getInt("id"));
            ua.setUsername(obj.get("username"));
            ua.setFirstName(obj.get("first_name"));
            ua.setLastName(obj.get("last_name"));
            ua.setEmail(obj.get("email"));
            ua.setPassword(obj.get("password"));
            ua.setSecurityPhrase(obj.get("safeWord"));
            ua.setUpdatedAt(DateTimeUtils.formatDateTime(obj.get("updated_at")));
            ua.setCreatedAt(DateTimeUtils.formatDateTime(obj.get("created_at")));
            users.add(ua);
        }
    }

    // test store data (JSON)
    public static void updateUsername(Integer userId,  String name) {
        for (UserAccount user : users) {
            if (user.getUserId() == userId) {
                user.setUsername(name);

                // update into text file
                JsonHandler userJson = new JsonHandler();
                userJson.encode(readFile(USER_ACCOUNT));
                userJson.update(userId, "username", name);
            }
        }
    }









    private static String readFile(String filePath) {
        try {
            return new BufferedReader(new FileReader(filePath)).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
