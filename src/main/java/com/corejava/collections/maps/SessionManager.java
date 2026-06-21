package com.corejava.collections.maps;

import java.util.concurrent.ConcurrentHashMap;

public class SessionManager {

    private static ConcurrentHashMap<String,String> sessions =
            new ConcurrentHashMap<>();

    public static void login(String userId) {

        sessions.put(userId, "ACTIVE");

        System.out.println(userId + " Logged In");
    }

    public static void logout(String userId) {

        sessions.remove(userId);

        System.out.println(userId + " Logged Out");
    }

    public static void main(String[] args) {

        Thread t1 =
                new Thread(() -> login("USER1"));

        Thread t2 =
                new Thread(() -> login("USER2"));

        Thread t3 =
                new Thread(() -> logout("USER1"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(sessions);
    }
}