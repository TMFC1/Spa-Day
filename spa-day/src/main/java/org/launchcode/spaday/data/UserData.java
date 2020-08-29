package org.launchcode.spaday.data;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.launchcode.spaday.models.User;

public class UserData {
    
    private static final Map<Integer, User> users = new LinkedHashMap<>();

    public static void add(User user) {
        users.put(user.getID(), user);
    }

    public static Collection<User> getAll() {
        return users.values();
    }

    public static User getById(int id)
    {
        return users.get(id);
    }

    public static void clear() {
        users.clear();
    }

}