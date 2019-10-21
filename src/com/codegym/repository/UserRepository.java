package com.codegym.repository;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> userList;

    static {
        userList = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Thao");
        u1.setAccount("thao94");
        u1.setPassword("thao123");
        userList.add(u1);

        User u2 = new User();
        u2.setAge(10);
        u2.setName("Haha");
        u2.setAccount("haha94");
        u2.setPassword("haha123");
        userList.add(u2);

        User u3 = new User();
        u3.setAge(10);
        u3.setName("Meo");
        u3.setAccount("meo94");
        u3.setPassword("meo123");
        userList.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User u : userList) {
            //
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
